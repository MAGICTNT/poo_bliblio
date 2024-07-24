package org.example.entity;

import org.example.abstracts.Volume;

public class Bd extends Volume {
    private String nomDessinateur;

    public Bd(String titre, String auteur, String nomDessinateur) {
        super(titre, auteur);
        this.nomDessinateur = nomDessinateur;
    }

    public String getNomDessinateur() {
        return nomDessinateur;
    }

    public void setNomDessinateur(String nomDessinateur) {
        this.nomDessinateur = nomDessinateur;
    }


}