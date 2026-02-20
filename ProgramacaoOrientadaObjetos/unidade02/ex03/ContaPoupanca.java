package unidade02.ex03;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaDeRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public double calcularRendimentoMensal() {
        return getSaldo() * (taxaDeRendimento / 100);
    }
}
