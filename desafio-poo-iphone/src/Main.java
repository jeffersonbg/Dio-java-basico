import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Happy Face");

        iphone.ligar("+55 84 996961490");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
