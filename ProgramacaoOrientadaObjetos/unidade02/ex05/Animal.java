package unidade02.ex05;

public class Animal {

    enum Genero {
        MACHO, FEMEA
    }

    private double peso;
    private double altura;
    private String habitat;
    private Genero genero;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(double peso, double altura, String habitat, Genero genero, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.habitat = habitat;
        this.genero = genero;
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void dormir() {
        System.out.println("Animal está dormindo!");
    }

    public void emitirSom() {
        System.out.println("Emitindo som genérico...");
    }
}
