package desafio_Classe_Método_2;

public class Jogo {
    String nome;
    double tamanho;
    double valor;

    Jogo(String nome, double tamanho, double valor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
    }
    String jogoApresenta() {
        return "O Jogo " + nome + " pesando " + tamanho + "GB com valor de "+ valor+"R$ será Instalado";
    }
}
