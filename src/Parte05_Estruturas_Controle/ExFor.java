package Parte05_Estruturas_Controle;

import java.util.ArrayList;

/**
 * =========================================================
 * 📘 TEMA: Estruturas de repetição - for / foreach
 * =========================================================
 *
 * 🔎 1) O que é?
 * Estruturas que permitem repetir blocos de código múltiplas vezes.
 *
 * 🧠 2) Tipos principais:
 * - for clássico: usa índice, útil quando se sabe o número de iterações
 * - foreach (enhanced for): percorre arrays ou coleções diretamente
 *
 * ⚠ 3) Observações importantes:
 * - Array e ArrayList podem ser iterados com ambos
 * - Não é possível modificar o tamanho do ArrayList dentro do foreach
 * - Índices fora do limite causam ArrayIndexOutOfBoundsException
 *
 * =========================================================
 */
public class ExFor {

    public static void main(String[] args) {

        // ======================
        // 1. FOR clássico com array
        // ======================
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("For clássico com array:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // ======================
        // 2. FOREACH com array
        // ======================
        System.out.println("\nForeach com array:");
        for(int num : numeros) {
            System.out.println(num);
        }

        // ======================
        // 3. FOR clássico com ArrayList
        // ======================
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        System.out.println("\nFor clássico com ArrayList:");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println("nomes[" + i + "] = " + nomes.get(i));
        }

        // ======================
        // 4. FOREACH com ArrayList
        // ======================
        System.out.println("\nForeach com ArrayList:");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // ======================
        // 5. Observações / erros comuns
        // ======================
        // ❌ Acessar índice fora do tamanho do array ou ArrayList -> ArrayIndexOutOfBoundsException
        // ❌ Modificar ArrayList dentro do foreach diretamente -> ConcurrentModificationException
        // ✅ Boas práticas:
        // - Foreach para leitura
        // - For clássico quando precisa do índice ou alterar elementos
        // - Sempre verificar tamanho antes de acessar índices
    }
}