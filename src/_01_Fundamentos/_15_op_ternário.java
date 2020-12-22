package _01_Fundamentos;

public class _15_op_ternário {

    public static void main(String[] args) {

        double media = 8.3;

        String resultadoFinal = media >= 7.0 ?
                "Aprovado" : " em recuperação";
        System.out.println("O aluno está " + resultadoFinal);


        double nota = 9.9;
        boolean bomcomportamento = true;
        boolean passouPORmedia = nota >= 7;
        boolean temDesconto = bomcomportamento && passouPORmedia;
        String resultado = temDesconto ? "Sim" : "Não";

        System.out.printf("tem desconto? %s ", resultado);
    }
}
