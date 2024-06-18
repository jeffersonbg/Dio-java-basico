package aparelho;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);

    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUSICA : " + musica + " SELECIONADA");

    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO...");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);

    }

}
