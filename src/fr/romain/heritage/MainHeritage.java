package fr.romain.heritage;

import fr.romain.enumeration.Civilite;

public class MainHeritage {

    public static void main(String[] args) {

        Horse cheval = new Horse("Doudou");

        cheval.move(123, 45);
        cheval.init();
        System.out.println(cheval.toString());

        Pegasus pegase = new Pegasus("Pipo");
        System.out.println(pegase);
        pegase.move(12, 56);
        pegase.fly(67);
        if (pegase instanceof Pegasus) {
            System.out.println("OUI");
        } else {
            System.out.println("NON");
        }
        System.out.println(pegase.getClass());

        System.out.println(cheval);

        Horse cheval2 = new Horse("Rourou");

        System.out.println(cheval2);
    }
}
