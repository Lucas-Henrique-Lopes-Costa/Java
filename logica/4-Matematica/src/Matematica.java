import javax.swing.JOptionPane;
import java.util.Random;

public class Matematica {
    public static void main(String[] args) throws Exception {
        int numeroA = 5;
        int numeroB = 10;

        double resultado = (double) numeroA / numeroB;

        System.out.println(resultado);

        // Gerando Números aleatórios
        int dado6Faces = (int) (Math.random() * 6) + 1; // a multiplicação por 6 gera um número entre 0 e 5, por isso
                                                        // somamos 1
        JOptionPane.showMessageDialog(null, "O número sorteado foi: " + dado6Faces);

        // Esse aqui é mais performático
        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, "O número sorteado foi: " + numero);
    }
}
