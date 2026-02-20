package unidade02.ex02;

public class Cachorro extends Mamifero {

    public Cachorro(double peso, double altura, String habitat, Genero genero, String nome, boolean temPelos) {
        super(peso, altura, habitat, genero, nome, temPelos);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Au au");
    }
    
}
