package unidade02.ex04;

public class Main {
    /* Utilizando as classes Carro e Moto do exercício 1, crie um método na classe base Veiculo chamado 
        imprimirInformacoes que seja sobrescrito nas subclasses para exibir informações específicas de cada
        veículo.
    */

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 1970, 2, "Gasolina");
        Moto moto = new Moto("Harley Davidson", 2022, 1500, true);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
    }
}
