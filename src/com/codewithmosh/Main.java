package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);
        
        int result = Math.round(1.5F); // faz o arredondamento
        System.out.println(result);
        
        System.out.println(traco);

        int result2 = (int)Math.ceil(1.1F); //arredonda para cima
        System.out.println(result2);

        System.out.println(traco);

        int result3 = (int)Math.floor(2.6F); //arredonda para baixo
        System.out.println(result3);

        System.out.println(traco);

        int result4 = Math.max(2, 156); //QUal o máximo ? (também funciona com o min)
        System.out.println(result4);

        System.out.println(traco);

        // int result5 = (int) Math.round(Math.random() * 100); // Número Aleatório
        // System.out.println(result5);

        // ESSE ESTÁ ERRADO PORQUE ELE DA SEMPRE 0

        // int result5 = (int) Math.random() * 100; // Número Aleatório
        // System.out.println(result5); 

        int result5 = (int) (Math.random() * 100); // Número Aleatório
        System.out.println(result5);

    }
}