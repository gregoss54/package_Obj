package fr.romain.collection;

import java.io.FilePermission;
import java.util.*;

import static java.util.Collections.*;

public class MainCollections {


    public static void main(String[] args) {
        FilePermission lulu = null;
        main(args, lulu);
    }

    public static void main(String[] args, FilePermission chacha) {

        //Les collections sont des structures de données dynamiques
        //l'interface Collection garantit que toutes les classes 
        // qui l'implementent doivent implementer les methodes suivantes

        //1Ere partie

        List<String> test = new ArrayList<String>();
        test.add("Bonjour");
        test.add("TLM");


        System.out.println(test.size());
        for (String e : test) {
            System.out.println(e);
        }

        //2eme partie
        /*
         *4 classes :
         * ArrayList : mono thread en accès direct et opti pour la lecture
         * LinkedList : insertions rapides
         * Vector : multi thread opti pour la lecture
         * Stack : LIFO, multi-thread
         */
        //Exemple de tri naturel avec sort()

        ArrayList<String> strList = new ArrayList<String>();
        String str1 = "A";
        String str2 = "D";
        String str3 = "C";
        String str4 = "B";

        strList.add(str1);
        strList.add(str2);
        strList.add(str3);
        strList.add(str4);
        for (String s : strList) {
            System.out.println(s);
        }
        sort(strList);
        for (String s : strList) {
            System.out.println(s);
        }
        //3eme partie
        LinkedList<Cat.cat> LinkedList = new LinkedList<Cat.cat>();
        Cat Bubu = new Cat("Bubu");

        //4ème partie
        //La Stack (LIFO -> Last in first out)
        System.out.println("********** STACK PILE *********");

        //Méthodes utilisées : push(); pop(); peek();

        Stack<Cat> stackedList = new Stack<Cat>();
        stackedList.add(Bubu);
        stackedList.get(0).miaou();




        {
            System.out.println("********************* Priority Queue ******************");

            PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
            priorityQueue.add(155);
            priorityQueue.add(15);
            priorityQueue.add(554);
            priorityQueue.add(-5555);
            System.out.println(priorityQueue);
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
                ;
            }
            System.out.println(priorityQueue.peek());
            System.out.println(priorityQueue.poll());

            System.out.println("*************** ArrayDeque*************");
            //Memes caracteristiques (ordonnée...)
            ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
            //On utilise plutot AddFirst() ou AddLast() -> On insere comme on veut -> + rapide
            //interet : elle se comporte comme Stack ou liste chainée

            arrayDeque.addFirst(155);
            arrayDeque.addFirst(1);
            arrayDeque.addFirst(15);
            arrayDeque.addFirst(55);
            arrayDeque.addFirst(-5);
            arrayDeque.addFirst(5);
            System.out.println(arrayDeque);
            //SI liste vide retour d'un Null, sinon, retour d'une valeur
            System.out.println(arrayDeque.size());
            System.out.println(arrayDeque.getFirst());
            System.out.println(arrayDeque.getLast());
            arrayDeque.pollFirst();

            System.out.println("*************** Ensembles HashSet et TreeSet*********************");
            // HashSet : Pas de doublons, pas de thread
            // TreeSet : (arbre binaire) Pas de doublons, paas thread safe, ordonnée, pas d'accès direct
            HashSet<Integer> hashSet = new HashSet<Integer>(20, 9);
            //Capacity ETT facteur de charge -> à 60% : on alloe une nouvelle capacité
            // On accéde environ à toutes les méthodes que l'on connait
            hashSet.add(4);
            hashSet.add(-45);
            hashSet.add(555);
            if (hashSet.contains(4)) {
                System.out.println("YEAH");
            } else {
                System.out.println("NOOOOO");
            }
            //On utilise le hashCode pour vérifier qu'il n'y a pas de doublons
           // System.out.println(chacha.hashCode());
           // System.out.println(Objects.hashCode(chacha));
            //On peut faire pareil avec le TreeSet
            TreeSet<String>treeSet = new TreeSet<String>();
            treeSet.add("A");
            treeSet.add("G");
            treeSet.add("F");
            treeSet.add("Z");
            System.out.println(treeSet);
            treeSet.headSet("G");
            //On recupere un sous-ensemble qui va de la tete jusqu'au second parametre exclu
            System.out.println(treeSet.subSet("A", "X"));



        }
    }
}

