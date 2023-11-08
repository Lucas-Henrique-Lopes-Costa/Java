public class Main {
  public static void main(String[] args) {
    teste();
  }

  public static void teste() {
    Heroi h1 = new Heroi("Superman");
    Heroi h2 = new Heroi("Batman");
    trocar(h1, h2);
    System.out.println(h1.getNome());
    System.out.println(h2.getNome());
  }

  public static void trocar(Heroi v1, Heroi v2) {
    Heroi temp = v1;
    v1 = v2;
    v2 = temp;
  }
}
