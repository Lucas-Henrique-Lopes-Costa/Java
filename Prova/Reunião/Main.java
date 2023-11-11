import java.util.ArrayList;

public class Reuniao {
  private String assunto;
  private int dia;
  private int hora;
  private String local;
  private String organizador;
  private ArrayList<String> convidados;

  public Reuniao(String assunto, int dia, int hora, String organizador) {
    this.assunto = assunto;
    this.dia = dia;
    this.hora = hora;
    this.organizador = organizador;
    convidados = new ArrayList<>();
  }

  public void definirLocal(String local) {
    this.local = local;
  }

  public void adicionarConvidado(String convidado) {
    convidados.add(convidado);
  }

  public int nroParticipantes() {
    // organizador mais os convidados
    return convidados.size() + 1;
  }
}

private String candidados() {
  String participante = "";
  for (int i = 0; i < convidados.size(); i++) {
    participante += convidados.get(i);
    if (i < convidados.size() - 1) {
      participante += ", ";
    }
  }
  return participante;
}

public class textoCartaz() {
  System.out.println("Reunião: " + assunto);
  System.out.println("Dia " + dia + " às " + hora + " no " + local);
  System.out.println("Organizador: " + organizador + " - Convidados: " + convidados());
  System.out.println(nroParticipantes() + " participantes");
}

public class Teste{
  public void executar() {
    Reuniao runiao = new Reuniao("Reunião de apresentação", 10, 14, "João");
    runiao.definirLocal("Sala 1");
    runiao.adicionarConvidado("Maria");
    runiao.adicionarConvidado("José");
    runiao.adicionarConvidado("Pedro");
    runiao.textoCartaz();
  }
}

public class App {
  public static void main(String[] args) {
    Teste t = new Teste();
    t.executar();
  }
}
