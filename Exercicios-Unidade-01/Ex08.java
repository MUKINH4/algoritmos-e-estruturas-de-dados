import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário que insira uma lista de números inteiros e, em seguida, encontre e exiba o número que mais se repete.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a lista de números separados por espaços: ");
        String rawList = scanner.nextLine();

        String[] partes = rawList.split("\\s+");
        Map<Integer, Integer> contador = new HashMap<>();

        for (String parte : partes) {
            try {
                int num = Integer.parseInt(parte);
                contador.put(num , contador.getOrDefault(num, 0) + 1);
            } catch (NumberFormatException e) {
                System.out.println("Inválido!");
            }
        }
 
        int mostRepeated = 0;
        int maxOccurrences = 0;
        boolean draw = false;

        // Percorre chave - valor
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                maxOccurrences = entry.getValue();
                mostRepeated = entry.getKey();
                draw = false;
            } else if (entry.getValue() == maxOccurrences && maxOccurrences > 0) {
                draw = true;
            }
        }
        
        System.out.println("\n--- Resultado ---");
        if (contador.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else if (draw && contador.size() > 1) {
            System.out.println("Houve um empate!");
        } else {
            System.out.println("O número que mais se repete é: " + mostRepeated);
            System.out.println("Total de repetições: " + maxOccurrences);
        }

        scanner.close();

    }
}
