package fr.romain.classe_abstraite;

public class MainAbstract {

    public static void main(String[] args) {


        Citadine c1 = new Citadine(123, "Renault", "Twingo", "Rouge", 100, "22/05/2022");
        System.out.println(c1.toString());
        c1.planifierRevision();

        Utilitaire u1 = new Utilitaire(566, "Peugeot", "J9", "Brun", 9, "04/04/2023");
        System.out.println(u1.toString());
        u1.planifierRevision();

    }
}
