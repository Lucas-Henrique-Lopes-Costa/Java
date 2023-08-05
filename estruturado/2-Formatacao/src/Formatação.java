public class Formatação {
    public static void main(String[] args) throws Exception {
        String fime = "Vingadores"; // %s
        int anoLancamento = 2019; // %d
        int duracao = 181; // %d
        String genero = "Ação"; // %s
        float nota = 8.5f; // %f
        char classificacao = 'A'; // %c
        boolean assistido = true; // %b

        System.out.println("O filme " + fime + " foi lançado em " + anoLancamento + " e tem duração de " + duracao + " minutos.");
        System.out.format("O gênero do filme é %s e sua nota é %f.", genero, nota);
        System.out.format("A classificação indicativa do filme é %c e você já assistiu? %b.", classificacao, assistido);

        String mensagemFinal = String.format("O filme %s foi lançado em %d e tem duração de %d minutos.", fime, anoLancamento, duracao);
        System.out.println(mensagemFinal);
    }
}
