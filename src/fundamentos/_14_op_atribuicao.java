package fundamentos;

public class _14_op_atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b;//c = c+b;
        System.out.println(c);

        c -= a; //c= c-a;
        System.out.println(c);

        c *= b; //c=c*b;
        System.out.println(c);

        c /= a; //c=c/a;
        System.out.println(c);

        c %= 2; //c=c%2; 0 ou 1; (0 par e 1 valor impar)
        System.out.println(c);
    }
}
