package desafio_Classe_Método_2;

public class Jogar {
    public static void main(String[] args) {
        Jogo j1 = new Jogo("Cyberpunk 2077", 75, 200);

        Jogo j2 = new Jogo("Red Dead Redemption", 125, 200);

        Conta a = new Conta("Moonstab", 0);

        System.out.println(a.contaGeral());
        a.instalar(j1);
        System.out.println(a.contaGeral());
        a.instalar(j2);
        System.out.println(a.contaGeral());
    }
}
