package Unidade01;
public class Carro {
    // Crie uma classe Carro com atributos como marca, modelo, ano e métodos para ligar, desligar e acelerar. 

    private String marca;
    private String modelo;
    private int ano;
    private boolean isLigado;
    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.isLigado = false;
    }

    public void ligar() {
        System.out.println("Ligando...");
        setLigado(true);
    }
    public void desligar() {
        System.out.println("Desligando...");
        setLigado(false);
    }
    public void acelerar() {
        System.out.println("Acelerando...");
    }    

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix", 2026);
        carro.desligar();
        carro.ligar();
        if (carro.isLigado) {
            carro.acelerar();
        } else {
            System.out.println("Ligue o carro para acelerar");
        }
    }
}
