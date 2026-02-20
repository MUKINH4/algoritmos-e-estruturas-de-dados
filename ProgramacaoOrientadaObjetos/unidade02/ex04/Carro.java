package unidade02.ex04;

public class Carro extends Veiculo {

    private int portas;
    private String tipoCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro(String modelo, int ano, int portas, String tipoCombustivel) {
        super(modelo, ano);
        this.portas = portas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + getPortas());
        System.out.println("Tipo combustível: " + getTipoCombustivel());
    }
    
}
