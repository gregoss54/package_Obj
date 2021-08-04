package fr.romain.encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {

        Car voiture1 = new Car("Peugeot", 230, 20, "Rouge");
        System.out.println(voiture1.toString());

        Car voiture2 = new Car("Ferrari", 300, 25, "Jaune");
        System.out.println(voiture2.toString());

        Car voiture3 = new Car("Twingo", 30, 2, "Bleu");
        System.out.println(voiture3.toString());

        Car voiture4 = new Car("Multipla");
        System.out.println(voiture4);

        //voiture1.mColor = "AutreCouleur";
        //System.out.println(voiture1);
        voiture1.setmBrand("EncoreUneAutreCouleur");
        System.out.println(voiture1.getmBrand());

        Software photo = new Software(2022);
        Software photo2 = new Software(2045);
        Software autreSoft = new Software(1978);

        Player player1 = new Player("Jojo", 12);
        System.out.println(player1);

    }
}
