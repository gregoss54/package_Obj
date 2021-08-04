package fr.romain.classe_abstraite;

public class Utilitaire extends Vehicule {

    private int mSize;

    public Utilitaire(int serialNumber, String marque, String model, String color, int size, String revision) {
        super(serialNumber, marque, model, color, revision);
        this.mSize = size;
    }

    @Override
    public void planifierRevision() {
        System.out.println("Date de révision des Utilitaires : " + this.mDateRevision);
    }

    @Override
    public String toString() {
        return "No de Série : " + this.mSerialNumber + ", Marque : " + this.mMarque + ", Modèle : " + this.mModel +
                ", Couleur : " + this.mColor + ", Volume : " + this.mSize;
    }

}
