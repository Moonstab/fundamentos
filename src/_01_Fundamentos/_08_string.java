package _01_Fundamentos;

//as Strings só podem ser alteradas com comandos
// de notação ponto ".", esse código mostra
// alguns exemplos a serem usados
public class _08_string {

    public static void main(String[] args) {
        /*utilizado notação ponto com charAT para mostrar
        a letra em cada espaçamento
        que inicia da posição 0*/
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        /*exemplos diferentes de concatenações*/
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        /*verifica se começa com "Boa"*/
        System.out.println(s.startsWith("Boa"));

        /* transforma em minuscula e verifica se começa com "boa"*/
        System.out.println(s.toLowerCase().startsWith("boa"));

        /* verifica a quantidade de letras da String*/
        System.out.println(s.length());

        /* transforma tudo em minúsculas
        e em seguida verifica se termina com "tarde"*/
        System.out.println(s.toLowerCase().endsWith("tarde"));

        // verifica se as letras são iguais
        System.out.println(s.equals("boa tarde"));

        /* verifica se as letras
        estão corretas ignorando
        maiusculas e minúsculas*/
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        double salario = 34000.90;

        //código otimizado para representar esses dados
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f de soldo", nome, sobrenome, idade, salario);

        /* muda o PRINTLN para PRINTF
        %d representa números inteiros
        %.2f representa números floats
        (o .2 é para mostrar duas casas após a virgula)
        %f representa números doubles
        %b representa valores booleanos
        %c representa valores char*/

    }
}




