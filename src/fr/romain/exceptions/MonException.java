package fr.romain.exceptions;

public class MonException extends Throwable {

    MonException(double somme) {
        super();
        System.out.println("ERREUR : Vous seriez à découvert de " + Math.abs(somme) + " €");
    }

    public String getMessage() {
        return "Mon message d'exception";
    }

}
