package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        String input = "";
        Scanner scanner = new Scanner(System.in);

        // while (!input.equals("quit")) {
        //     System.out.print("Imput: ");
        //     input = scanner.next().toLowerCase();

        //     // if (!input.equals("quit"))
        //     //     System.out.println(input);

        //     //ou

        //     if (input.equals("pass"))
        //         continue; // pula o que vier na frente
        //     if (input.equals("quit"))
        //         break; // ignora tudo que vier na frente
        //     System.out.println(input);
        // }

        // OU

        while (true) { // para usar isso, certifique-se que tem um break ou continue
            System.out.print("Imput: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // pula o que vier na frente
            if (input.equals("quit"))
                break; // ignora tudo que vier na frente
            System.out.println(input);
        }
        
        System.out.println();
    }
}