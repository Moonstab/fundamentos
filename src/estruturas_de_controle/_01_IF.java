package estruturas_de_controle;

import java.util.Scanner;

public class _01_IF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a média ");
        double media = scanner.nextDouble();

        if (media <= 10 && media >= 7) {
            System.out.printf("O aluno está aprovado");
        }
        if (media < 7 && media >= 4.5) {
            System.out.printf("O aluno está em recuperação");
        }
        //outra formula de utilizar
        // IF com uma variavel utilizando a regra booleana
        boolean reprovado = media <= 4.5 && media >= 0;
        if (reprovado) {
            System.out.printf("O aluno está reprovado");
        }
        scanner.close();
    }
}
