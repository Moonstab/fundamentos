package desafio_Classe_Método_2;

import desafio_Classe_Método.Comida;

public class Conta {
    String login;
    double hddOcupado;

    Conta(String login, double hddOcupado) {
        this.login = login;
        this.hddOcupado = hddOcupado;

    }

    void instalar(Jogo jogo) {
        if (jogo != null) {
            this.hddOcupado += jogo.tamanho;
        }

    }

    String contaGeral() {
        return "A conta " + login + " e tenho " + hddOcupado + "GB Ocupados com jogos.";
    }
}
