package Parte06_Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * =========================================================
 * 📘 TEMA: Ordenação de ArrayList em Java
 * =========================================================
 *
 * 🔎 1) O que é?
 * - ArrayList não possui ordenação automática
 * - Podemos usar Collections.sort() para ordenar
 * - Para customização, usamos Comparator
 *
 * 🧠 2) Observações importantes:
 * - Ordenação natural (default) depende do tipo: 
 *   - Strings → ordem alfabética
 *   - Integers → ordem crescente
 * - Para ordem decrescente, usar Collections.reverse() ou Comparator.reverseOrder()
 *
 * =========================================================
 */
public class ExArrayListOrdenacao {

    public static void main(String[] args) {

        // ======================
        // 1. Ordenação de Strings (alfabética)
        // ======================
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Daniel");
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Elisa");

        System.out.println("Original: " + nomes);

        Collections.sort(nomes); // ordem alfabética crescente
        System.out.println("Ordenado crescente (alfabético): " + nomes);

        Collections.sort(nomes, Collections.reverseOrder()); // ordem decrescente
        System.out.println("Ordenado decrescente: " + nomes);

        // ======================
        // 2. Ordenação de Integers (numérica)
        // ======================
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);

        System.out.println("\nOriginal: " + numeros);

        Collections.sort(numeros); // ordem crescente
        System.out.println("Ordenado crescente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder()); // ordem decrescente
        System.out.println("Ordenado decrescente: " + numeros);

        // ======================
        // 3. Ordenação personalizada com Comparator
        // ======================
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("banana");
        palavras.add("abacaxi");
        palavras.add("uva");
        palavras.add("laranja");

        System.out.println("\nOriginal: " + palavras);

        // Ordenar pelo tamanho da palavra (menor para maior)
        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println("Ordenado por tamanho crescente: " + palavras);

        // Ordenar pelo tamanho da palavra decrescente
        palavras.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("Ordenado por tamanho decrescente: " + palavras);

        // ======================
        // 4. Observações / boas práticas
        // ======================
        // ✅ Collections.sort() modifica a lista original
        // ✅ Para criar uma cópia ordenada sem alterar original, use new ArrayList<>(original) antes
        // ✅ Comparator permite criar regras customizadas (ex.: por comprimento, letras maiúsculas, etc.)
        // ❌ Não se pode ordenar diretamente tipos primitivos, use wrappers (Integer, Double, etc.)
    }
}