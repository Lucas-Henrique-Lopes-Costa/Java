package com.codewithmosh;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // Pormatando o número como um valor MONETÁRIO
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        String resultMoneyString = currency.format(156489873.456);

        System.out.println(resultMoneyString);

        System.out.println(traco);

        // Formatando em forma de PORCENTAGEM
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        String resultPercenString = percent.format(0.15);

        System.out.println(resultPercenString);

        System.out.println(traco);

        // FOrmantando com Method Chaining
        String resultChaining = NumberFormat.getPercentInstance().format(0.1); // method chaining

        System.out.println(resultChaining);
    }
}