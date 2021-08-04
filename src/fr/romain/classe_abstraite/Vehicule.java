package fr.romain.classe_abstraite;

import java.util.Date;

// Une Classe abstraite NE PEUT PAS être instanciée
// Elle comporte AU MOINS UNE méthode abstraite
public abstract class Vehicule {

    // Attributs
    protected String mModePaiement;
    protected int mSerialNumber;
    protected String mMarque;
    protected String mModel;
    protected String mColor;
    protected String mDateRevision;

    // Constructeur
    public Vehicule(int serialNumber, String marque, String model, String color, String revision) {
        this.mSerialNumber = serialNumber;
        this.mMarque = marque;
        this.mModel = model;
        this.mColor = color;
        this.mDateRevision = revision;
    }

    // Une méthode abstraite N'A PAS de corps, mais peut renvoyer qqchose et/ou prendre des paramètres
    // Méthode abstraite, qui oblige les classes filles à l'implémenter
    public abstract void planifierRevision();

    // Une Classe abstraite peut aussi comporter des méthodes concrètes
    public static void uneAutreMethode() {
        // Code
    }

    @Override
    public String toString() {
        return "No de Série : " + this.mSerialNumber + ", Marque : " + this.mMarque + ", Modèle : " + this.mModel +
                ", Couleur : " + this.mColor;
    }

    // Getters et Setters
    public int getmSerialNumber() {
        return mSerialNumber;
    }

    public void setmSerialNumber(int mSerialNumber) {
        this.mSerialNumber = mSerialNumber;
    }

    public String getmMarque() {
        return mMarque;
    }

    public void setmMarque(String mMarque) {
        this.mMarque = mMarque;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
}
