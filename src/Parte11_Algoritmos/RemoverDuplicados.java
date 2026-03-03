package Parte11_Algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoverDuplicados {
    public static void main(String[] args) {
        /**
         * 📝 Enunciado
         * Crie um programa que receba uma lista de elementos (Strings ou Integers) e
         * remova os elementos duplicados, mantendo a ordem original.
         * 
         * 📌 Regras
         * Não pode usar loops aninhados (O(n²))
         * Deve usar Set para checar duplicados
         * Deve funcionar para qualquer tipo de elemento (Strings ou Integers)
         * 
         * Complexidade esperada: O(n)
         * 
         * Manter a ordem da primeira aparição
         */

        Set<String> arrayString = new HashSet<>(Arrays.asList("banana", "maçã", "banana", "uva", "maçã"));

        System.out.println(arrayString);

        Set<Integer> arrayNum = new HashSet<>(Arrays.asList(10, 20, 10, 30, 20, 40));

        System.out.println(arrayNum);

        // Faltou mander a ordem, pode-se mander usando um arraylist para armazenar a ordem
        // e um set para chegar as dulicadas.

        /**
         * =========================================================
         * 📘 TEMA: Remover duplicados de uma lista mantendo a ordem
         * =========================================================
         *
         * 🔎 Objetivo:
         * Receber uma lista de elementos (Strings ou Integers)
         * e remover duplicados mantendo a ordem da primeira aparição
         *
         * 🔎 Conceitos usados:
         * - HashSet para checar duplicados (O(1))
         * - ArrayList para manter ordem
         * - Loop único (O(n))
         *
         * =========================================================
         */

        // ======================
        // 1. Lista de Strings
        // ======================
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList(
                "banana", "maçã", "banana", "uva", "maçã"
        ));

        ArrayList<String> frutasSemDuplicados = removerDuplicados(frutas);
        System.out.println("Strings sem duplicados: " + frutasSemDuplicados);

        // ======================
        // 2. Lista de Integers
        // ======================
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(
                10, 20, 10, 30, 20, 40
        ));

        ArrayList<Integer> numerosSemDuplicados = removerDuplicados(numeros);
        System.out.println("Integers sem duplicados: " + numerosSemDuplicados);
    }

    // ======================
    // Método genérico para remover duplicados mantendo ordem
    // ======================
    public static <T> ArrayList<T> removerDuplicados(ArrayList<T> lista) {
        Set<T> vistos = new HashSet<>();
        ArrayList<T> resultado = new ArrayList<>();

        for (T item : lista) {
            if (!vistos.contains(item)) {
                vistos.add(item);
                resultado.add(item);
            }
        }

        return resultado;
    }
}
