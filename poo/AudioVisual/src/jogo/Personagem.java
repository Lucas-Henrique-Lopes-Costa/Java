package jogo;

public class Personagem {
  private String nome;
  private String classe;
  private int nivel;

  public Personagem(String nome) {
    this.nome = nome;
    classe = "Nenhum";
    nivel = 1;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + "\nClasse: " + classe + "\nNível: " + nivel;
  }

  public String atacar() {
    return String.format("%s atacou!", this.nome);
  }

  public String getNome() {
    return this.nome;
  }

  public String getClasse() {
    return this.classe;
  }

  public int getNivel() {
    return this.nivel;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
}