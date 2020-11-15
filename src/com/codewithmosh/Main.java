package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        Scanner scanner = new Scanner(System.in); // isso serve para todas as variáveis

        System.out.print("Valor do empréstimo: ");
        // Scanner scannerP = new Scanner(System.in);
        int valorEmprestado = scanner.nextInt();

        System.out.print("Qual a taxa de juros ANUAIS: ");
        // Scanner scannerI = new Scanner(System.in);
        float taxaJurosAnuais = scanner.nextFloat(); // deve-se inserir com "," (float)
        float taxaJuros = taxaJurosAnuais / 100 / 12;
        
        // O número que vai receber será em porcentagem => depois tranforma ele em DECIMAL => divide por 12 para ter os juros MENSAIS

        System.out.print("Número de anos: ");
        // Scanner scannerN = new Scanner(System.in);
        byte years = scanner.nextByte();
        int duraçãoMeses = years * 12; // Transforma os anos em MESES

        double mortgage =  valorEmprestado
            * ( taxaJuros * Math.pow(1 + taxaJuros, duraçãoMeses))
            / ( Math.pow(1 + taxaJuros, duraçãoMeses) -1 );

        // M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]

            // valor emprestado = P        
            // taxa de juros = i
            // duração em meses = n

            // pagamento mensal = M

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        String resultMoneyString = currency.format(mortgage);

        System.out.println("Para quitar o empréstimo de R$" + valorEmprestado + " em " +  duraçãoMeses / 12 + " anos a uma taxa de juros anual de " + taxaJurosAnuais + "%, o seu pagamento mensal seria de " + resultMoneyString);

        // System.out.print("Juros anuais: ");
    }
}