package unidade02.ex07;

public class Retangulo extends FormaGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Sobrescrevendo os métodos para calcular área e perímetro do retângulo
    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}