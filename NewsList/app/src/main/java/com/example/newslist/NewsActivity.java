package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());


    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }

    public void lancerDetails(View view) {
        Intent intentDetails = new Intent(this, DetailsActivity.class);
        startActivity(intentDetails);
    }

    public void lancerLogout(View view) {
        Intent intentLogin = new Intent(this, LoginActivity.class);
        startActivity(intentLogin);
        finish();
    }
}