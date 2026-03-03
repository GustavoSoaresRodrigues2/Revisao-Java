package Parte10_StreamsLambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * =========================================================
 * 📘 TEMA: Streams e Lambda em Java
 * =========================================================
 *
 * 🔎 1) Lambda:
 * - Função anônima, usada para passar comportamento como argumento
 * - Sintaxe: (parametros) -> expressão
 *
 * 🔎 2) Stream:
 * - Representa uma sequência de elementos com operações funcionais
 * - Permite map, filter, reduce, forEach e outras operações
 *
 * 🧠 Observações:
 * - Streams não alteram a coleção original (imutabilidade)
 * - Operações intermediárias (map, filter) são "lazy"
 * - Operações terminais (collect, forEach, reduce) produzem resultado
 *
 * =========================================================
 */
public class ExStreamsLambda {

    public static void main(String[] args) {

        // ======================
        // 1. Lista de exemplo
        // ======================
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carla", "Daniel", "Elisa");

        // ======================
        // 2. ForEach com lambda
        // ======================
        System.out.println("Imprimindo nomes com lambda:");
        nomes.forEach(nome -> System.out.println(nome));

        // ======================
        // 3. Filter (filtrar elementos)
        // ======================
        List<String> nomesComB = nomes.stream()
                .filter(nome -> nome.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println("\nNomes que começam com 'B': " + nomesComB);

        // ======================
        // 4. Map (transformar elementos)
        // ======================
        List<Integer> tamanhos = nomes.stream()
                .map(String::length) // ou nome -> nome.length()
                .collect(Collectors.toList());
        System.out.println("Tamanho de cada nome: " + tamanhos);

        // ======================
        // 5. Sorted (ordenar elementos)
        // ======================
        List<String> nomesOrdenados = nomes.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Nomes ordenados: " + nomesOrdenados);

        // ======================
        // 6. Reduce (agregação)
        // ======================
        String todosNomes = nomes.stream()
                .reduce("", (a, b) -> a + b + " ");
        System.out.println("Todos os nomes concatenados: " + todosNomes);

        // ======================
        // 7. Operações numéricas com Stream
        // ======================
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)   // pares
                .mapToInt(n -> n * 2)      // dobro
                .sum();                     // soma
        System.out.println("\nSoma dos números pares dobrados: " + soma);

        // ======================
        // 8. Observações / boas práticas
        // ======================
        // ✅ Use lambda para simplificar código e reduzir loops explícitos
        // ✅ Streams intermediários são "lazy", só executam no terminal
        // ✅ Colete o resultado em List, Set ou outros coletores
        // ❌ Não use streams para lógica complexa de múltiplos efeitos colaterais
    }
}