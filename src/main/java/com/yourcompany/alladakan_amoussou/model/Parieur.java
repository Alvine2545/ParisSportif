package com.yourcompany.alladakan_amoussou.model;

import javax.persistence.*;

@Entity
public class Parieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String nom;

    private String prenom;

    private String password;

    private long jetons;

    private int capitalInitial;

    private long mise;

    // Constructeurs, getters et setters

    public Parieur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getJetons() {
        return jetons;
    }

    public void setJetons(long jetons) {
        this.jetons = jetons;
    }

    public int getCapitalInitial() {
        return capitalInitial;
    }

    public void setCapitalInitial(int capitalInitial) {
        this.capitalInitial = capitalInitial;
    }

    public long getMise() {
        return mise;
    }

    public void setMise(long mise) {
        this.mise = mise;
    }
}
