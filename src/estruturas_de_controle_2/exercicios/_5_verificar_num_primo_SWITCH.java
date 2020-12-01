package estruturas_de_controle_2.exercicios;

import java.util.Scanner;

public class _5_verificar_num_primo_SWITCH {
    public static void main(String[] args) {
        System.out.println("verificador se o números que\n" +
                "você insere é um número primo");

        int contadorDEdivisores = 0;
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();

        for(int i = 2; i< a; i++){
            if (a % i == 0){
                contadorDEdivisores++;
            }
        }
        switch (contadorDEdivisores) {
            case 0:
                System.out.println("O numero " + a + " é primo");
                break;

            default:
                System.out.println("o numero " + a + " não é primo");
        }
        System.out.println("Fim");
        entrada.close();

    }
}
