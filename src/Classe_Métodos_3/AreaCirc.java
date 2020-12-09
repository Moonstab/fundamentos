package Classe_Métodos_3;

public class AreaCirc {

    double raio;
    public static double pi = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return pi * raio * raio; //ou return pi * Math.pow(raio, 2);
    }
}

