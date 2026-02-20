package Unidade01;

public class Circulo {

    // Crie uma classe Circulo que represente um círculo com atributos como raio, área e métodos para calcular a área e o perímetro. 

    private double raio;

    // (A)rea = PI.(r)aio^2

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        double pi = 3.14;

        double area = pi * Math.pow(raio, 2);
        return area;
    }
    
    // P = 2.3,14.r
    double calcularPerimetro() {
        double pi = 3.14;
        double perimetro = 2 * pi * raio;

        return perimetro;

    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);

        System.out.printf("%.2f\n", circulo.calcularArea());
        System.out.printf("%.2f", circulo.calcularPerimetro());
    }
}