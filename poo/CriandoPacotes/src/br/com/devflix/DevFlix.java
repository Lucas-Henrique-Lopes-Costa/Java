import gui.*;
import gui.Botoes.*;
import videos.*;

public class DevFlix {
    public static void main(String[] args) throws Exception {
        Anime anime = new Anime();
        Documentario documentario = new Documentario();
        Filme filme = new Filme();
        Novela novela = new Novela();
        Serie serie = new Serie();

        Janela janela = new Janela();
        MinuaturaVideo minuaturaVideo = new MinuaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoPause botaoPause = new BotaoPause();
        BotaoVoltar botao = new BotaoVoltar();
    }
}
