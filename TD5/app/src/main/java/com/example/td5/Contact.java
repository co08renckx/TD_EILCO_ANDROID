package com.example.td5;

public class Contact {

    private String nom;
    private String prenom;
    private String imageUrl;

    public Contact(String prenom, String nom ,String imageUrl){
        this.nom=nom;
        this.prenom=prenom;
        this.imageUrl=imageUrl;
    }

    public String getmFirstName() {
        return prenom;
    }

    public String getmLastName() {
        return nom;
    }

    public String getImageUrl(){
        return imageUrl;
    }
}
