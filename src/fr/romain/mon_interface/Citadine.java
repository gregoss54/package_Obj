package fr.romain.mon_interface;

public class Citadine extends Vehicule {

    private int mAutonomie;

    public Citadine(int serialNumber, String marque, String model, String color, int autonomie, String revision) {
        super(serialNumber, marque, model, color, revision);
        this.mAutonomie = autonomie;
    }

    @Override
    public void planifierRevision() {
        System.out.println("Date de révision des Citadines : " + this.mDateRevision);
    }

    @Override
    public String toString() {
        return "No de Série : " + this.mSerialNumber + ", Marque : " + this.mMarque + ", Modèle : " + this.mModel +
                ", Couleur : " + this.mColor + ", Autonomie : " + this.mAutonomie;
    }

    @Override
    public String getIdentifiant() {
        return null;
    }

    @Override
    public String getInfosCompletes() {
        return null;
    }
}
