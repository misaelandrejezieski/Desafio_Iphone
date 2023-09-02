interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void desligarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina();
    void adicionarPagina(String url);
    void excluirPagina();
}

interface ReprodutorMusical {
    void selecionarMusica(String musica);
    void tocar();
    void pausar();
}

class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String paginaWeb;
    private String musica;

    public void ligar(String numero) {
        // implementação do método ligar
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        // implementação do método atender
    }

    public void desligarCorreioVoz() {
        // implementação do método desligarCorreioVoz
    }

    public void exibirPagina() {
        // implementação do método exibirPagina
        System.out.println("Exibindo a página: " + paginaWeb);
    }

    public void adicionarPagina(String url) {
        // implementação do método adicionarPagina
        paginaWeb = url;
        System.out.println("Adicionando a página: " + url);
    }

    public void excluirPagina() {
        // implementação do método excluirPagina
        System.out.println("Excluindo a página: " + paginaWeb);
        paginaWeb = null;
    }

    public void selecionarMusica(String musica) {
        // implementação do método selecionarMusica
        this.musica = musica;
        System.out.println("Selecionando a música: " + musica);
    }

    public void tocar() {
        // implementação do método tocar
        System.out.println("Tocando a música: " + musica);
    }

    public void pausar() {
        // implementação do método pausar
        System.out.println("Pausando a música: " + musica);
    }
}

public class Main {
  public static void main(String[] args) {
      Iphone iphone = new Iphone();
      iphone.ligar("123456789");
      iphone.adicionarPagina("https://www.bing.com");
      iphone.exibirPagina();
      iphone.selecionarMusica("Minha música favorita");
      iphone.tocar();
      iphone.pausar();
  }
}
