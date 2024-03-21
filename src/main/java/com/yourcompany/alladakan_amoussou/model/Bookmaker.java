package com.yourcompany.alladakan_amoussou.model;

import javax.persistence.*;

@Entity
public class Bookmaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String nom;

    private String prenom;

    private String password;

    // Constructeurs, getters et setters

    public Bookmaker() {
    }

    // Méthode pour proposer un événement
    public void proposerEvenement() {
        // Implémenter la logique pour proposer un événement
    }

    // Méthode pour définir les paramètres
    public void definirParametres() {
        // Implémenter la logique pour définir les paramètres
    }

    // Méthode pour mettre à jour les cotes
    public void miseAJourCote(EvenementSportif evenement, int typePari, String resultatPari) {
        // Implémenter la logique pour mettre à jour les cotes
    }

    // Getters et setters

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
}
