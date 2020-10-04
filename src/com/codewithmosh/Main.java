package com.codewithmosh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);
        
        // os cochetes antes o "=" são as dimensões
        int [][] numbers = new int [2][3]; // Criando uma MATRIZ => entre os cochetes coloque o númeoro de colunas e linhas
        numbers [1][2] = 1;// cordenada

        // System.out.println(Arrays.toString(numbers)); // estara errado => porque é multimencional
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(traco);

        int [][][] numbers3d = new int [2][3][2];
        numbers3d [1][2][1] = 5;

        System.out.println(Arrays.deepToString(numbers3d));
        System.out.println(traco);

        int [][] DifferentNumbers = { { 1, 2, 3, 4 }, { 6 ,9 ,8 ,4}};
        
        System.out.println(Arrays.deepToString(DifferentNumbers));
    }
}