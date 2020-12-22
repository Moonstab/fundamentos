package _04_Estrutura_de_Controle_Desafios;

import java.util.Random;
import java.util.Scanner;

public class _6_advinhação {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {
            System.out.println("Um numero entre 0 a 100..\n");
            Random numeroALEATORIO = new Random();
            numeroSorteado = numeroALEATORIO.nextInt(101);

            System.out.println("Iniciou o jogo! Será que consegues advinhar o número aleatório? ");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativa %d ", tentativas);
                numero = entrada.nextInt();
                if (numero > numeroSorteado){
                    System.out.printf("\nO numero sorteado é menor que %d\n", numero);
                } else if(numero < numeroSorteado){
                    System.out.printf("\nO numero sorteado é maior que %d\n", numero);;
                } else {
                    System.out.printf("\nParabéns! você acertou o número em %d tentativas\n", tentativas);
                }
            } while (numero != numeroSorteado);
                System.out.println("Digite 0 para sair");
                continuar = entrada.nextInt();

                }while (continuar != 0);
                entrada.close();
            }
            }
            

