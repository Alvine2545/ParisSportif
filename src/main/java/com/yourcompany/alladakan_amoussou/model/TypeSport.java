package com.yourcompany.alladakan_amoussou.model;

import javax.persistence.*;

@Entity
public class TypeSport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String description;

    // Constructeurs, getters et setters

    public TypeSport() {
    }

    public TypeSport(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    // Ajoutez ici les autres attributs, getters et setters si nécessaire

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
