package unidade02.ex03;

public class Main {
    //  Implemente uma classe ContaBancaria com atributos como saldo e número da conta. Em seguida, crie duas subclasses, ContaCorrente e ContaPoupanca, que herdam de ContaBancaria.
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("372832", 10000.0, 10.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("591293", 200.0, 5.0);

        System.out.println("Conta Corrente: Número " + contaCorrente.getNumeroConta() + ", Saldo R$" + contaCorrente.getSaldo());
        contaCorrente.depositar(200.0);
        contaCorrente.sacar(50.0);
        contaCorrente.descontarTaxaDeManutencao();

        System.out.println("\nConta Poupança: Número " + contaPoupanca.getNumeroConta() + ", Saldo R$" + contaPoupanca.getSaldo());
        contaPoupanca.depositar(100.0);

        // Calcular e aplicar rendimento mensal
        double rendimentoMensal = contaPoupanca.calcularRendimentoMensal();
        System.out.println("Rendimento Mensal: R$" + rendimentoMensal);
        
        // Depositar o rendimento no saldo
        contaPoupanca.depositar(rendimentoMensal);
        
        System.out.println("Novo Saldo: R$" + contaPoupanca.getSaldo());
    }

}
