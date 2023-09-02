# Desafio_Iphone
Desafio da trilha básica de java do BootCamp DIO-SANTADER
![image](https://github.com/misaelandrejezieski/Desafio_Iphone/assets/142842224/0a806033-98ca-46ae-93c0-954788f111a9)

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
```
