package _03_Estruturas_de_Controle;

public class _15_BREAK {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
                // INTERROMPE o FOR
                // no momento que a variavel alcança
                //a condição exposta no IF
                //não executando aquele comando do FOR
            }
            System.out.println(i);
        }
        System.out.println("FIM!");
    }
}
