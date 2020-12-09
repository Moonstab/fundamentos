package estruturas_de_controle;

public class _12_desafio_FOR {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
        System.out.println();
        //mesma forma do for sem utilizar valores numericos
        for (String v = "#"; !v.equalsIgnoreCase("######"); v += "#") {
            System.out.println(v);
        }
    }
}
