package Unidade01;
public class ContaBancaria {
    // Desenvolva uma classe ContaBancaria com atributos como saldo, número da conta e métodos para depositar e sacar. 

    private double saldo;
    private int numeroConta;
   
    public ContaBancaria(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
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

    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(200, 1);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.depositar(20);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.sacar(10);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.sacar(00);
        contaBancaria.sacar(-10);
        System.out.println(contaBancaria.getSaldo());

    }
}
