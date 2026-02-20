package Unidade01;
public class Triangulo {
    // Implemente uma classe Triangulo com atributos como base, altura e método para calcular a área. 

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(15, 3);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
    }
}
