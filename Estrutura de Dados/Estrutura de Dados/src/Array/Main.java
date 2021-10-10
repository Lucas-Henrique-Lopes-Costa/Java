package Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[3]; // criando um Array com tamanho 3
        System.out.println(numbers); // ele retorna "[I@4dd8dc3" que significa: "[I@" é o tipo do Array e o "4dd8dc3" é gerado a partir do endereço desse objeto na memória
        System.out.println(Arrays.toString(numbers)); // ele retorna "[0, 0, 0]"

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));

        // podemos simplificar
        int[] numbers2 = { 10, 20, 30};
        System.out.println(Arrays.toString(numbers2));

        // tamanho do Array
        System.out.println(numbers2.length);
    }
}
