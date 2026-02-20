package unidade02.ex01;

public class Veiculo {
    //  Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo, cada um deve possuir pelo menos 2 atributos e um metodo a mais
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
}
