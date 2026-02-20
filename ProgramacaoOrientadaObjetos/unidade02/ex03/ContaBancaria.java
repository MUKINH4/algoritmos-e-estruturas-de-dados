package unidade02.ex03;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantidade) {
        if (quantidade > 0) {
            saldo += quantidade;
        } else {
            System.out.println("Valor menor ou igual a 0");
        }
    }

    public void sacar(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Você não pode sacar um número negativo ou zero");
        } else if (saldo >= quantidade) {
            saldo -= quantidade;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}