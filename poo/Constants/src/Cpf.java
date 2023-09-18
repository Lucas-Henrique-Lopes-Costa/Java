public class Cpf {
  

  public void validar(String cpf) {
    if (cpf.length() == 11) {
      System.out.println("CPF válido!");
    } else {
      System.out.println("CPF inválido!");
    }
  }
}
