public class Carro {
  private String nome;
  private String cor;

  public Carro(String nome, String cor) {
    this.nome = nome;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public String getCor() {
    return cor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}
