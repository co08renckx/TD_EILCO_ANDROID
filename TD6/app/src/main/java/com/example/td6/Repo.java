package com.example.td6;

public class Repo {
    private String id;
    private String name;
    private String full_name;
    private String html_url;

    //constructeur
    public Repo(String id,String name, String full_name, String html_url){
        this.id=id;
        this.name=name;
        this.full_name=full_name;
        this.html_url=html_url;
    }

//getters & setters à générer avec android studio

    //getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return full_name;
    }

    public String getHtml_url() {
        return html_url;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.full_name = fullName;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}

