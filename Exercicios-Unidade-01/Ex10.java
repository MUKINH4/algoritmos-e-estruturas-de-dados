import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
        
	public Produto() {}
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	private String nome;
	private double preco;
	private int quantidade;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

public class Ex10 {
	// Implemente um sistema de gerenciamento de estoque para uma loja, permitindo ao usuário adicionar, remover e atualizar itens no estoque. Utilize classes, listas e estruturas condicionais.

	public static void main(String[] args) {
		int opcao;
        Scanner scanner = new Scanner(System.in);
		List<Produto> estoque = new ArrayList<>();
		boolean continuar = true;

		while (continuar) {
			System.out.println("\nEscolha uma Opção: ");
			System.out.println("1 - Mostrar estoque");
			System.out.println("2 - Adicionar um produto");
			System.out.println("3 - Atualizar um produto");
			System.out.println("4 - Remover um produto");
			System.out.println("5 - Sair");
			opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
				case 1:
					if (estoque.isEmpty()) {
						System.out.println("Estoque vazio");
						break;
					}
					mostrarEstoque(estoque);
					break;
				case 2:
					System.out.print("Nome do produto: ");
					String nome = scanner.nextLine();

					System.out.print("Preço do produto: ");
					double preco = scanner.nextDouble();

					System.out.print("Quantidade do produto: ");
					int quantidade = scanner.nextInt();
					adicionarProduto(estoque, nome, preco, quantidade);
					break;
				case 3:
					if (estoque.isEmpty()) {
						System.out.println("Estoque vazio, nada para atualizar");
						break;
					}
					mostrarEstoque(estoque);
					System.out.print("Escolha o índice do item do estoque de deseja atualizar: ");
					int indice = scanner.nextInt();
					scanner.nextLine();
					if (indice >= 0 && indice < estoque.size()) {
						System.out.println("1 - Nome");
						System.out.println("2 - Preço");
						System.out.println("3 - Quantidade");
						System.out.print("Agora escolha o que deseja alterar: ");
						int escolha = scanner.nextInt();
						scanner.nextLine();

						switch (escolha) {
							case 1:
								System.out.print("Agora escolha o nome para qual deseja atualizar: ");
								String nomeAtt = scanner.nextLine();
								atualizarNome(estoque, nomeAtt, indice);
								System.out.println("Atualizado com sucesso!");
								mostrarEstoque(estoque);
								break;
							case 2:
								System.out.print("Agora escolha o preço para qual deseja atualizar: ");
								double precoAtt = scanner.nextDouble();
								if (precoAtt >= 0.0) {
									atualizarPreco(estoque, precoAtt, indice);
									break;
								}
								System.out.println("Atualizado com sucesso!");
								mostrarEstoque(estoque);
								break;
							case 3:
								System.out.print("Agora escolha a quantidade para qual deseja atualizar: ");
								int quantidadeAtt = scanner.nextInt();
								if (quantidadeAtt >= 0) {
									atualizarQuantidade(estoque, quantidadeAtt, indice);
									System.out.println("Atualizado com sucesso!");
									mostrarEstoque(estoque);
									break;
								} else {
									System.out.println("Quantidade inválida");
									break;
								}
							default:
								break;
						}
						
					} else {
						System.out.println("Índice inválido");
					}
					break;
				case 4:
					mostrarEstoque(estoque);
					System.out.print("Escolha o índice do produto que deseja remover: ");
					int indiceRemover = scanner.nextInt();
					if (indiceRemover >= 0 && indiceRemover < estoque.size()) {
						removerProduto(estoque, indiceRemover);
						System.out.println("Removido com sucesso!");
						break;
					} else {
						System.out.println("Índice inválido");
					}
					break;
				case 5:
					System.out.println("Saindo...");
					continuar = false;
					scanner.close();
					break;
				default:
					break;
			}

		}
	}

	public static void mostrarEstoque(List<Produto> estoque) {
		for (int i = 0; i < estoque.size(); i++) {
			System.out.println("Índice [" + i + "] -> " + 
				estoque.get(i).getNome() + 
				": R$" + estoque.get(i).getPreco() +
				" - " + estoque.get(i).getQuantidade() + " Itens");
		}
	}

	public static void adicionarProduto(List<Produto> estoque, String nome, double preco, int quantidade) {
		estoque.add(new Produto(nome, preco, quantidade));
	}

	public static void atualizarQuantidade(List<Produto> estoque, int quantidade, int indice) {
		estoque.get(indice).setQuantidade(quantidade);
	}

	public static void atualizarNome(List<Produto> estoque, String nome, int indice) {
		estoque.get(indice).setNome(nome);
	}

	public static void atualizarPreco(List<Produto> estoque, double preco, int indice) {
		estoque.get(indice).setPreco(preco);
	}

	public static void removerProduto(List<Produto> estoque, int indice) {
		estoque.remove(indice);
	}

}
