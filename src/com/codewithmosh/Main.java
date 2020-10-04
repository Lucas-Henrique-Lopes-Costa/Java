package com.codewithmosh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        // Arrays = CONJUNTO

        // int [] numbers = new int [5];
        // numbers [0] = 1;
        // numbers [1] = 2;
        
        // System.out.println(numbers); // vai aprecer o número de onde esta memória
        
        // System.out.println(Arrays.toString(numbers)); // aparece o correto
        
        int [] numbers = { 2, 3 ,4 ,8 ,7};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));   
    }
}