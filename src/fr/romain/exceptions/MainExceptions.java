package fr.romain.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {

    public static void main(String[] args) throws MonException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier");

        // Exemple 1
        try {
            int res = sc.nextInt();
            System.out.println("Votre  en tier est " + res);
        } catch (InputMismatchException e) {
            System.out.println("Type incorrect");
            e.getMessage();
        } catch (Exception e) {
            System.out.println("C'est une Exception");
        } finally {
            System.out.println("Ceci est un finally, et ferme le Scanner");
            sc.close();
        }

        // Exemple 2
        int i = 3;
        int j = 0;
        try {
            System.out.println("Résultat = " + (i / j));
        } catch (ArithmeticException e) {
            System.out.println("ERREUR : " + e.getMessage());
        }

        // Exemple 3
        int[] numbers = {4, 5, 6, 7};
        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cet index n'existe pas");
            e.getMessage(); // Ne renvoie pas de message
        }

        // Exemple 4
        double balance = 5000;
        double price = 5100;
        try {
            buy(balance, price);
        } catch (MonException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }

    }

    private static void buy(double balance, double price) throws MonException {

        double b = balance - price;
        if (b < 0) {
            throw new MonException(b);
        }
        System.out.println("Vous avez " + b + " sur votre compte");
    }
}
