package unidade02.ex07;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Área e Perímetro do Círculo:");
        System.out.printf("Área: %.2f %n",circulo.calcularArea());
        System.out.printf("Perímetro: %.2f %n",circulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Retângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println("\nÁrea e Perímetro do Triângulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
