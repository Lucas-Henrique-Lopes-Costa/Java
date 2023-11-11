public class Main {
  public class QuizMultiplaEscolha {
    private String pergunta;
    private String[] opcoesResposta;
    private int opcaoCerta; // posição da opção certa no vetor
    private int[] votosAlunos; // cada posição tem a quantidade de votos de uma opção

    public QuizMultiplaEscolha(String pergunta, String[] opcoesResposta) {
      this.pergunta = pergunta;
      this.opcoesResposta = opcoesResposta;
      this.opcaoCerta = 0;
      votosAlunos = new int[opcoesResposta.length];
    }

    public void definirOpcaoCerta(int opcaoCerta) {
      this.opcaoCerta = opcaoCerta;
    }

    public boolean incluirVotoAluno(int opcao) {
      if (opcao >= 0 && opcao < opcoesResposta.length) {
        votosAlunos[opcao]++;
        return true;
      }
      return false;
    }

    public int nroAcertos() {
      return votosAlunos[opcaoCerta];
    }

    public String montarQuestao() {
      String texto = "Questão: " + pergunta + "\n";
      for (int i = 0; i < opcoesResposta.length; i++) {
        texto += "  " + opcoesResposta[i] + " (" + votosAlunos[i] + " votos)\n";
      }
      texto += "Resposta: " + opcoesResposta[opcaoCerta];
      return texto;
    }
  }

  public class Teste {
    public void executar() {
      String[] opcoes = {"private", "class", "const", "final"};
      QuizMultiplaEscolha quiz = new QuizMultiplaEscolha(
        "Qual das palavras-chave não são da linguagem Java?",
        opcoes
      );

      quiz.definirOpcaoCerta(2); // 'const' é a resposta certa
      quiz.incluirVotoAluno(0);
      quiz.incluirVotoAluno(1);
      quiz.incluirVotoAluno(2);
      quiz.incluirVotoAluno(2);
      quiz.incluirVotoAluno(2);
      quiz.incluirVotoAluno(3);

      String questaoMontada = quiz.montarQuestao();
      System.out.println(questaoMontada);
    }
  }

  public class App {
    public static void main(String[] args) {
      Teste t = new Teste();
      t.executar();
    }
  }
}
