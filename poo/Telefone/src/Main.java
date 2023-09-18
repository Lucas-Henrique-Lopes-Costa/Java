public class Main {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("123456789");
        
        Contato contatoA = new Contato("João", "123456789");
        Contato contatoB = new Contato("Pedro", "123456789");
        Contato contatoC = new Contato("Marcos", "123456789");
        Contato contatoD = new Contato("joaquim", "123456789");

        telefone.getContatos().adicionar(contatoA);
        telefone.getContatos().adicionar(contatoB);
        telefone.getContatos().adicionar(contatoC);
        telefone.getContatos().adicionar(contatoD);

        System.out.println(telefone.getContatos());

        System.out.println("Contatos filtrados:");
        System.out.println(telefone.getContatos().buscar("João"));
    }
}
