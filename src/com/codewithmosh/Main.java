package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // começa com 0 e enquanto a variável for menor que 5 ele vai adicionando "mais 1"
        for (int i = 0; i < 5; i++){
            System.out.println(i + " Hello World");
        }

        System.out.println(traco);

        for (int i = 1; i <= 5; i++){
            System.out.println(i + " Hello World");
        }

        System.out.println(traco);

        for (int i = 5; i > 0; i--){
            System.out.println(i + " Hello World");
        }
        
        System.out.println();
    }
}