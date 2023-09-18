public class FestaVip {
  int quantidadeCafe = 30;
  int quantidadeSalgadinho = 50;
  
  public void entrar() {
    beberCafe();
    comerSalgadinho();
  }

  private void beberCafe() { // private -> só pode ser acessado dentro da classe
    quantidadeCafe--;
    System.out.println("Bebeu 1 xícara de café");
  }

  private void comerSalgadinho() {
    quantidadeCafe -= 5;
    System.out.println("Comeu 5 salgadinho");
  }
}
