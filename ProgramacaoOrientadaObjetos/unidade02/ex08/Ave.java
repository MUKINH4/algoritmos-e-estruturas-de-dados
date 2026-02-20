package unidade02.ex08;

public class Ave extends Animal{

    private double envergaduraAsas;

    public Ave(double peso, double altura, String habitat, Genero genero, String nome, double envergaduraAsas) {
        super(peso, altura, habitat, genero, nome);
        this.envergaduraAsas = envergaduraAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som genérico de ave");
    }
}
