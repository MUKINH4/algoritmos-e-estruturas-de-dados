package unidade02.ex02;

public class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(double peso, double altura, String habitat, Genero genero, String nome, String tipoAgua) {
        super(peso, altura, habitat, genero, nome);
        this.tipoAgua = tipoAgua;
    }

    void nadar() {
        System.out.println("Peixe nadando...");
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
}
