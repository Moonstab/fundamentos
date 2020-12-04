package Classe_Métodos_3;
//utilização do tipo PRODUTO criado previamente
public class Produto_teste {
    public static void main(String[] args) {
        Produto p1 = new Produto(); //uso do construtor Produto(); como um método. utilizando o PRODUTO P1
        p1.nome = "Notebook";
        p1.preco = 4000;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 5;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        System.out.println(precoFinal1 + " Preço do Notebook com desconto de 25%");

        double precoFinal2 = p2.preco * (1 - p2.desconto);
        System.out.println(precoFinal2 + " Preço da Caneta Preta com desconto de 25%");

        double mediaCarrinho = ((precoFinal1 + precoFinal2)/ 2);

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
