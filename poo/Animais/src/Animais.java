import animais.*;

public class Animais {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Marcos Túlio");
        cachorro.comer(); // da classe animal
        cachorro.latir(); // da classe cachorro

        Gato gato = new Gato("Lucas");
        gato.beber();
        gato.miar();
    }
}
