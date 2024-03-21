package com.yourcompany.alladakan_amoussou.model;

import javax.persistence.*;

@Entity
public class EvenementSportif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    // Constructeurs, getters et setters

    public EvenementSportif() {
    }

    public EvenementSportif(String description) {
        this.description = description;
    }

    // Ajoutez ici les autres attributs, getters et setters si nécessaire

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
