package fr.romain.mon_interface;

// Une interface est une surcouche d'abstraction qui établit un contrat
// C'est une Classe abstraite qui ne comporte QUE des méthodes abstraites ET public
// Elle ne comporte PAS de constructeur
// Elle est dite FONCTIONNELLE (@FonctionalInterface) si elle ne comporte qu'UNE SEULE méthode

public interface Inventoriable {

    public String getIdentifiant();

    public String getInfosCompletes();

}
