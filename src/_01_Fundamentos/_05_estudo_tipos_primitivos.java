package _01_Fundamentos;

public class _05_estudo_tipos_primitivos {

    public static void main(String[] args) {
        //informções do usuário

        //tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;

		/*utilizar o L maiusculo no fim do numeral,
		*ele marca como LONG, se passar de 3Bilhoes
		não cabe em INT */

        long pontosAcumulados = 3_222_254_223L;

        //Tipos num�ricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_788_103.12;

        //Tipo booleano
        boolean estaDeFerias = false; //ou true

        //tipo de caractere


		/*ativo, pode colocar apenas 1 caractere)
		* ou c�digo inicial com \u0010
		 (codigo aleatorio ap�s o contrabarra+u)
		*/
        char status = 'A';

        //USO DE TODOS OS TIPOS PRIMITIVOS DE LINGUAGEM

        //dias de empresa + n�meros de viagem
        System.out.println(anosDeEmpresa * 365);
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        //sal�rio e verificacao se esta de ferias
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("F�rias? " + estaDeFerias);

        //* teste aleat�rio de print de valor char
        System.out.println("Status: " + status);


    }

}
