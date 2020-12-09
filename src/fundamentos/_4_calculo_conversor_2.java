package fundamentos;

public class _4_calculo_conversor_2 {

    public static void main(String[] args) {
//Conversor real para d�lar
        double real = 1;
        double dol = 5.53;
        double conv = real * dol;
        System.out.println("O valor do real em 09/10/2020 é " + conv);

//Conversor real para d�lar
        real = 1450;
        dol = 5.53;
        conv = real * dol;
        System.out.println("O valor de 1450 reais em 09/10/2020 é " + conv);

//Calculo de temperatura KELVIN
        double ajuste = 273.5;
        double kel = 320;
        double cel = kel - ajuste;
        System.out.println("a temperatura em kelvin é " + cel + "ºC");

    }
}
