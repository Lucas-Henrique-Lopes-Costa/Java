package animais;

public class Gato extends Animal{
  public Gato(String nome) {
    super(nome);
  }

  public void miar() {
    System.out.format("O %s miou\n", getNome());
  }
}
