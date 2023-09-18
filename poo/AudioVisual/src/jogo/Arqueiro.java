package jogo;

public class Arqueiro extends Personagem {
  private String arma;

  public Arqueiro(String nome, String classe, int nivel) {
    super(nome);
    setClasse(nome);
    setNivel(2);
    this.arma = "Arco";
  }

  @Override
  public String toString() {
    String informaPersonagem = super.toString();
    return informaPersonagem + "\nArma: " + arma;
  }

  @Override
  public String atacar() {
    return String.format("%s atacou com %s!", getNome(), arma);
  }
}
