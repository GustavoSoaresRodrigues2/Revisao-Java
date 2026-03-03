package Parte09_JavaAPI;

import java.util.*;

/**
 * =========================================================
 * 📘 TEMA: Collections Avançadas em Java
 * =========================================================
 *
 * 🔎 1) List
 * - Lista de elementos ordenada, permite duplicatas
 * - Implementações comuns: ArrayList, LinkedList
 *
 * 🔎 2) Set
 * - Conjunto de elementos, **não permite duplicatas**
 * - HashSet: ordem aleatória
 * - TreeSet: ordenação natural
 * - LinkedHashSet: mantém ordem de inserção
 *
 * 🔎 3) Map
 * - Armazena pares chave-valor
 * - HashMap: ordem aleatória
 * - TreeMap: ordenação natural das chaves
 * - LinkedHashMap: mantém ordem de inserção
 *
 * 🧠 Observações:
 * - Para tipos primitivos, use Wrappers: Integer, Double, Boolean
 * - Utilitários em Collections e Arrays ajudam a ordenar, buscar e modificar dados
 *
 * =========================================================
 */
public class ExCollectionsAvancadas {

    public static void main(String[] args) {

        // ======================
        // 1. List (ArrayList)
        // ======================
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Bruno"); // duplicata permitida

        System.out.println("Lista de nomes (ArrayList): " + nomes);

        // Ordenação usando Collections.sort()
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);

        // ======================
        // 1.1 List (LinkedList)
        // ======================
        List<Integer> numeros = new LinkedList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);

        System.out.println("\nLista de números (LinkedList): " + numeros);
        Collections.sort(numeros);
        System.out.println("LinkedList ordenada: " + numeros);

        // ======================
        // 2. Set (HashSet)
        // ======================
        Set<String> nomesHash = new HashSet<>();
        nomesHash.add("Ana");
        nomesHash.add("Bruno");
        nomesHash.add("Carla");
        nomesHash.add("Bruno"); // duplicata ignorada
        System.out.println("\nConjunto HashSet: " + nomesHash);

        // ======================
        // 2.1 Set (TreeSet)
        // ======================
        Set<String> nomesTree = new TreeSet<>();
        nomesTree.add("Ana");
        nomesTree.add("Bruno");
        nomesTree.add("Carla");
        System.out.println("Conjunto TreeSet (ordenado): " + nomesTree);

        // ======================
        // 2.2 Set (LinkedHashSet)
        // ======================
        Set<String> nomesLinked = new LinkedHashSet<>();
        nomesLinked.add("Ana");
        nomesLinked.add("Bruno");
        nomesLinked.add("Carla");
        System.out.println("Conjunto LinkedHashSet (ordem inserção): " + nomesLinked);

        // ======================
        // 3. Map (HashMap)
        // ======================
        Map<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Ana", 25);
        idadePorNome.put("Bruno", 30);
        idadePorNome.put("Carla", 28);
        System.out.println("\nHashMap: " + idadePorNome);

        // ======================
        // 3.1 Map (TreeMap)
        // ======================
        Map<String, Integer> idadeTree = new TreeMap<>();
        idadeTree.put("Ana", 25);
        idadeTree.put("Bruno", 30);
        idadeTree.put("Carla", 28);
        System.out.println("TreeMap (ordenado por chave): " + idadeTree);

        // ======================
        // 3.2 Map (LinkedHashMap)
        // ======================
        Map<String, Integer> idadeLinked = new LinkedHashMap<>();
        idadeLinked.put("Ana", 25);
        idadeLinked.put("Bruno", 30);
        idadeLinked.put("Carla", 28);
        System.out.println("LinkedHashMap (ordem de inserção): " + idadeLinked);

        // ======================
        // 4. Iteração pelo Map
        // ======================
        System.out.println("\nIterando TreeMap:");
        for (Map.Entry<String, Integer> entry : idadeTree.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ======================
        // 5. Observações / boas práticas
        // ======================
        // ✅ Use List para elementos ordenados e duplicáveis
        // ✅ Use Set para eliminar duplicatas
        // ✅ Use HashMap para acesso rápido via chave
        // ✅ Use TreeSet / TreeMap para ordenação natural
        // ✅ Use LinkedHashSet / LinkedHashMap para manter ordem de inserção
        // ✅ Para tipos primitivos, use Wrappers
    }
}