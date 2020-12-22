package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _1_verificar_numero_par {
    public static void main(String[] args) {

        System.out.println("verificador se o números que você insere\n" +
                "entre 0 e 100 e se ele é um número par ou ímpar");

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        if (num % 2 == 0 && num <= 100) {
            System.out.printf("O numéro %d é número PAR.\n", num);
        } else if (num % 2 == 1 && num <= 100) {
            System.out.printf("o número %d é número IMPAR.\n", num);
        } else System.out.println("número invalido");
        System.out.println("Fim");
        entrada.close();
    }
}
