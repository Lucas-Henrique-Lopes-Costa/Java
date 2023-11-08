public class Variaveis {
    public static void main(String[] args) throws Exception {
        // Variaveis do tipo inteiro
        byte idade = 30; // podem ser de -128 a 127
        short ano = 2021; // podem ser de -32768 a 32767
        int numero = 100000; // podem ser de -2147483648 a 2147483647
        long numeroGrande = 9223372036854775807L; // podem ser de -9223372036854775808 a 9223372036854775807

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(numero);
        System.out.println(numeroGrande);

        // Variaveis do tipo ponto flutuante
        float altura = 1.70f; // podem ser de 1.4E-45 a 3.4028235E38
        double altura2 = 1.70; // podem ser de 4.9E-324 a 1.7976931348623157E308

        System.out.println(altura);
        System.out.println(altura2);

        // Variaveis do tipo caractere
        char letra = 'A'; // podem ser de 0 a 65535

        System.out.println(letra);

        // Variaveis do tipo booleano
        boolean verdadeiro = true; // podem ser true ou false

        System.out.println(verdadeiro);

        // Variaveis do tipo String
        String nome = "João";

        System.out.println(nome);

        // Variaveis do tipo Object
        Object objeto = "João";

        System.out.println(objeto);

        // Variaveis do tipo var
        var nome2 = "João";

        System.out.println(nome2);
    }
}
