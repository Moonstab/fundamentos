package fundamentos_desafios;

import java.util.Scanner;

public class desafio_IMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de IMC adulto");

        System.out.println("informe seu peso:  ");
        double p = entrada.nextDouble();

        System.out.println("informe sua altura em cm  ");
        double a = entrada.nextDouble();

        double imc = p / (a * a);
        System.out.print("Seu IMC é : " + imc);
        entrada.close();
    }
}

