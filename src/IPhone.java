public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public String ligar(Long numero) {
        return "Ligando para o numero: " +numero.toString();
    }

    @Override
    public String atender(Long numero) {
        return "Atendendo a ligação do numero: " + numero.toString();
    }

    @Override
    public String iniciarCorreioVoz(String mensagem) {
        return "Iniciando mensagem de voz: " + mensagem;
    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo a pagina referente a url: "+ url;
    }

    @Override
    public boolean adcionarNovaAba() {
        return true;
    }

    @Override
    public String atualizarPaginna(String url) {
        return  "Atualizando a pagina referente a url: "+ url;
    }

    @Override
    public String tocar(String musica) {
        return "Tocando a musica: " +musica;
    }

    @Override
    public boolean pausar() {
        return true;
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionada a musica: " +musica;
    }
}
