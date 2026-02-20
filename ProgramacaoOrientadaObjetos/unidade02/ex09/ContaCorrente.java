package unidade02.ex09;

public class ContaCorrente extends ContaBancaria {
    private static final double JUROS_CONTA_CORRENTE = 0.15;  // 15%

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    // Sobrescrevendo o método aplicarJuros na ContaCorrente
    @Override
    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_CONTA_CORRENTE;
        sacar(juros);
        System.out.println("Juros de " + (JUROS_CONTA_CORRENTE * 100) + "%, removidos do saldo da Conta Corrente.");
    }
}
