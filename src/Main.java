public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        String musica = "0% Angel - Mr.Kitty";
        System.out.println(iPhone.tocar(musica));
        if (iPhone.pausar()) {
            System.out.println("Musica " + musica + " pausada");
        }
        System.out.println(iPhone.selecionarMusica("Lost In The Echo - Linkin Park"));

        System.out.println(iPhone.ligar(9999999L));
        System.out.println(iPhone.atender(9888888L));
        System.out.println(iPhone.iniciarCorreioVoz
                ("Alo sou eu o Adelane, quando tiver como me liga de volta"));

        System.out.println(iPhone.exibirPagina("web.dio.me"));
        if (iPhone.adcionarNovaAba()) {
            System.out.println("Nova aba aberta");
        }
        System.out.println(iPhone.atualizarPaginna("web.dio.me"));
    }
}