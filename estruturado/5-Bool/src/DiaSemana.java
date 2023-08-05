import javax.swing.JOptionPane;

public class DiaSemana {
    public static void main(String[] args) throws Exception {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual o dia da semana? (1-7)"));

        // caso usando sem o break, o programa vai executar todos os casos abaixo do
        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "Dia de Semana");
                break;
            case 1:
            case 7:
                JOptionPane.showMessageDialog(null, "Fim de Semana");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia inválido");
                break;
        }
    }
}
