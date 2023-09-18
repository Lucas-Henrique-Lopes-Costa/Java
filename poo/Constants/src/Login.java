public class Login {
  private final int TAMANHO_MINIMO_SENHA = 7;

  public void verificaSenha(String senha) {
    if (senha.length() >= TAMANHO_MINIMO_SENHA) {
      System.out.println("Seha válida!");
    } else {
      System.out.println("Senha inválida!");
    }
  }
}
