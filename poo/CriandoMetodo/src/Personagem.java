import java.util.Random;

public class Personagem {
  String nome;
  int nivel;
  int forca;

  void mostraStatus() {
    System.out.println("Nome: " + nome);
    System.out.println("Nível: " + nivel);
    System.out.println("Força: " + forca);
  }

  int cacularDano() {
    Random gerador = new Random(); // girando um dado para ver a chance de causar dano
    int dado = gerador.nextInt(19) + 1;

    int dano = forca + dado;

    return dano;
  }

  void atacar(String nomeInimigo, String habilidade) {
    int dadoCausado = cacularDano();
    if (habilidade.length() == 0) {
      System.out.format("%s atacou %s e causou %d de dano.\n", nome, nomeInimigo, dadoCausado);
    } else {
      System.out.format("%s atacou %s com %s e causou %d de dano.\n", nome, nomeInimigo, habilidade, dadoCausado);
    }
  }
}
