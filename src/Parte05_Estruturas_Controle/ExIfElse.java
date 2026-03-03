package Parte05_Estruturas_Controle;

/**
 * =========================================================
 * 📘 TEMA: Estrutura de decisão - if / else / else-if
 * =========================================================
 *
 * 🔎 1) O que é?
 * Estruturas de decisão permitem executar blocos de código
 * dependendo de condições booleanas.
 *
 * 🧠 2) Tipos:
 * - if
 * - if / else
 * - if / else-if / else
 *
 * ⚠ 3) Observações importantes:
 * - Condição deve ser booleana
 * - Para comparar primitivos use == ou !=
 * - Para objetos, use equals()
 * - Blocos com múltiplas linhas devem usar { }
 * - else-if é avaliado em ordem; o primeiro verdadeiro executa
 *
 * =========================================================
 */
public class ExIfElse {

    public static void main(String[] args) {

        int idade = 20;

        // ======================
        // 1. IF simples
        // ======================
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        // ======================
        // 2. IF / ELSE
        // ======================
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é adulto.");
        }

        // ======================
        // 3. IF / ELSE-IF / ELSE
        // ======================
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 75) {
            System.out.println("Conceito B");
        } else if (nota >= 60) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }

        // ======================
        // 4. Observações / erros comuns
        // ======================
        // ❌ Erro: usar = em vez de == na condição
        // if (nota = 85) { ... } // compilador não permite
        //
        // ❌ Erro: esquecer chaves {} em blocos com múltiplas linhas
        // if (idade >= 18) System.out.println("Adulto"); System.out.println("Ok"); // segunda linha sempre executa
        //
        // ✅ Boas práticas:
        // - Sempre usar {} mesmo em blocos de uma linha
        // - Else-if ajuda a reduzir comparações múltiplas
    }
}