package Parte11_Algoritmos;

/**
 * =========================================================
 * 📘 TEMA: Complexidade de Algoritmos (Big-O)
 * =========================================================
 *
 * 🔎 1) O que é Big-O?
 * - Mede o custo de um algoritmo
 * - Avalia tempo de execução ou uso de memória
 * - Considera o pior caso
 *
 * 📌 Importante:
 * Big-O NÃO mede segundos reais.
 * Mede como o algoritmo cresce conforme a entrada aumenta.
 *
 * =========================================================
 */
public class ExComplexidadeBigO {

    public static void main(String[] args) {

        // ======================
        // 1. O(1) - Constante
        // ======================
        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println(numeros[2]);
        // Sempre acessa direto → não depende do tamanho da lista
        // Complexidade: O(1)

        // ======================
        // 2. O(n) - Linear
        // ======================
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        // Percorre todos os elementos
        // Se dobrar o tamanho, dobra o tempo
        // Complexidade: O(n)

        // ======================
        // 3. O(n²) - Quadrática
        // ======================
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[i] + " - " + numeros[j]);
            }
        }
        // Dois loops aninhados
        // Se dobrar a entrada, o tempo cresce muito mais
        // Complexidade: O(n²)

        // ======================
        // 4. O(log n) - Logarítmica (Busca Binária)
        // ======================

        int[] listaOrdenada = { 10, 20, 30, 40, 50, 60, 70 };
        int alvo = 50;

        int inicio = 0;
        int fim = listaOrdenada.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (listaOrdenada[meio] == alvo) {
                encontrado = true;
                break;
            } else if (listaOrdenada[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Encontrado? " + encontrado);

        /*
         * A cada repetição, o algoritmo divide o problema pela metade.
         *
         * 8 elementos → no máximo 3 comparações
         * 16 elementos → no máximo 4 comparações
         *
         * Complexidade: O(log n)
         */

        // ======================
        // 5. O(n log n) - Ordenação eficiente
        // ======================

        int[] numerosGrandes = { 5, 2, 8, 1, 9, 3, 7, 6, 4 };

        // Usando método pronto (internamente usa algoritmo eficiente)
        java.util.Arrays.sort(numerosGrandes);

        System.out.println("Array ordenado:");
        for (int n : numerosGrandes) {
            System.out.print(n + " ");
        }

        /*
         * Algoritmos como:
         * - MergeSort
         * - QuickSort (caso médio)
         *
         * Dividem o problema (log n)
         * e processam todos os elementos (n)
         *
         * Resultado final: O(n log n)
         */

        // ======================
        // 6. Espaço (Memory Complexity)
        // ======================
        /*
         * Se criamos um novo array do mesmo tamanho da entrada:
         * Complexidade de espaço → O(n)
         *
         * Se usamos apenas variáveis simples:
         * Complexidade de espaço → O(1)
         */
    }
}