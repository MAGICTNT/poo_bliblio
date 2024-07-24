package org.example.entity;

import org.example.abstracts.Document;

import java.util.Date;

public class Journal extends Document {
    private Date dateParution;

    public Journal(String titre, Date dateParution) {
        super(titre);
        this.dateParution = dateParution;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "titre='" + getTitre() + '\'' +
                ", dateParution=" + dateParution +
                '}';
    }
}