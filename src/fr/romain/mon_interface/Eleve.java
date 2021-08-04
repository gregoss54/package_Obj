package fr.romain.mon_interface;

import java.io.IOException;
import java.io.Serializable;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Eleve implements Comparable<Eleve> {

    private String mName;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double mMoyenne = afficherMoyenne();

    public Eleve(String name) {
        this.mName = name;
    }

    // Méthodes
    public String toString() {
        return this.mName + " a " + afficherMoyenne() + " de moyenne";
    }

    public void ajouterNote(int note) {
        if (note < 0) {
            note = 0;
        } else if (note > 20) {
            note = 20;
        }
        this.listeNotes.add(note);

    }

    public double afficherMoyenne() {
        int somme = 0;
        for (int notes : this.listeNotes) {
            somme += notes;
        }
        return somme / (double)this.listeNotes.size();
    }

    // Getters
    public String getmName() {
        return mName;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    @Override
    public int compareTo(Eleve autreEleve) {
        if (afficherMoyenne() < autreEleve.afficherMoyenne()) return -1;
        if (afficherMoyenne() == autreEleve.afficherMoyenne()) return 0;
        if (afficherMoyenne() > autreEleve.afficherMoyenne()) return 1;
        return 2;
    }

}
