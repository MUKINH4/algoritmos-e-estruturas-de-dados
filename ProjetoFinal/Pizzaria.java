package ProjetoFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ProjetoFinal.Pizza.TamanhoPizza;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Cliente> listaClientes = new ArrayList<>();
        List<Pedido> listaPedidos = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Fazer um novo pedido");
            System.out.println("2 - Alterar um pedido");
            System.out.println("3 - Adicionar um cliente");
            System.out.println("4 - Gerar relatório de vendas");
            System.out.println("5 - Gerar lista de clientes");
            System.out.println("6 - Calcular frete");
            System.out.println("9 - Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    fazerPedido(scanner, listaPedidos, listaClientes);
                    break;
                case 2:
                    alterarPedido(scanner, listaPedidos);
                    break;
                case 3:
                    listaClientes.add(adicionarCliente(scanner)); 
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 4:
                    gerarRelatorio(listaPedidos);
                    break;
                case 5:
                    gerarListaClientes(listaClientes);
                    break;
                case 6:
                    if (listaPedidos.isEmpty()) {
                        System.out.println("Não há pedidos cadastrados.");
                        break;
                    }

                    listarPedidos(listaPedidos);

                    System.out.print("Escolha o ID do pedido para calcular o frete: ");
                    int idFrete = scanner.nextInt();
                    scanner.nextLine();

                    if (idFrete >= 1 && idFrete <= listaPedidos.size()) {

                        Pedido pedidoFrete = listaPedidos.get(idFrete - 1);

                        System.out.print("Digite a distância em KM: ");
                        double distancia = scanner.nextDouble();
                        scanner.nextLine();

                        double frete = calcularFrete(pedidoFrete, distancia);

                        double totalComFrete = pedidoFrete.getValorTotal() + frete;

                        System.out.println("Total com frete: R$ " + totalComFrete);

                    } else {
                        System.out.println("ID inválido!");
                    }

                    break;
                case 9:
                    System.out.println("Até amanha...");
                    continuar = false;
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    
    }

    private static double calcularFrete(Pedido pedido, double distanciaKm) {
        double valorPorDistancia = 2.5;
        double valorPorPizza = 2;

        double quantidadePizzas = pedido.getPizzas().size();

        double freteDistancia = distanciaKm * valorPorDistancia;
        double fretePeso = quantidadePizzas * valorPorPizza;

        return freteDistancia + fretePeso; 
    }

    private static void fazerPedido(Scanner scanner, List<Pedido> listaPedidos, List<Cliente> listaClientes) {
        if (!listaClientes.isEmpty()) {

            List<Pizza> pizzas = new ArrayList<>();
            System.out.println("FAZER PEDIDO");
    
            int x = 1;
            System.out.println("Selecione um cliente: ");
            for (Cliente cliente : listaClientes) {
                System.out.println(x+" - "+cliente.getNome());
                x++;
            }
            System.out.print("Opção: ");
            int cliente = scanner.nextInt();
            scanner.nextLine();
    
            boolean continuar = true;
            while (continuar) {
                
                Pizza pizza = criarPizza(scanner);
                pizzas.add(pizza);
    
                System.out.println("Pizza cadastrada com sucesso!");
    
                System.out.println("Deseja cadastrar mais uma pizza no pedido?");
                System.out.print("1 - Sim, 2 - Não: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
    
                if(opcao != 1){
                    continuar = false;
                }
            }
            Pedido pedido = new Pedido(listaPedidos.size()+1,listaClientes.get(cliente-1), pizzas, somarPizzas(pizzas));
            listaPedidos.add(pedido);
        } else {
            System.out.println("Lista de clientes vazia!");
        }
    }

    private static double somarPizzas(List<Pizza> pizzas) {
        double valorTotal = 0;
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }

    private static void alterarPedido(Scanner scanner, List<Pedido> listaPedidos) {
        listarPedidos(listaPedidos);
        if (!listaPedidos.isEmpty()) {
            System.out.print("Escolha o ID do pedido que deseja mudar: ");
            int idPedido = scanner.nextInt();
            scanner.nextLine();
    
            if (idPedido >= 1 && idPedido <= listaPedidos.size()) {
                System.out.println("O que você deseja fazer?");
                System.out.println("1 - Adicionar Pizza");
                System.out.println("2 - Remover Pizza");
                System.out.println("3 - Mudar sabor");
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                Pedido pedido = listaPedidos.get(idPedido - 1);
                switch (opcao) {
                    case 1:
                        Pizza pizza = criarPizza(scanner);
                        pedido.getPizzas().add(pizza);
                        pedido.setValorTotal(somarPizzas(pedido.getPizzas()));
    
                        System.out.println("Pizza adicionada com sucesso!");
                        break;
                    case 2:
                        listarPizzas(pedido.getPizzas());
                        System.out.print("Escolha o ID da pizza que deseja remover: ");
                        int pizzaRemover = scanner.nextInt() - 1;
                        if (pizzaRemover >= 0 && pizzaRemover <= pedido.getPizzas().size()) {
                            scanner.nextLine();
                            pedido.getPizzas().remove(pizzaRemover);
                            System.out.println("Pizza removida com sucesso!");
                            break;
                        } else {
                            System.out.println("ID inválido!");
                        }
                        break;
                    case 3:
                        listarPizzas(pedido.getPizzas());
    
                        System.out.print("Escolha o número da pizza: ");
                        int pizzaIndex = scanner.nextInt() - 1;
                        scanner.nextLine();
    
                        if (pizzaIndex >= 0 && pizzaIndex < pedido.getPizzas().size()) {
    
                            Pizza pizzaSelecionada = pedido.getPizzas().get(pizzaIndex);
                            List<String> sabores = pizzaSelecionada.getSabores();
    
                            // Mostrar sabores atuais
                            for (int i = 0; i < sabores.size(); i++) {
                                System.out.println((i + 1) + " - " + sabores.get(i));
                            }
    
                            System.out.print("Qual sabor deseja alterar? ");
                            int saborIndex = scanner.nextInt() - 1;
                            scanner.nextLine();
    
                            if (saborIndex >= 0 && saborIndex < sabores.size()) {
    
                                Cardapio cardapio = new Cardapio();
                                List<String> listaSabores = new ArrayList<>(cardapio.getCardapio().keySet());
    
                                for (int i = 0; i < listaSabores.size(); i++) {
                                    System.out.println((i + 1) + " - " + listaSabores.get(i));
                                }
    
                                System.out.print("Escolha o novo sabor: ");
                                int novoSaborIndex = scanner.nextInt() - 1;
                                scanner.nextLine();
    
                                if (novoSaborIndex >= 0 && novoSaborIndex < listaSabores.size()) {
                                    sabores.set(saborIndex, listaSabores.get(novoSaborIndex));
                                    pizzaSelecionada.setSabores(sabores);
    
                                    // Atualiza valor do pedido
                                    pedido.setValorTotal(somarPizzas(pedido.getPizzas()));
    
                                    System.out.println("Sabor alterado com sucesso!");
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                
            } else {
                System.out.println("ID inválido!");
            }
        } else {
            System.out.println("Sem pedidos ainda");
        }
    }

    // Função para criar uma pizza assim não preciso ficar repetindo os códigos do método fazer pedido no alterar pedido
    private static Pizza criarPizza(Scanner scanner) {

    int x = 1;

    System.out.println("Qual o tamanho da pizza?");
    System.out.println("Selecione um tamanho:");
    for (TamanhoPizza tamanhos : Pizza.TamanhoPizza.values()) {
        System.out.println(x + " - " + tamanhos);
        x++;
    }

    System.out.print("Opção: ");
    int tamanho = scanner.nextInt();
    scanner.nextLine();

    int quantiSabores = 0;
    while (quantiSabores < 1 || quantiSabores > 4) {
        System.out.println("Digite a quantidade de sabores: 1 - 4");
        System.out.print("Opção: ");
        quantiSabores = scanner.nextInt();
        scanner.nextLine();
    }

    Cardapio cardapio = new Cardapio();
    List<String> saboresList = new ArrayList<>();
    List<String> saboresSelect = new ArrayList<>();

    for (int i = 0; i < quantiSabores; i++) {

        System.out.println("Selecione um sabor:");
        x = 1;

        saboresList.clear(); // importante limpar a lista

        for (String sabor : cardapio.getCardapio().keySet()) {
            saboresList.add(sabor);
            System.out.println(x + " - " + sabor);
            x++;
        }

        System.out.print("Opção: ");
        int opcaoSabor = scanner.nextInt();
        scanner.nextLine();

        saboresSelect.add(saboresList.get(opcaoSabor - 1));
    }

    return new Pizza(
            saboresSelect,
            cardapio.getPrecoJusto(saboresSelect),
            TamanhoPizza.getByIndex(tamanho - 1)
    );
}

    private static void listarPizzas(List<Pizza> pizzas) {
        if (!pizzas.isEmpty()) {
            int x = 1;
            for (Pizza pizza : pizzas) {
                System.out.println("<<<<<<<<< Pizza " + x + " >>>>>>>>>>");
                System.out.print("Sabores: ");
                for (String sabor : pizza.getSabores()) {
                    if (pizza.getSabores().size() > 1) {
                        System.out.print(sabor + " + ");
                    } else {
                        System.out.print(sabor);
                    }
                }
                System.out.println("\nPreço: R$" + pizza.getPreco() +
                                   " - Tamanho: " + pizza.getTamanho());
                System.out.println("============================");
                x++;
            }
        }
    }

    private static void listarPedidos(List<Pedido> listaPedidos) {
        if (!listaPedidos.isEmpty()) {
            for (Pedido pedido : listaPedidos) {
                System.out.println("------- Pedido " + pedido.getId() + " -------");

                listarPizzas(pedido.getPizzas());
            }
        } else {
            System.out.println("Ainda não existe nenhum pedido!");
        }
    }

    private static Cliente adicionarCliente(Scanner scanner) {
        System.out.println("ADICIONAR CLIENTE");
        System.out.println();
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        System.out.println();

        Cliente cliente = new Cliente(nome, endereco, telefone, email);
        return cliente;
    }

    public static void gerarRelatorio(List<Pedido> pedidos) {

    double faturamentoTotal = 0;

    // Contador de sabores
    Map<String, Integer> contadorSabores = new HashMap<>();

    // Grafo
    Map<String, Map<String, Integer>> grafo = new HashMap<>();

    for (Pedido pedido : pedidos) {

        faturamentoTotal += pedido.getValorTotal();

        for (Pizza pizza : pedido.getPizzas()) {

            List<String> sabores = pizza.getSabores();

            // Contar sabores
            for (String sabor : sabores) {
                contadorSabores.put(
                    sabor,
                    contadorSabores.getOrDefault(sabor, 0) + 1
                );
            }

            // Criar ligações no grafo
            for (int i = 0; i < sabores.size(); i++) {
                for (int j = i + 1; j < sabores.size(); j++) {

                    String sabor1 = sabores.get(i);
                    String sabor2 = sabores.get(j);

                    grafo.putIfAbsent(sabor1, new HashMap<>());
                    grafo.putIfAbsent(sabor2, new HashMap<>());

                    grafo.get(sabor1).put(
                        sabor2,
                        grafo.get(sabor1).getOrDefault(sabor2, 0) + 1
                    );

                    grafo.get(sabor2).put(
                        sabor1,
                        grafo.get(sabor2).getOrDefault(sabor1, 0) + 1
                    );
                }
            }
        }
        
    }
        System.out.println("===== RELATÓRIO =====");
        System.out.println("Faturamento total: R$ " + faturamentoTotal);

        System.out.println("\nSabores mais pedidos:");
        contadorSabores
            .entrySet()
            .stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .forEach(entry ->
                System.out.println(entry.getKey() + " - " + entry.getValue() + " pedidos")
            );

        System.out.println("\nGrafo de ligações entre sabores:");

        for (String sabor : grafo.keySet()) {
            System.out.println(sabor + " → " + grafo.get(sabor));
        }
    }

    private static void gerarListaClientes(List<Cliente> listaClientes) {
        int x = 1;
        if (listaClientes.isEmpty()) {
            System.out.println("Lista de clientes esta vazia");
        } else {
            for (Cliente cliente : listaClientes) {
                System.out.println("Cliente "+x);
                System.out.println(cliente.getNome());
                System.out.println(cliente.getEndereco());
                System.out.println(cliente.getTelefone());
                System.out.println(cliente.getEmail());
                System.out.println();
                x++;
            }
        }
    }
}
