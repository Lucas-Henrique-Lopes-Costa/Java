package com.codewithmosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // valor emprestado = P        
        // taxa de juros = i
        // duração em meses = n

        // pagamento mensal = M

        Scanner scanner = new Scanner(System.in); // isso serve para todas as variáveis

        System.out.print("Valor do empréstimo: ");
        // Scanner scannerP = new Scanner(System.in);
        int valorEmprestado = scanner.nextInt();

        System.out.print("Qual a taxa de juros ANUAIS: ");
        // Scanner scannerI = new Scanner(System.in);
        float taxaJuros = scanner.nextFloat() / 100 / 12; // deve-se inserir com ","
        
        // O número que vai receber será em porcentagem => dempois tranforma ele em DECIMAL => divide por 12 para ter os juros MENSAIS

        System.out.print("Número de anos: ");
        // Scanner scannerN = new Scanner(System.in);
        byte years = scanner.nextByte();
        int duraçãoMeses = years * 12; // Transforma os anos em MESES

        double mortgage =  valorEmprestado
            * ( taxaJuros * Math.pow(1 + taxaJuros, duraçãoMeses))
            / ( Math.pow(1 + taxaJuros, duraçãoMeses) -1 );

        // M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]

        

        System.out.println(mortgage);


        // System.out.print("Juros anuais: ");




    }
}