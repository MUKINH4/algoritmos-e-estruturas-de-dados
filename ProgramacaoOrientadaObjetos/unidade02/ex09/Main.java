package unidade02.ex09;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("111", 2000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("222", 3000.0);

        // Aplicando juros nas contas
        contaCorrente.aplicarJuros();
        contaPoupanca.aplicarJuros();

        // Visualizando saldos após juros
        System.out.println("\nSaldo após juros na Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo após juros na Conta Poupança: R$" + contaPoupanca.getSaldo());
    }
}
