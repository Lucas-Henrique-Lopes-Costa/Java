import javax.swing.JOptionPane;

public class Bool {
    public static void main(String[] args) throws Exception {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?")); // input idade

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade");
        } else {
            JOptionPane.showMessageDialog(null, "Você é menor de idade");
        }

        String maioMenor = idade >= 18 ? "maior" : "menor"; // operador ternário
        System.out.println("Você é " + maioMenor + " de idade");

        char sexo = JOptionPane.showInputDialog("Qual o seu sexo? (M/F)").charAt(0); // input sexo

        switch (sexo) {
            case 'M':
                JOptionPane.showMessageDialog(null, "Você é do sexo masculino");
                break;
            case 'F':
                JOptionPane.showMessageDialog(null, "Você é do sexo feminino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Sexo inválido");
                break;
        }
    }
}
