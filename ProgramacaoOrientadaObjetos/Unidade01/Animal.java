package Unidade01;
public class Animal {
    // Desenvolva uma classe Animal com características como nome, tipo de alimentação e método para emitir som.

    public enum TipoAlimentacao {
        CARNIVORO,
        HERBIVORO,
        ONIVORO
    }

    private String nome;
    private TipoAlimentacao tipoAlimentacao;

    public Animal(String nome, Animal.TipoAlimentacao tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void emitirSom() {
        System.out.println("Som genérico.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Gato", TipoAlimentacao.CARNIVORO);
        animal.emitirSom();
    }
}
