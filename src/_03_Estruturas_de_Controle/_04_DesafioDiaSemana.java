package _03_Estruturas_de_Controle;

import java.util.Scanner;

public class _04_DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o nome do dia: ");

        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        }
        if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça")
                || dia.equalsIgnoreCase("terca")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado")
                || dia.equalsIgnoreCase("sabado")) {
            System.out.println(7);
        } else {
            System.out.println("não é um dia válido");
        }

        entrada.close();

    }
}
