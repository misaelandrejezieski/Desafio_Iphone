# Desafio_Iphone

```
require 'redcarpet'
markdown = Redcarpet.new("DIO.ME")
puts markdown.to_html
´´´

Desafio da trilha básica de java do BootCamp DIO-SANTADER

   ```
classDiagram
    class Iphone {
        ReprodutorMusica reprodutorMusica
        AparelhoTelefone aparelhoTelefone
        NavegarInternet navegarInternet
    }
    class ReprodutorMusica {
        +selecionarMusica()
        +tocar()
        +pausar()
    }
    class AparelhoTelefone {
        +ligar()
        +atender()
        +desligar()
    }
    class NavegarInternet {
        +exibirPagina()
        +adicionarPagina()
        +excluirPagina()
    }
    Iphone --> ReprodutorMusica
    Iphone --> AparelhoTelefone
    Iphone --> NavegarInternet

