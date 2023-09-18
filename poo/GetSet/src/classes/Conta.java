package classes;

public class Conta {
  private double saldo;

  void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido");
    }
    saldo += valor;
  }

  void sacar(double valor) {
    saldo -= valor;
  }

  double getSaldo() {
    return saldo;
  }
}
