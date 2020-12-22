package _05_Classe_Métodos;

public class _03_AreaCirc_teste {

    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(8);
        System.out.println(a2.area());

        System.out.println("\nvalor do PI determinado dentro da CLASSE AreaCirc " + AreaCirc.pi);
        System.out.println("valor do PI dentro do MATH do proprio JAVA " + Math.PI);
    }
}
