package fundamentos_2;

public class _13_op_relacionais {
    public static void main(String[] args){
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 4);
        System.out.println(3 <= 4);
        System.out.println(3 != 4);


        double nota = 7.3;
        boolean bomcomportamento = true;
        boolean passouPORmedia = nota >= 7;
        boolean temDesconto = bomcomportamento && passouPORmedia;

        System.out.println("tem desconto? " + temDesconto);
    }
}
