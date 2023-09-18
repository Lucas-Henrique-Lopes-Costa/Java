public class ModificandoAcesso {
    public static void main(String[] args) throws Exception {
        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("O Poderoso Chefão");
    }
}
