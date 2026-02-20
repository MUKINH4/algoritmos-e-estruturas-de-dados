package unidade02.ex01;

public class Moto extends Veiculo{

    private int cilindradas;
    private boolean partidaEletrica;

    public Moto(String modelo, int ano, int cilindradas, boolean partidaEletrica) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    public void detalhesMoto() {
        exibirInformacoes();
        System.out.println("Cilindradas: " + getCilindradas());
        System.out.println("Partida elétrica: " + isPartidaEletrica());
    }

}
