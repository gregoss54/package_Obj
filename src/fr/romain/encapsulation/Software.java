package fr.romain.encapsulation;

public class Software {

    private static int nbRegistration = 2;

    // Attribut
    private int softExpiration;

    // Constructeur
    public Software(int expYear) {
        if (nbRegistration > 0) {
            this.softExpiration = expYear;
            System.out.println("Enregistrement de votre soft valide jusqu'en " + this.softExpiration);
            System.out.println("Il vous reste " + nbRegistration + " licence(s)");
            nbRegistration--;
        } else {
            System.out.println("Vous n'avez plus de licence pour ce soft");
        }
    }

    // Getters et Setters
    public int getSoftExpiration() {
        return softExpiration;
    }

    public void setSoftExpiration(int softExpiration) {
        this.softExpiration = softExpiration;
    }
}
