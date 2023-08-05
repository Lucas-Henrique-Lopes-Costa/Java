import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imagens {
  public static void main(String[] args) throws Exception {
    String nome = JOptionPane.showInputDialog("Escreva o nome do personagem do Dragon Ball:");

    String nomeImagem = "";
    String enderecoImagem = "";
    switch (nome) {
      case "Goku":
        nomeImagem = "Goku";
        enderecoImagem = "goku-icone";
        break;
      case "Vegeta":
        nomeImagem = "Vegeta";
        enderecoImagem = "vegeta-icone";
        break;
      case "Kuririn":
        nomeImagem = "Kuririn";
        enderecoImagem = "kuririn-icone";
        break;
      case "Piccolo":
        nomeImagem = "Piccolo";
        enderecoImagem = "piccolo-icone";
        break;
      case "Bulma":
        nomeImagem = "Bulma";
        enderecoImagem = "bulma-icone";
        break;

      default:
        nomeImagem = "Não encontrado";
        enderecoImagem = "default";
        break;
    }

    // C:\Users\User\Documents\Projetos\Java\estruturado\5-Bool\src\imagens
    String caminhoImagem = String.format("C:/Users/User/Documents/Projetos/Java/estruturado/5 - Bool/src/imagens/%s.png", enderecoImagem);
    ImageIcon imagem = new ImageIcon(caminhoImagem);
    JOptionPane.showMessageDialog(null, nomeImagem, nomeImagem, JOptionPane.INFORMATION_MESSAGE, imagem);
  }
}
