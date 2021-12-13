package com.example.td5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //on récupére le recyclerView
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        //Initialisation
        contacts.add(new Contact("Jean", "Pierre", "https://th.bing.com/th/id/OIP.y2DgA63r7nUIK4bqEJ7FlAHaJ4?w=158&h=212&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Jeanne", "D'arc","https://th.bing.com/th/id/OIP.S2bnSB25K5wejoRo_qh7mQHaJ4?w=119&h=180&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Pierre", "Menez", "https://th.bing.com/th/id/OIP.jiEb0N_DEdGXVQAADzZBdwHaDy?w=330&h=178&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Arthur", "Rimbaut", "https://th.bing.com/th/id/OIP.lhGMpi5pwKvV7TUHvdgSUgDDEs?w=141&h=217&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Richard", "Coeur de lion", "https://th.bing.com/th/id/OIP.c5ZbuJXW15vvjPgoUCPqiwHaHa?w=218&h=218&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Zinedine", "Zidane", "https://th.bing.com/th/id/OIP.JbYKN_xSaJGpA94mbP_BygHaHK?w=210&h=203&c=7&r=0&o=5&pid=1.7"));
        contacts.add(new Contact("Yannick", "Noah", "https://th.bing.com/th/id/OIP.ypgsWqYgZGPmSj-L0LMUkgHaKq?w=130&h=187&c=7&r=0&o=5&pid=1.7"));

        //adapteur et initialisation
        ContactAdapter adapter = new ContactAdapter(contacts);

        //on indique l'adapter au recycler
        rvContacts.setAdapter(adapter);

        //type de LayoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvContacts.setLayoutManager(linearLayoutManager);

    }
}