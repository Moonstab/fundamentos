package estruturas_de_controle_2;

import java.util.Scanner;

public class _8_DO_WHILE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto ="";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();

        } while (!texto.equalsIgnoreCase("por favor")) ;

    System.out.println("Muito bem, obrigado!");
    entrada.close();
    }
}