package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListeReposActivity extends AppCompatActivity {

    private List<Repo> repos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_repos);

        //recupération du nom
        Intent intent=getIntent();
        String nomRepo = intent.getStringExtra("nomRepo");

        //test du nom de repo récupéré
        Toast.makeText(this,"nom du repo : "+nomRepo, Toast.LENGTH_SHORT).show();


        //on récupére le recyclerView
        RecyclerView rvRepos = (RecyclerView) findViewById(R.id.rvRepos);

        //type de LayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        //creation du service github
        GithubService service2 = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        //appel vers le nom du repo
        service2.searchRepos(nomRepo).enqueue(new Callback<Results>() {

            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                //Log.d("test",response.body().getItems().get(1).getName());
                for (Repo repo : response.body().getItems()) {
                    repos.add(new Repo(repo.getId(),repo.getName(),repo.getFullName(),repo.getHtml_url()));
                }
                //adapteur et initialisation
                RepoAdapter adapter = new RepoAdapter(repos);

                //on indique l'adapter au recycler
                rvRepos.setAdapter(adapter);

                rvRepos.setLayoutManager(linearLayoutManager);
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                plantage();
            }
        });








    }

    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots : "+ repos.size(),
                Toast.LENGTH_SHORT).show();
    }
    public void plantage() {
        Toast.makeText(this,"ca plante: ",
                Toast.LENGTH_SHORT).show();
    }

}