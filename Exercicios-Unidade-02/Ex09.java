import java.util.HashMap;
import java.util.Map;

public class Ex09 {
    // Implemente um método para mesclar dois HashMaps e manipular possíveis conflitos de chaves.
    public static void main(String[] args) {
        Map<String, Integer> primeiroHashMap = new HashMap<>();
        primeiroHashMap.put("a", 1);
        primeiroHashMap.put("b", 3);
        primeiroHashMap.put("c", 4);

        Map<String, Integer> segundoHashMap = new HashMap<>();
        segundoHashMap.put("d", 10);
        segundoHashMap.put("b", 6);
        segundoHashMap.put("e", 5);

        System.out.println("Mapa 1: " + primeiroHashMap);
        System.out.println("Mapa 2: " + segundoHashMap);

        mesclarHashMaps(primeiroHashMap, segundoHashMap);

        System.out.println("Mapas Mesclados: " + primeiroHashMap);
    }

    public static void mesclarHashMaps(Map<String, Integer> primeiroHashMap, Map<String, Integer> segundoHashMap) {
        for (Map.Entry<String, Integer> entry : segundoHashMap.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();

            if (primeiroHashMap.containsKey(chave)) {
                primeiroHashMap.put(chave, primeiroHashMap.get(chave) + valor);
            } else {
                primeiroHashMap.put(chave, valor);
            }
        }
    }
}
