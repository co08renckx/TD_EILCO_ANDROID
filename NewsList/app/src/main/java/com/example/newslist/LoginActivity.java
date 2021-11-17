package com.example.newslist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setTitle(getLocalClassName());
    }

    public void lancerLogin(View view) {
        Intent intentLogin = new Intent(this, NewsActivity.class);
        startActivity(intentLogin);
        this.finish();
    }
}
