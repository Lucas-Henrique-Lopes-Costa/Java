public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();

        celularA.nome = "iPhone 12";
        celularA.sistemaOperacional = "iOS";
        celularA.espacoArmazenamento = 128;
        celularA.tamanhoTela = 6.1f;

        System.out.println("Celular A");
        System.out.println("Nome: " + celularA.nome);
        System.out.format("Sistema Operacional: %s | Armazenamento: %d | Tamanho da Tela: %.2f\n", celularA.sistemaOperacional, celularA.espacoArmazenamento, celularA.tamanhoTela);
    }
}
