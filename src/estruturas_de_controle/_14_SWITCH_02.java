package estruturas_de_controle;

import java.util.Scanner;

public class _14_SWITCH_02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9: //na mesa linha, informam o mesmo resultado para cada case
                conceito = "A";
                break; //quebra de case acima
            case 8: //quebrando a linha informam o mesmo resultado para cada case
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "F";
                break;
            default:
                conceito = "não informado";
        }
        System.out.println("Conceito " + conceito);
        entrada.close();
    }
}

