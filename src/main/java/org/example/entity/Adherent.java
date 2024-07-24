package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private String prenom;
    private String nom;
    private List<Livre> livresEmpruntes;

    public Adherent(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.livresEmpruntes = new ArrayList<>();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    // Méthodes
    public void inscrire() {
        // Logic pour inscription
    }

    public void desinscrire() {
        // Logic pour desinscription
    }

    public boolean emprunterLivre(Livre livre) {
        if (livresEmpruntes.size() < 3) {
            livresEmpruntes.add(livre);
            return true;
        } else {
            System.out.println("Vous avez déjà emprunté 3 livres.");
            return false;
        }
    }

    public void restituerLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    public void prolongerDateRestitution(Livre livre) {
        livre.prolongerDateRestitution();
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", livresEmpruntes=" + livresEmpruntes +
                '}';
    }
}