package fundamentos_1.desafios_de_fundamentos;

import java.util.Scanner;

public class desafio_temperatura_fahrenheit {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("a temperatira em fahrenheit  ");
        double f = entrada.nextDouble();

        double c = (f - 32) / 1.8;
        double k = (f + 459.67) * 5/9;

        System.out.printf("A temperatura %.2f em Fahrenheit corresponde a %.2f Celcius e %.2f Kelvin ", f, c, k);
        entrada.close();
    }
}

