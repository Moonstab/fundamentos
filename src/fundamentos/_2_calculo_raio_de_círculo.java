package fundamentos;

public class _2_calculo_raio_de_círculo {
    public static void main(String[] args) {

        double raio = 3.4;
        final double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.println("Area =" + area + " m2");
        raio = 10;
        area = pi * raio * raio;
        System.out.println("Area =" + area + " m2");

    }
}