package unidade02.ex08;

public class Galinha extends Ave{

    public Galinha(double peso, double altura, String habitat, Genero genero, String nome, double envergaduraAsas) {
        super(peso, altura, habitat, genero, nome, envergaduraAsas);
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Cocoricó");
    }
    
}
