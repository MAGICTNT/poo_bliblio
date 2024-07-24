package org.example.abstracts;

public abstract class Volume extends Document {
    private String auteur;

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Volume{" +
                "titre='" + getTitre() + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}