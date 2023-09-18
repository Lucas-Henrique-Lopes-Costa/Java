public class Festa {
    public static void main(String[] args) throws Exception {
        FestaVip festa = new FestaVip();
        
        festa.entrar();

        System.out.println(festa.quantidadeCafe);
        System.out.println(festa.quantidadeSalgadinho);
    }
}
