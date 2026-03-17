package Parte11_Algoritmos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContarFrequenciaNum {
    public static void main(String[] args) {
        /**
         * 📝 Enunciado
         * Crie um método que receba uma lista de números inteiros e retorne um Map
         * mostrando quantas vezes cada número aparece.
         * 
         * 📌 Regras:
         * ✅ Use HashMap
         * ❌ Não pode usar estruturas prontas de contagem
         * ✅ Deve percorrer a lista apenas uma vez (O(n))
         * ✅ Pode usar get, put ou getOrDefault
         */

        List<Integer> numeros = Arrays.asList(
                5, 3, 5, 2, 8, 3, 9, 5, 2, 8,
                1, 3, 7, 6, 2, 5, 9, 1, 4, 3);

        System.out.println(numeroMaisFrequente(numeros));

    }

    public static Map<Integer, Integer> contarFrequencia(List<Integer> lista) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);

            mapa.put(num, mapa.getOrDefault(num, 0) + 1);
        }

        return mapa;
    }

    public static Map<Integer, Integer> numeroMaisFrequente(List<Integer> lista) {
        Map<Integer, Integer> mapa = new HashMap<>(contarFrequencia(lista));

        int numeroFrenquente = mapa;
        return mapa;
    }
}
