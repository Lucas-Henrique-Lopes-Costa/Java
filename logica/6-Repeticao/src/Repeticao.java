public class Repeticao {
    public static void main(String[] args) throws Exception {
        // While
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Do While
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        // For
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        // For Each
        int[] numeros = { 1, 2, 3, 4, 5 };
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
