package Classe_Métodos_3;

public class AreaCirc {

    double raio;
    double pi;

    AreaCirc(double raioInicial){
        double raio = raioInicial;
        static double pi = 3.14;
    }
    double area(){
        return pi * raio * raio; //ou return pi * Math.pow(raio, 2);
    }
}

