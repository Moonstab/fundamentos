package Classe_Métodos_3;

//definição de um TIPO com 3 variáveis
//pertencentes ao OBJETO (armazenando as mesmas variáveis)
public class Produto {  //OBJETO "Produto"
    String nome;                        //atributo
    double preco;                       //atributo
    static double desconto = 0.25;    //atributo

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial)//construtor com 3 métodos
    {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
