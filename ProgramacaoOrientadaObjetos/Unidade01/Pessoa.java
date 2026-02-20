package Unidade01;
public class Pessoa {
    // Desenvolva uma classe Pessoa que tenha atributos como nome, idade e método para cumprimentar.

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    void cumprimentar() {
        System.out.printf("Olá meu nome é %s e eu tenho %d anos.", nome, idade);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Samuel", 20);
        pessoa.cumprimentar();
    }
}
