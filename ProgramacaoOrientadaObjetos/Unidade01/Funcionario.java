package Unidade01;
public class Funcionario {
    // Implemente uma classe Funcionario com características como nome, cargo, salário e método para calcular aumento de salário.

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calculaAumentoSalario(double porcentagemAumento) {
        return salario + (salario * (porcentagemAumento / 100));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        int porcentagemAumento = 15;
        Funcionario funcionario = new Funcionario("Samuel", "Programador", 2500);
        System.out.println("Salário atual: " + funcionario.getSalario());
        System.out.println("Salário com aumento de " + porcentagemAumento + "% -> " + funcionario.calculaAumentoSalario(porcentagemAumento));
         
    }
    
}
