package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // se for multiplo de 5 = Fizz
        // se for multiplo de 3 = Buzz
        // se for multiplo de 3 e 5 = FizBuzz
        // senão mostre o número

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        // SEMPRE DEVE-SE COLOCAR AS CONDIÇÕES MAIS ESPECÍFICAS NO COMEÇO E AS MAIS GERAIS NO FINAL
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}