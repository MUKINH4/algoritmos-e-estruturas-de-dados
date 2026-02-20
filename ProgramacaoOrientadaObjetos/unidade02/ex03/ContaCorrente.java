package unidade02.ex03;

public class ContaCorrente extends ContaBancaria {
    private double taxaDeManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaDeManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaDeManutencao = taxaDeManutencao;
    }

    public double getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    // Método específico para ContaCorrente
    public void descontarTaxaDeManutencao() {
        sacar(taxaDeManutencao);
        System.out.println("Taxa de manutenção descontada. Novo saldo: R$" + getSaldo());
    }
}
