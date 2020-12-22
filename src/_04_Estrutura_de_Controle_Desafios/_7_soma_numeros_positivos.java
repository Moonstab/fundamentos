package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _7_soma_numeros_positivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaDeNumeros = 0;
        int num = 0;

        while (num >= 0) {
            System.out.println("Digite um numero positivo (digite numero negativo para sair)");
            num = entrada.nextInt();

            if (num >= 0) {
                somaDeNumeros += num; // somaDeNumeros = somaDeNumeros + num.
                System.out.printf("Soma até o momento corresponde a: %d \n\n", somaDeNumeros);
            }
        }
        System.out.println("FIM");
        entrada.close();
    }
}
