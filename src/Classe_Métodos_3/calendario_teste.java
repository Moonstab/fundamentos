package Classe_Métodos_3;

public class calendario_teste {
    public static void main(String[] args) {
        calendario d1 = new calendario(); //uso do construtor Produto(); como um método. utilizando o PRODUTO P1
        d1.dia = 29;
        d1.mes = 8;
        d1.ano = 2021;
        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);

        var d2 = new calendario();
        d2.dia = 9;
        d2.mes = 6;
        d2.ano = 2021;
        System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
