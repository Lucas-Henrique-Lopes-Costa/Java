package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        String input = "";
        Scanner scanner = new Scanner(System.in);

        do { // faz primeiro para depois avaliar a condição
            System.out.print("Imput: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        System.out.println();
    }
}