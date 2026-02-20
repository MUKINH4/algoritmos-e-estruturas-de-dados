package Unidade01;
public class Retangulo {
    // Implemente uma classe Retangulo com atributos como comprimento, largura e métodos para calcular a área e o perímetro. 

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4, 2);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
