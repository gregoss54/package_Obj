package fr.romain.heritage;

public class Pegasus extends Horse {

    //private String mName;
    private int mPosX = 0;
    private int mPosY = 0;
    private int mPosZ = 0;

    public Pegasus(String name) {
        super(name);
    }

    public void fly(int z) {
        this.mPosZ = z;
        //System.out.println(this.mName + " s'envole (Z=" + this.mPosZ + ")");
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
        System.out.println("Méthode move() de la classe Pegasus avec un Z=" + mPosZ);
    }

    @Override
    public String toString() {
        String res = this.mName + " se situe (X=" + mPosX + " et Y=" + mPosY + " et Z=" + mPosZ + ")";
        return res;
    }



}
