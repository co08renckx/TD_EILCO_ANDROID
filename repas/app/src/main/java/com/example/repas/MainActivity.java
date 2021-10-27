package com.example.repas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //le 1
        EditText editText = (EditText)  this.findViewById(R.id.entree);
        editText.setText("New Text");
        String text = editText.getText().toString();


        //le 2
        EditText editText2 = (EditText)  this.findViewById(R.id.plat);
        editText2.setText("New Text");
        String text2 = editText2.getText().toString();
    }
}