package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //  Se você não especificar dentro do "<>" ele vai interpretar qualquer tipo de LinkedList
        list.addLast(10); // Adicionar no final
        list.addLast(20);
        list.addLast(30);

        list.addFirst(5); // Adiociona no começo

        list.remove(3); // Remove o item de index:3
        list.removeFirst(); // Remove o primeiro item

//        System.out.println(list);

        System.out.println("Contém o Item 10? " + list.contains(10));
        Integer index = list.indexOf(10) + 1;
        System.out.println("E onde está o número 10? Ele está na " + index + "º posição");
        System.out.println("Quantos elementos tem nessa Lista: " + list.size() + "itens");

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
