package com.example.td6;

import java.util.List;

public class Results {
    private List<Repo> items;

    //constructeur
    public Results(List<Repo> items){
        this.items=items;
    }

//getters & setters à générer avec android studio

    public List<Repo> getItems() {
        return items;
    }

    public void setItems(List<Repo> items) {
        this.items = items;
    }
}

