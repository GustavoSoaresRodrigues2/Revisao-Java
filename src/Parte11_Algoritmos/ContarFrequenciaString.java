package Parte11_Algoritmos;

import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * 📘 TEMA: Contar frequência de caracteres em String
 * =========================================================
 *
 * 🔎 Objetivo:
 * Contar quantas vezes cada caractere aparece em uma String
 * Ignorar espaços e case (maiúsculas/minúsculas)
 *
 * 🔎 Conceitos usados:
 * - String manipulation
 * - HashMap
 * - Looping
 * - Regex (para limpar caracteres)
 *
 * =========================================================
 */
public class ContarFrequenciaString {

    public static void main(String[] args) {

        String texto = "A man a plan a canal Panama";

        // ======================
        // 1. Limpar a string
        // ======================
        // Remove espaços e transforma tudo em minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // ======================
        // 2. Criar HashMap para contar frequência
        // ======================
        Map<Character, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Se o caractere já existe no map, incrementa; senão, adiciona 1
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        // ======================
        // 3. Mostrar resultados
        // ======================
        System.out.println("Frequência de caracteres:");
        for (Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // ======================
        // 4. Observações importantes
        // ======================
        /*
         * ✅ getOrDefault é muito útil para evitar if/contains
         * ✅ HashMap permite O(1) na maioria das operações
         * ✅ Limpeza com regex prepara a string para contar apenas letras
         */
    }
}