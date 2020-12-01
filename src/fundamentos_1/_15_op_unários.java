package fundamentos_1;

public class _15_op_unários {
    public static void main(String[] args){
        int a = 1;
        int b = 2;

        a++; //a =a+1
        //a--; a =a-1
        System.out.println(a);

        ++b; //b =b-1
        //--b; b =b-1
        System.out.println(b);

        System.out.println("mini desafio...");
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
