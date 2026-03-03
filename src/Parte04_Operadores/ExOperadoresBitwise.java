package Parte04_Operadores;

/**
 * =========================================================
 * 📘 TEMA: Operadores Bitwise em Java
 * =========================================================
 *
 * 🔎 1) O que são?
 * Operadores bitwise manipulam os bits de números inteiros.
 *
 * 🧠 2) Operadores principais:
 * - & (AND)     → retorna 1 somente se ambos os bits forem 1
 * - | (OR)      → retorna 1 se pelo menos um bit for 1
 * - ^ (XOR)     → retorna 1 se os bits forem diferentes
 * - ~ (NOT)     → inverte todos os bits
 * - << (shift left)  → desloca bits para esquerda, multiplica por 2
 * - >> (shift right) → desloca bits para direita, mantém sinal
 * - >>> (shift right zero fill) → desloca bits para direita, preenche com 0
 *
 * ⚠ 3) Observações:
 * - Operam apenas em tipos inteiros (byte, short, int, long)
 * - Úteis para flags, máscaras e manipulação de bits
 * - Deslocamentos podem causar perda de bits à esquerda
 *
 * =========================================================
 */
public class ExOperadoresBitwise {

    public static void main(String[] args) {

        int a = 5;  // 0101 em binário
        int b = 3;  // 0011 em binário

        // ======================
        // 1. AND (&)
        // ======================
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 -> 1

        // ======================
        // 2. OR (|)
        // ======================
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 -> 7

        // ======================
        // 3. XOR (^)
        // ======================
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 -> 6

        // ======================
        // 4. NOT (~)
        // ======================
        System.out.println("~a = " + (~a)); // inverte bits: 0101 -> 1010 (em complemento de dois: -6)

        // ======================
        // 5. Shift Left (<<)
        // ======================
        System.out.println("a << 1 = " + (a << 1)); // 0101 -> 1010 -> 10

        // ======================
        // 6. Shift Right (>>)
        // ======================
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 -> 0010 -> 2

        // ======================
        // 7. Shift Right Zero Fill (>>>)
        // ======================
        int negativo = -8; // binário: 11111111...1000
        System.out.println("-8 >>> 2 = " + (negativo >>> 2)); 
        // preenche com 0 à esquerda, resultado grande positivo

        // ======================
        // 8. Boas práticas
        // ======================
        // - Use parênteses para deixar claro a ordem de operações
        // - Entenda o complemento de dois para negativos
        // - Útil para manipular flags, máscaras, e otimizações de bits
    }
}