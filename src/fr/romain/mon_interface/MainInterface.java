package fr.romain.mon_interface;

public class MainInterface {

    public static void main(String[] args) {

        Citadine c1 = new Citadine(123, "Renault", "Twingo", "Rouge", 100, "22/05/2022");
        System.out.println(c1.toString());
        c1.planifierRevision();

        Utilitaire u1 = new Utilitaire(566, "Peugeot", "J9", "Brun", 9, "04/04/2023");
        System.out.println(u1.toString());
        u1.planifierRevision();

        Eleve jo = new Eleve("Jojo");
        Eleve ju = new Eleve("Juju");

        System.out.println("**************** ELEVES *******************");
        //System.out.println(jo.getmName());
        //System.out.println(ju.getmName());
        jo.ajouterNote(13);
        jo.ajouterNote(2);
        jo.ajouterNote(13);
        jo.ajouterNote(1);

        ju.ajouterNote(18);
        ju.ajouterNote(12);
        ju.ajouterNote(6);
        ju.ajouterNote(19);

        System.out.println(jo.toString());
        System.out.println(ju.toString());

        switch (jo.compareTo(ju)) {
            case -1 :
                System.out.println(jo.getmName() + " est moins bon que " + ju.getmName());
                break;
            case 0 :
                System.out.println(jo.getmName() + " est aussi bon que " + ju.getmName());
                break;
            case 1 :
                System.out.println(jo.getmName() + " est meilleur que " + ju.getmName());
                break;
            default:
                System.out.println("IMPOSSIBLE");
        }

    }
}
