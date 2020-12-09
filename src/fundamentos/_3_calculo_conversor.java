package fundamentos;//CONVERTER FAHRENHEIT EM CELCIUS

//formula de convers�o fahrenheit para Celsius
//(�F - 32) x 5/9 =  �C
public class _3_calculo_conversor {
    public static void main(String[] args) {

        final double ajuste = 32;
        double fator = 5 / 9.0;
        double fah = 86;
        double cel = (fah - ajuste) * fator;
        System.out.println("O valor em Celcius � " + cel + "�C");

// CTRL+ALT+SETA CIMA/BAIXO duplica a linha de c�digo

        fah = 150;
        cel = (fah - ajuste) * fator;
        System.out.println("O valor em Celcius � " + cel + "�C");


    }
}

