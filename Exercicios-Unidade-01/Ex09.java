import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    
    public Pessoa() {}
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
    }

    private String nome;
    private int idade;
    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Idade: " + idade + " | Endereço - " + endereco;
    }
}

class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco() {}

    public Endereco(String logradouro, int numero, String bairro, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rua: " + logradouro + " | Número: " + numero + " | Bairro: " + bairro + " | Cidade: " + cidade;
    }

}

public class Ex09 {
    // Crie uma classe Pessoa com atributos como nome, idade e endereço. Implemente um programa que permite ao usuário criar e gerenciar uma lista de pessoas.
    
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        do {
            System.out.println("\nEscolha uma Opção: ");
            System.out.println("1 - Mostrar lista");
            System.out.println("2 - Adicionar uma pessoa");
            System.out.println("3 - Remover uma pessoa");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (pessoas.isEmpty()) {
                        System.out.println("Lista vazia!");
                        break;
                    }
                    listarPessoas(pessoas);
                    break;
                case 2:
                    System.out.print("Nome da pessoa: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade da pessoa: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Rua: ");
                    String logradouro = scanner.nextLine();

                    System.out.print("Número: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Bairro: ");
                    String bairro = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();

                    adicionarPessoa(pessoas, nome, idade, logradouro, numero, bairro, cidade);
                    break;
                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("Lista vazia!");
                        break;
                    }
                    listarPessoas(pessoas);
                    System.out.print("Escolha o índice da pessoa que quer remover: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < pessoas.size()) {
                        pessoas.remove(indice);
                        break;
                    } else {
                        System.out.println("Indíce inválido, tente novamente!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != 4);

    }
    public static void adicionarPessoa(List<Pessoa> pessoas, String nome, int idade, String logradouro, int numero, String bairro, String cidade){
        Endereco endereco = new Endereco(logradouro, numero, bairro, cidade);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);
        pessoas.add(pessoa);
    }

    public static void listarPessoas(List<Pessoa> pessoas){
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("["+ i +"] - " + pessoas.get(i));
        }
    }

}


