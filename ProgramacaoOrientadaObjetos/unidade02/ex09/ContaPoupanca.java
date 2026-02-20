package unidade02.ex09;

public class ContaPoupanca extends ContaBancaria {
    private static final double JUROS_CONTA_POUPANCA = 0.065;  // 6.5%

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    // Sobrescrevendo o método aplicarJuros na ContaPoupanca
    @Override
    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_CONTA_POUPANCA;
        depositar(juros);
        System.out.println("Juros de " + (JUROS_CONTA_POUPANCA * 100) + "% aplicados na Conta Poupança.");
    }
}
