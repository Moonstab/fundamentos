package Classe_Métodos_3;

public class _04_valor_x_referencia {
    public static void main(String[] args) throws CloneNotSupportedException {
        double a = 2;
        double b = a; //atribuiçoes por valor em tipos primitivos
        a++;
        b--;
        System.out.println(a + "\n" + b + "\n");

        Calendario d1 = new Calendario(10, 12, 2077); //atribuição por referência (OBJETO D1/D2)
        Calendario d2 = (Calendario) d1.clone(); //utilizou o clone de D1 criando um novo objeto

        d1.dia = 31;
        d2.mes = 9;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }


    static void voltarDataParaValorPadrao(Calendario d) { //gera impacto no objeto
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c) { //nao gera impacto na memoria com primitivo
        c++;
    }
}
