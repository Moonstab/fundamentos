package desafio_Classe_Método_2;

public class Conta {
    double gasto;
    String jogosInstalados = "";
    String login;
    double hddOcupado;

    Conta(String login, double hddOcupado) {
        this.login = login;
        this.hddOcupado = hddOcupado;

    }

    void instalar(Jogo jogo) {
        if (jogo != null) {
            this.hddOcupado += jogo.tamanho;
            this.jogosInstalados += jogo.nome + ", ";
            this.gasto += jogo.valor;
        }

    }

    String contaGeral() {
        return "A conta " + login + " e tenho " + hddOcupado + "GB ocupados com " + jogosInstalados + ".\n";
    }
}
