package Arrays_e_Collections_4;

import java.util.Arrays;

public class exercicio_Array_ForEach {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9;

        for (double notaA : notasAlunoA) {
            System.out.print("Notas alunoA com ForEach " + notaA + "\n");
        }
        double total = 0;
        for (double nota : notasAlunoA) {
            total += nota;
        }
        double media = total / notasAlunoA.length;
        System.out.println("a média das notas é " + media);

        System.out.println();

        double[] notasAlunoB = {8, 10, 7, 6.4, 4.2};
        for (double notaB : notasAlunoB) {
            System.out.print("Notas alunoB com ForEach " + notaB + "\n");
        }
        double totalAlunoB = 0;
        for (double notaB : notasAlunoB) {
            totalAlunoB += notaB;
        }

        double mediaB = totalAlunoB / notasAlunoB.length;
        System.out.println("a média das notas é " + mediaB);
    }
}
