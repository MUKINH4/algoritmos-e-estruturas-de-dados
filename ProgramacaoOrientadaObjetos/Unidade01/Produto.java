package Unidade01;
public class Produto {
    // Crie uma classe Produto com atributos como nome, preço e método para calcular o preço com desconto. 

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoDesconto(double desconto) {
        return preco - (preco * (desconto / 100));
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Coca-Cola", 10);
        int porcentagemDesconto = 10;
        System.out.println("O Produto " + produto.getNome() + " com desconto de " + porcentagemDesconto + "% é: " + produto.precoDesconto(porcentagemDesconto));
    }
}
