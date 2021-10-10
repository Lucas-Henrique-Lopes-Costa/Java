package BuildAnLinkedList;

import java.util.NoSuchElementException;



public class LinkedList {
    private class Node {
        // Node é uma parte do LinkedList
        private int value;
        private Node next;
        private Node i;
        private Node node;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;

    // adicionando um item no final
    public void addLast(int item) {
        var node = new Node(item); // detecta que "Node()" é um objeto dentro desse arquivo e aponto ao valor

        if(first == null) {
            // checando se a lista está cheia ou não
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    // adicionando um mitem no começo
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = node;
        }
    }

    // verificando se o item está já preenchido
    private boolean isEmpty() {
        return first == null;
    }

    // buscando o item
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1; // se não haver o na lista retorna "-1"
    }

    // buscando se contém
    public boolean contains(int item) {
        return indexOf(item) != -1; // se for qualquer outro número diferente de "-1" significa que tem o número
    }

    // removendo o Primeiro item
    public void removeFirst() {
        // [10 -> 20 -> 30]
        // removeFirst() -> first = 20 | Para isso devemos remover link que há entre eles (porque um item aponta para o outro) e declarar antes quais são os primeiros e o segundo

        // verificando se tem item na lista
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        // se tiver "um" item
        if(first == last) {
            first = last = null;
            return;
        }

        // isso vai funcionar apenas se houver 2 itens | declarando qual é o primeiro e o segundo
        var second = first.next;
        first.next = null;
        first = second;
    }

    // removendo o último
    public void removeLast() {
        // [10 -> 20 -> 30]
        // removeLast() -> last = 20
        // previous -> 20
        // last -> 20

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

}
