package estruturas_de_controle;

import java.util.Scanner;

public class _7_WHILE_02 {
    public static void main(String[] args) {
        System.out.println("Para fechar este laço, digite SAIR");

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equals("sair")) {
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}


