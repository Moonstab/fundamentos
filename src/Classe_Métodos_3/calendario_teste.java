package Classe_Métodos_3;

public class calendario_teste {
    public static void main(String[] args) {
        calendario d1 = new calendario(29, 8, 2021);
        //d1.dia = 29;
        //d1.mes = 8;
        //d1.ano = 2021;
        System.out.printf(d1.obterDataFormatada());

        var d2 = new calendario(9, 6, 2021);
        //d2.dia = 9;
        //d2.mes = 6;
        //d2.ano = 2021;
        System.out.printf(d2.obterDataFormatada() + "\n");
    }
}


        //utilizei \n para pular a linha e mostrar a segunda
        //função com o "imprimirDataFormatada" criada no objeto CALENDARIO
        //esta função serviu apenas para chamar outra função (exemplo)
        //d1.imprimirDataFormatada();
        //d2.imprimirDataFormatada();

