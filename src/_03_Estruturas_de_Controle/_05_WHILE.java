package _03_Estruturas_de_Controle;

public class _05_WHILE {
    public static void main(String[] args) {
        int contador = 2;

        //laço while executará a função enquanto a variável
        //não estiver de acordo com a condição do laço

        while (contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }
    }
}
