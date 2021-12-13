package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creation du service github
        GithubService service = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);


        //1er appel vers le user co08renckx (corentin helinckx)
        service.listRepos("co08renckx").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response)
            {
                afficherRepos(response.body());

            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                }

        });


    }

    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots de co08renckx : "+repos.size(),
                Toast.LENGTH_SHORT).show();
    }

    public void validation(View view) {
        //le nom à recup
        EditText repo_name = (EditText) findViewById (R.id.ETnomrepos);
        String nom = repo_name.getText().toString();

        Intent intentListeRepos = new Intent(this, ListeReposActivity.class);
        intentListeRepos.putExtra("nomRepo",nom);
        startActivity(intentListeRepos);
        //this.finish();
    }
}



