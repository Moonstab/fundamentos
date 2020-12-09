package estrutura_de_controle_desafios;

import java.util.Scanner;

public class _8_rece_STRING_imprime_soletrando {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra.");

        String palavra = entrada.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            //System.out.print(letras[i]+" "); // para imprimir na mesma linha
            // adicionando um espaço entre as letras
            System.out.printf("%s ", letras[i]);
        }

        System.out.println("\nFIM");
        entrada.close();
    }
}
