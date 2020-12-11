package desafio_Classe_Método;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.100);
        Comida c2 = new Comida("Feijão", 0.200);

        Pessoa p = new Pessoa("João", 99.7);

        System.out.println(p.apresentar());
        p.comer(c1);
        p.comer(c2);
        System.out.println(p.apresentar());

    }
}
