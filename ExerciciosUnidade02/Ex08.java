package ExerciciosUnidade02;

import java.util.HashMap;
import java.util.Map;

public class Ex08 {
    // Escreva um programa que conte a frequência das palavras em uma frase utilizando um HashMap.

    public static void main(String[] args) {
        String frase = "Simples frase para mostrar o funcionamento do código de contagem de palavras na frase!";

        frase = frase.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] palavras = frase.split(" ");

        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " - Frequência: " + entry.getValue());
        }
    }
}
