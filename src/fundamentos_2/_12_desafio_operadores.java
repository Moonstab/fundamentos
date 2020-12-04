package fundamentos_2;

public class _12_desafio_operadores {
    public static void main(String[] args){
        // Trabalho na terça  (V ou F)
        // trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comproutv50 = trabalho1 && trabalho2;
        boolean comproutv32 = trabalho1 ^ trabalho2;
        boolean comprouSORV = trabalho1 || trabalho2;

        System.out.println("COMPROU TV 50\"? " + comproutv50);
        System.out.println("COMPROU TV 32\"? " + comproutv32);
        System.out.println("COMPROU sorvete\"? " + comprouSORV);
        System.out.println("mais saudável\"? " + !comprouSORV);
    }
}
