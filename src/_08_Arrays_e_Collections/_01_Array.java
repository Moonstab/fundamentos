package _08_Arrays_e_Collections;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));//nenhum atributo atribuido

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9;

        System.out.println("NOTAS ALUNOA " + Arrays.toString(notasAlunoA));//atributos atribuidos acima
        System.out.println(notasAlunoA[0]); //mostra o primeiro array
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);//mostra o total de array - 1 = ultimo array
        //System.out.println(notasAlunoA[4]);//gera um erro pois n existe array 4


        double total = 0;
        //variavel(objeto).lenght = percorre array inteiro que foi posto (array é um objeto)
        //evitando assim ter que determinar o valor no laço FOR
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println("média: " + total / notasAlunoA.length + "\n");


        //ABAIXO ESTÁ A DEMONSTRACAO DO USO DE ARRAY DE UMA FORMA
        //MAIS SIMPLES DE ENTENDIMENTO E USO POREM É UTILIZADO
        //APENAS QUANDO OS DADOS ESTÃO DISPONÍVEIS
        double[] notasAlunoB = {8, 10, 7, 6.4, 4.2};
        //determina o numero de arrays sem colocar o numero em colchetes
        //o limite é a quantidade adicionada

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("NOTAS ALUNOB " + Arrays.toString(notasAlunoB));
        System.out.println("média do alunoB é: " + totalAlunoB / notasAlunoB.length);
    }
}
