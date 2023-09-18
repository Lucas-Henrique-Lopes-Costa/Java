public class PrimeiroMetodo {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();

        heroi.nome = "Lucas";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostraStatus();
        heroi.atacar("Hydra", "Corte");
    }
}
