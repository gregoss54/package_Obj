package fr.romain.encapsulation;

public class Car {

    // Variable static
    public static int count = 0;

    // Attributs (Variables qui appartiennent à une classe), public par défaut
    private int mId;
    private String mBrand;
    private double mSpeed;
    private int mPower;
    private String mColor;

    // Constructeurs
    public Car(String brand, double speed, int power, String color) {
        this.mId = count++;
        this.mBrand = brand;
        this.mSpeed = speed;
        this.mPower = power;
        this.mColor = color;
    }

    public Car(String brand) {
        this.mId = count++;
        this.mBrand = brand;
    }

    public Car(String brand, String color) {
        this.mId = count++;
        this.mBrand = brand;
        this.mColor = color;
    }

    // Méthodes
    /**
     * Méthode toString
     * @return String description de l'instance courante
     */
    public String toString() {
        String des = "ID -> " + mId + ", Description de ma nouvelle voiture : Marque -> " + mBrand + ", Couleur -> " + mColor;
        return des;
    }

    // Accesseurs et Mutateurs (getters et setters)
    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String brand) {
        this.mBrand = brand;
    }

    public double getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(double mSpeed) {
        this.mSpeed = mSpeed;
    }

    public int getmPower() {
        return mPower;
    }

    public void setmPower(int mPower) {
        this.mPower = mPower;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }
}
