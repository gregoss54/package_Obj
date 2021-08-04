package fr.romain.heritage;

// Si on ne veut pas que la classe Horse soit étendue, on peut utiliser le mot clé "final"
public class Horse {

    // Attributs (Variables d'instance)
    // protected : accessible depuis les classes héritées
    protected String mName;
    protected int mPosX;
    protected int mPosY;

    // L'Initializer est la première chose lue à l'instanciation de la classe
    {
        mPosX = 0;
        mPosY = 0;
        System.out.println("Initializer");
    }



    // Constructeur
    public Horse(String name) {
        this.mName = name;
        System.out.println("Constructeur");
    }

    // Méthode(s)
    public void move() {
    }

    public void move(int x) {
    }

    public void move(int x, int y) {
        this.mPosX = x;
        this.mPosY = y;
        System.out.println(this.mName + " se déplace (X=" + mPosX + " et Y=" + mPosY + ")");
    }

    public void move(int x, int y, String str) {

    }

    public void move(int x, int y, int z) {

    }



    public void init() {
        this.mPosX = 0;
        this.mPosY = 0;
    }

    @Override
    public String toString() {
        String res = this.mName + " se situe (X=" + mPosX + " et Y=" + mPosY + ")";
        return res;
    }

}
