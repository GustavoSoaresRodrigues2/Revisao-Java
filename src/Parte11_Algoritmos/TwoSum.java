package Parte11_Algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        /**
         * 📝 Enunciado
         * Crie um método que, dado um array de inteiros nums e um valor alvo target, retorne os índices de dois números que somam exatamente target.
         * 
         * 📌 Regras
         * Não pode usar loops aninhados (O(n²))
         * Deve usar HashMap para otimizar (O(n))
         * Retornar primeira combinação encontrada
         * 
         * Considerar que sempre existe uma solução
         */

        List<Integer> numeros = Arrays.asList(2, 7, 11, 15, 18, 54, 84, 102);
        int target = 99;

        System.out.println(somamAteTarget(numeros, target));
    }

    public static List<Integer> somamAteTarget(List<Integer> numeros, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < numeros.size(); i++) {

            // vou guardar o que já vi e procurar o complemento
            int num = numeros.get(i);
            int complemento = target - num;

            if(mapa.containsKey(complemento)){
                return Arrays.asList(mapa.get(complemento), i);
            }

            mapa.put(num, i);
        }

        return new ArrayList<>();
    }
}
