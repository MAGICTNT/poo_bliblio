package org.example.entity;

import org.example.abstracts.Volume;

import java.util.Date;

public class Livre extends Volume {
    private Date dateRestitution;

    public Livre(String titre, String auteur) {
        super(titre, auteur);
    }

    public Date getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(Date dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public void fixerDateRestitution(Date date) {
        this.dateRestitution = date;
    }

    /**
     * @return retourn
     */
    public void prolongerDateRestitution() {
        // Logique pour prolonger la date de restitution (par exemple, ajouter 7 jours)
        long millis = dateRestitution.getTime();
        dateRestitution = new Date(millis + (7 * 24 * 60 * 60 * 1000));
        /*
        7 jour
        24 heure
        60 minute
        60 seconde
        1000 milliseconds
         */
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + getTitre() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", dateRestitution=" + dateRestitution +
                '}';
    }
}