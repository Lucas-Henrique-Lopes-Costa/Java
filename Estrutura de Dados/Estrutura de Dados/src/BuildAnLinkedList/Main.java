package BuildAnLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Seguindo a lista: [10, 20, 30]");

        System.out.println("");
        System.out.println("Tem o número 10 nesta lista? " + list.contains(10) + " (antes de remover)");
        System.out.println("E onde ele está nesta lista? " + list.indexOf(10) + " (antes de remover)");

//        System.out.println("");
        System.out.println("####### Removendo o Primeiro #######");
        list.removeFirst();

        System.out.println("Tem o número 10 nesta lista? " + list.contains(10));
        System.out.println("E onde ele está nesta lista? " + list.indexOf(10));

        System.out.println("[20, 30]");

        System.out.println("");
        System.out.println("Tem o número 30 nesta lista? " + list.contains(30) + " (antes de remover)");
        System.out.println("E onde ele está nesta lista? " + list.indexOf(30) + " (antes de remover)");

//        System.out.println("");
        System.out.println("####### Removendo o último #######");
        list.removeLast();

        System.out.println("[20]");

        System.out.println("");
        System.out.println("####### O que restou? #######");

        System.out.println("Tem o número 10 nesta lista? " + list.contains(10));
        System.out.println("E onde ele está nesta lista? " + list.indexOf(10));

        System.out.println("");

        System.out.println("Tem o número 20 nesta lista? " + list.contains(20));
        System.out.println("E onde ele está nesta lista? " + list.indexOf(20));

        System.out.println("");

        System.out.println("Tem o número 30 nesta lista? " + list.contains(30));
        System.out.println("E onde ele está nesta lista? " + list.indexOf(30));
    }
}
