package Arrays_e_Collections_4;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));//nenhum atributo atribuido

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[2] = 9;
        System.out.println("NOTAS ALUNOA " + Arrays.toString(notasAlunoA));//atributos atribuidos acima

        double total = 0;
        //variavel.lenght = percorre array inteiro que foi posto (array é um objeto)
        //evitando assim ter que determinar o valor no laço FOR
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println("média: " + total / notasAlunoA.length + "\n");

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
