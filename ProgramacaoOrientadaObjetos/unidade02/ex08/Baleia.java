package unidade02.ex08;

public class Baleia extends Peixe{

    public Baleia(double peso, double altura, String habitat, Genero genero, String nome, String tipoAgua) {
        super(peso, altura, habitat, genero, nome, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ooooooh-woooom");
    }
    
}
