package com.codewithmosh;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // for (int i = 5; i > 0; i--) // mais simples
        //     System.out.println(i + " Hello World");

        // System.out.println(traco);

        // int i = 1;
        // while (i <= 5) { // saber exatamente quantas vezes repetiu
        //     System.out.println("Hello World " + i);
        //     i++;
        // }
        
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")) {
            System.out.print("Imput: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println();
    }
}