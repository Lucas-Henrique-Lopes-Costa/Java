public class Teste {
  public static void main(String[] args) {
    metodoB();
  }

  static void metodoA(Carro c1, Carro c2, int a) {
    c1 = new Carro("Gol", "Prata");
    c2.setNome("Fusca");
    c2.setCor("Preto");
    a = 10;
  }

  static void metodoB() {
    Carro x = new Carro("Uno", "Branco");
    Carro y = new Carro("Uno", "Branco");
    int z = 20;
    metodoA(x, y, z);
    System.out.println(x.getNome() + " " + x.getCor());
    System.out.println(y.getNome() + " " + y.getCor());
    System.out.println(z);
  }

}
