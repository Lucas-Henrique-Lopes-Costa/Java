import java.util.Scanner;

public class Lendo {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        // Int
        int numero;
        numero = leitor.nextInt();
        System.out.println("O número digitado foi: " + numero);
        
        // Float
        float numeroFloat;
        numeroFloat = leitor.nextFloat();
        System.out.println("O número digitado foi: " + numeroFloat);
        
        // Lendo a string com espaços
        Scanner leitorString = new Scanner(System.in);
        // Configurando o delimitador para quebrar a linha
        leitorString.useDelimiter("[;\r\n]+");
  
        String texto;
        texto = leitorString.nextLine();
        System.out.println("O texto digitado foi: " + texto);

        // Convertendo de String para Int
        System.out.println("Digite um número 1: ");
        String valor = leitorString.nextLine();
        System.out.println("Digite um número 2: ");
        String valor2 = leitorString.nextLine();
        int numeroConvertido1 = Integer.parseInt(valor);
        int numeroConvertido2 = Integer.parseInt(valor2);

        System.out.println("O número digitado foi: " + numeroConvertido1 + " e " + numeroConvertido2 + " e a soma deles é: " + (numeroConvertido1 + numeroConvertido2));

        leitor.close();
        leitorString.close();
    }
}
