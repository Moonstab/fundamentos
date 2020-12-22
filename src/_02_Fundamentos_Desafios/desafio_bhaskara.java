package _02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_bhaskara {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Equação : ax² + bx + c = 0");

        System.out.println("digite o valor de A ");
        double a = scanner.nextDouble();

        System.out.println("digite o valor de B ");
        double b = scanner.nextDouble();

        System.out.println("digite o valor de C ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);
        System.out.print("valor de delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("\no x1 positivo é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("\no x2 negativo é: %.2f", x2);
        scanner.close();
    }
}

