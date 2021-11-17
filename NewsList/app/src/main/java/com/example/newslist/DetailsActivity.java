package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Intent intentNews = new Intent(this, NewsActivity.class);
        startActivity(intentNews);
    }

    public void lancerOk(View view) {
        Intent intentNews = new Intent(this, NewsActivity.class);
        startActivity(intentNews);
    }
}