package fundamentos_1.desafios_de_fundamentos;

import java.util.Scanner;

public class desafio_area_triangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cálculo de área do triangulo");

        System.out.println("informe a altura do triangulo: ");
        double altura = entrada.nextDouble();

        System.out.println("informe o tamanho da base do triangulo ");
        double base = entrada.nextDouble();

        double area = (base * altura) / 2;
        System.out.print("a área do triangulo é : " + area);
        entrada.close();
    }
}

