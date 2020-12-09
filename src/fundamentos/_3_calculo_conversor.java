package fundamentos;//CONVERTER FAHRENHEIT EM CELCIUS

//formula de conversao fahrenheit para Celsius
//(F - 32) x 5/9 =  C
public class _3_calculo_conversor {
    public static void main(String[] args) {

        final double ajusteF = 32;
        double fator = 5 / 9.0;
        double fah = 32;
        double convcel = (fah - ajusteF) * fator;
        System.out.printf("32 Fahrenheit em Celcius = %.2f\n", convcel);

        double fah2 = 150;
        double convcel2 = (fah2 - ajusteF) * fator;
        System.out.printf("150 Fahrenheit em Celcius = %.2f\n", convcel2);

        //Calculo de temperatura KELVIN para Celcius
        double ajusteK = 273.5;
        double kel = 150;
        double convkel = kel - ajusteK;
        System.out.println("150 kelvin em Celcius = " + convkel + "ºC");
    }
}

