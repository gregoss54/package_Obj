package fr.romain.encapsulation;

public class Player {

    // Déclaration des attributs
    private String mName;
    private int mLevel;

    // 3 Constructeurs
    public Player() {
        this.mName = "Inconnu";
        this.mLevel = 1;
        System.out.println(this.mName + " - " + this.mLevel);
    }

    public Player(String name) {
        this.mName = name;
        this.mLevel = 1;
        System.out.println(this.mName + " - " + this.mLevel);
    }

    public Player(String name, int level) {
        this.mName = name;
        this.mLevel = level;
        System.out.println(this.mName + " - " + this.mLevel);
    }

    // Méthodes
    public void attack() {
        System.out.println(this.mName + " attaque une cible !");
    }

    public void attack(String name) {
        System.out.println(this.mName + " prend pour cible : " + name);
    }

    // Getters + Setters
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String toString() {
        return "Je m'appelle " + this.mName + " et je suis niveau " + this.mLevel;
    }


}
