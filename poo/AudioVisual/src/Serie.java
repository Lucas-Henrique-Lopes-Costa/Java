public class Serie {
  private String nome;
  private int ano;
  private int temporadas;

  public Serie(String nome, int ano, int temporadas) {
    this.nome = nome;
    this.ano = ano;
    this.temporadas = temporadas;
  }

  public String toString () {
    String informacoes = String.format("Nome: %s\nAno: %d\nTemporadas: %d", this.nome, this.ano, this.temporadas);
    return informacoes;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  public int getTemporadas() {
    return temporadas;
  }
  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  } 
}
