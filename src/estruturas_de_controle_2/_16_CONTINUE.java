package estruturas_de_controle_2;

public class _16_CONTINUE {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
                // ao contrário do break, a função CONTINUE pula
                // apenas a busca que bate na sua
                // descrição de uma estrutura de controle
                //associada anteriormente
                //BREAK para o código
                // CONTINUE pula e continua.
            }
            System.out.println(i);

        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i == 5) //quando a função IF
                        // se igualou acom condição de i=5
                        // o CONTINUE PULOU e deu continue na função FOR em seguida
                continue;
                System.out.println(i);

        }
    }
}
