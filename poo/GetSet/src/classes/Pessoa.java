package classes;

public class Pessoa {
  private String nome = "Lucas";
  private int idade;
  private double altura;

  public String getNome() { // sem colocar um mofiicador de acesso, o método fica com o modificador default, e pode ser acessado apenas por classes do mesmo pacote
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome; // this.nome se refere ao atributo nome da classe Pessoa
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}
