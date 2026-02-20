package unidade02.ex08;

import java.util.ArrayList;
import java.util.List;

import unidade02.ex08.Animal.Genero;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro(10, 100, "Doméstico", Genero.MACHO, "Bidu", true);
        Animal galinha = new Galinha(3, 60, "Galinheiro", Genero.FEMEA, "Zefa", 10.0);
        Animal baleia = new Baleia(150.000, 24, "Oceano", Genero.FEMEA, "Buala", "Salgada");

        List<Animal> animais = new ArrayList<>();
        animais.add(baleia);
        animais.add(cachorro);
        animais.add(galinha);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
