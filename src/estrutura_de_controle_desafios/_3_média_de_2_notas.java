package estrutura_de_controle_desafios;

import java.util.Scanner;

public class _3_média_de_2_notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("sua média é " + media + " você está APROVADO");
        } else if (media >= 4 && media < 7) {
            System.out.println("sua média é " + media + " você está na FINAL");
        } else
            System.out.println("sua média é " + media + " você está REPROVADO");
        System.out.println();

        entrada.close();
    }
}
