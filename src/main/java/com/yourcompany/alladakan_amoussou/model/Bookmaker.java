package com.yourcompany.alladakan_amoussou.model;

import javax.persistence.*;

@Entity
public class Bookmaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Ajoutez ici les autres attributs de la classe Bookmaker si nécessaire

    // Constructeurs, getters et setters

    public Bookmaker() {
    }

    // Ajoutez ici les autres constructeurs si nécessaire

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Ajoutez ici les autres getters et setters si nécessaire
}
