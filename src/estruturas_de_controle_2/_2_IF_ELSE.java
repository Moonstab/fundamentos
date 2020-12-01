package estruturas_de_controle_2;

import javax.swing.*;

public class _2_IF_ELSE {

    public static void main(String[] args) {
        //comando que gera um pop-up para inserir um dado
        String valor = JOptionPane.showInputDialog("Informe um numero: ");
        //recebe o valor dentro do pop-up
        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        }
        else System.out.println("O número " + numero + " é ímpar");
    }
}