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

    // Méthode pour se connecter
    public boolean login(String email, String password) {
        // Implémenter la logique de connexion
        return false; // Retourner vrai si la connexion est réussie, faux sinon
    }

    // Méthode pour placer un pari
    public boolean parier(int montant, EvenementSportif evenement, TypeSport typePari, String resultatPari) {
        // Implémenter la logique de placement de pari
        return false; // Retourner vrai si le pari est placé avec succès, faux sinon
    }

    // Méthode pour valider le montant du pari
    public void validerMontant(long montant) {
        // Implémenter la logique de validation du montant du pari
    }

    // Méthode pour consulter le solde
    public void consulterSolde() {
        // Implémenter la logique de consultation du solde
    }

    // Méthode pour recharger le compte
    public void rechargerCompte(long montant) {
        // Implémenter la logique de rechargement du compte
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
