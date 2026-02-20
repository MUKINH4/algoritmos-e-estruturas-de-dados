package unidade02.ex08;

public class Mamifero extends Animal{
    private boolean temPelos;

    public Mamifero(double peso, double altura, String habitat, Genero genero, String nome, boolean temPelos) {
        super(peso, altura, habitat, genero, nome);
        this.temPelos = temPelos;
        
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    public void amamentar() {
        System.out.println(getNome() + "Andando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som genérico mamífero");
    }
    
}
