package unidade02.ex02;

import unidade02.ex02.Animal.Genero;

public class Main {
    // Desenvolva uma hierarquia de classes representando animais, começando com uma classe base Animal e subclasses como Mamifero, Ave e Peixe.
    public static void main(String[] args) {
        Animal cachorro = new Cachorro(10, 100, "Doméstico", Genero.MACHO, "Bidu", true);
        Animal galinha = new Galinha(3, 60, "Galinheiro", Genero.FEMEA, "Zefa", 10.0);
        Animal baleia = new Baleia(150.000, 24, "Oceano", Genero.FEMEA, "Buala", "Salgada");

        galinha.emitirSom();
        baleia.emitirSom();
        cachorro.dormir();
        cachorro.emitirSom();
    }
}
