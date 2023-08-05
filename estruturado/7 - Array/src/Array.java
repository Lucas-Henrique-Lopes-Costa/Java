import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws Exception {
        // Armazenar vários tipos
        String[] nomes = new String[5];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Pedro";
        nomes[4] = "Ana";

        // Acessar um elemento
        System.out.println(nomes[0]);

        int[] numeros = new int[5];
        Arrays.fill(numeros, 10);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println(Arrays.toString(numeros));
    }
}
