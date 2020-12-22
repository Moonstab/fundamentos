package _09_Arrays_e_Collections_Desafio;

import java.util.Arrays;
import java.util.Scanner;

public class desafio_foreach {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas Notas: ");

        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(notas));

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("a média das notas é " + media);
        entrada.close();
    }
}
