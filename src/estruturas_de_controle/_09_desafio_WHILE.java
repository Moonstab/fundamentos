package estruturas_de_controle;

import java.util.Scanner;

// calculo de média de notas com numeros de notas indefinidos
public class _09_desafio_WHILE {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDEnotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota ou -1 para divulgar a média: ");
            nota = entrada.nextDouble();

            //condição para a nota inserida
            // maior que 0 e menor que 10 =
            //cada nota inserida seja somada e inserida na variavel **total**
            //aumente o total de notas inseridas na variável **quantidadeDEnotas**
            if (nota >= 0 && nota <= 10) {
                total += nota;
                quantidadeDEnotas++;
            }
            //se a nota for diferente do IF acima e de -1
            //imprime esta mensagem de nota inválida
            else if (nota != -1) {
                System.out.println("nota inválida!");
            }
        }
        //calculo da média
        double media = total / quantidadeDEnotas;
        System.out.printf("Média é %.2f: ", media);
        entrada.close();
    }
}
