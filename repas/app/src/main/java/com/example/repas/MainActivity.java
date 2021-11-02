package com.example.repas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entree;
    EditText plat;

    boolean fromage;
    boolean fruit;

    String periodeRepas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button valider = (Button) findViewById(R.id.valider);
        Button annuler = (Button) findViewById(R.id.annuler);

    }

    public void validation(View v){
        //l'entree
        entree = (EditText) findViewById (R.id.entree);
        String text_entree = entree.getText().toString();

        //le plat
        plat = (EditText) findViewById (R.id.plat);
        String text_plat = plat.getText().toString();

        TextView resumeRepas = (TextView) findViewById(R.id.resumeRepas);
        resumeRepas.setText("Vous avez mangé "+text_entree+" et "+text_plat);

        //fromage et/ou fruit
        RadioButton buttonfromage = findViewById(R.id.fromage);
        fromage = buttonfromage.isChecked();

        RadioButton buttonfruit = findViewById(R.id.fruit);
        fruit = buttonfruit.isChecked();

        if(fromage){
            resumeRepas.setText(resumeRepas.getText()+", vous avez pris du fromage");
        }

        if(fruit){
            resumeRepas.setText(resumeRepas.getText()+", vous avez pris un fruit");
        }

        //repas du midi ou du soir ?
        RadioGroup rg=(RadioGroup)findViewById(R.id.groupButton);
        periodeRepas = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        resumeRepas.setText(resumeRepas.getText()+" et vous avez mangé le "+periodeRepas);
    }

    public void annulation(View v){
        entree = (EditText) findViewById (R.id.entree);
        entree.getText().clear();

        //le plat
        plat = (EditText) findViewById (R.id.plat);
        plat.getText().clear();

        TextView resumeRepas = (TextView) findViewById(R.id.resumeRepas);
        resumeRepas.setText("");

        //fromage et/ou fruit
        RadioButton buttonfromage = findViewById(R.id.fromage);
        buttonfromage.setChecked(false);

        RadioButton buttonfruit = findViewById(R.id.fruit);
        buttonfruit.setChecked(false);

        //repas du midi ou du soir ?
        RadioButton buttonmidi = findViewById(R.id.midi);
        buttonmidi.setChecked(false);

        RadioButton buttonsoir = findViewById(R.id.soir);
        buttonsoir.setChecked(false);

    }


}