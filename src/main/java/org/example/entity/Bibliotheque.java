package org.example.entity;

import org.example.abstracts.Document;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Adherent> adherents;
    private List<Document> documents;

    public Bibliotheque() {
        this.adherents = new ArrayList<>();
        this.documents = new ArrayList<>();
    }

    public void ajouterAdherent(Adherent adherent) {
        adherents.add(adherent);
    }

    public void retirerAdherent(Adherent adherent) {
        adherents.remove(adherent);
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public void retirerDocument(Document document) {
        documents.remove(document);
    }

    public List<Document> getDocuments() {
        return documents;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "adherents=" + adherents +
                ", documents=" + documents +
                '}';
    }
}