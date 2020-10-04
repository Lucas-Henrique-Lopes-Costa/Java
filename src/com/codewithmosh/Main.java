package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);
        
        // Inplicit CASTING
        // byte > short > int > long > float > double

        // ---- Convertendo unidades

        // double x = 1.1;
        // double y = (int)x + 2; // converter para int
        // System.out.println(y);

        // ------------------------------------------------------

        // String x = "1";
        // Integer.parseInt(x); // passa para int
        // System.out.println(x);

        // int y = Integer.parseInt(x) + 2;
        // System.out.println(y);


        String x = "1.1";
        double y = Double.parseDouble(x) + 2; // passa para Double
        System.out.println(y);

    }
}