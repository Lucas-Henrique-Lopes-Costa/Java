public class ContaNetflix {
  private String idiomaPreferencial;
  private String resolucaoTela;

  public void entrar() {
    buscarPrerenciasDoUsuario(); // pega idioma
    identificarResolucaoTela(); // pega resolução
  }

  private void buscarPrerenciasDoUsuario() {
    idiomaPreferencial = "pt-br";
  }

  private void identificarResolucaoTela() {
    resolucaoTela = "1920x1080";
  }

  public void assistirFilme(String nomeFilme) {
    System.out.println("Assistindo filme " + nomeFilme);
    System.out.println("Carregando filme na Resolução: " + resolucaoTela);
    carregarAudioFilme();
  }

  private void carregarAudioFilme() {
    if (idiomaPreferencial == "pt-br") {
      System.out.println("Carregando audio em português");
    } else {
      System.out.println("Carregando audio em inglês");
    }
  }
}
