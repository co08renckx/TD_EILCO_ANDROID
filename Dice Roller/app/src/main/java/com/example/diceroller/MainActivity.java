package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lancer = (Button) findViewById(R.id.BoutonLancer);
    }

    public void lancer(View v) {
        int face;

        //la recupération du nbr de face
        EditText nbrFace = (EditText) findViewById (R.id.nbrFace);
        String text_Face = nbrFace.getText().toString();
        if(text_Face.isEmpty()){
            face=6;
        }
        else{
            face= Integer.parseInt(text_Face);
        }


        Toast.makeText(this, "Dé lancé !",Toast.LENGTH_SHORT).show();

        String resultatText1;
        String resultatText2;

        //le random
        int resultat1 = (int) (Math.random() * face) + 1;
        int resultat2 = (int) (Math.random() * face) + 1;

        TextView TVresult1 = findViewById(R.id.textView);
        TextView TVresult2 = findViewById(R.id.textView2);

        if(resultat1==2){
             resultatText1 = "Le 2 !!!!!!!!!!";
        }
        else{
            resultatText1 = String.valueOf(resultat1);
        }
        if(resultat2==2){
            resultatText2 = "Le 2 !!!!!!!!!!";
        }
        else{
            resultatText2 = String.valueOf(resultat2);
        }


        TVresult1.setText(resultatText1);
        TVresult2.setText(resultatText2);
    }
}