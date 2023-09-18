import java.util.ArrayList;

public class Contatos {
  private ArrayList<Contato> contatos;

  public Contatos() {
    this.contatos = new ArrayList<Contato>();
  }

  public void adicionar(Contato contato) {
    Contato novoContato = new Contato(contato.getNome(), contato.getTelefone());
    contatos.add(novoContato);
  }

  public ArrayList<Contato> getContatos() {
    return contatos;
  }

  public Contatos buscar (String palavraChave) {
    Contatos contatosFiltrados = new Contatos();

    palavraChave = palavraChave.toLowerCase();
    for (Contato contato : contatos) {
      System.out.println(contato.getNome());
      String nome = contato.getNome().toLowerCase();
      if (nome.startsWith(palavraChave)) {
        System.out.println("Adicionando contato");
        contatosFiltrados.adicionar(contato);;
      }
    }

    return contatosFiltrados;
  }

  @Override
  public String toString() {
    String informacao = "Contatos:\n";

    for (Contato contato : contatos) {
      informacao = informacao + contato.toString();
    }

    return informacao;
  }
}
