package estruturas_de_controle_2;

public class _6_FOR {
    public static void main(String[] args) {
        //laço for possui 3 condições:
        //1 = declara variável e seu valor
        //2 = determina condição para a variável
        //3 = determina operação encima da variável
        //no exemplo mostra variavel CONTADOR com valor 1
        //enquanto condator for MENOR ou IGUAL a 20, será executado o comando abaixo
        //após executar o comando, o contador será INCREMENTADO com o valor 2

        for (int contador = 1; contador <=20; contador+=2){
            System.out.printf("i = %d\n", contador);
        }

        //laço infinito
        //não possui nenhuma condição expressa
        //irá retornar infinitamente a operação dentro da função for

        //for (;;){
        //    System.out.println("INFINITO");
        //    }
    }
}

