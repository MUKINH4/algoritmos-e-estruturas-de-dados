package unidade02.ex05;

import unidade02.ex05.Animal.Genero;

public class Main {
    /* 
        Adicione um método emitirSom à classe base Animal do exercício 2. Sobrescreva esse método nas
        subclasses para emitir sons específicos de cada tipo de animal.
    */

    public static void main(String[] args) {
        Animal cachorro = new Cachorro(10, 100, "Doméstico", Genero.MACHO, "Bidu", true);
        Animal galinha = new Galinha(3, 60, "Galinheiro", Genero.FEMEA, "Zefa", 10.0);
        Animal baleia = new Baleia(150.000, 24, "Oceano", Genero.FEMEA, "Buala", "Salgada");

        cachorro.emitirSom();
        galinha.emitirSom();
        baleia.emitirSom();
    }
}
