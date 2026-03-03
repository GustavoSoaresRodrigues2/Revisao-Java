package Parte04_Operadores;

/**
 * =========================================================
 * 📘 TEMA: Operadores em Java
 * =========================================================
 *
 * 🔎 1) Tipos de operadores:
 * - Aritméticos: +, -, *, /, %
 * - Atribuição: =, +=, -=, *=, /=, %=
 * - Relacionais: ==, !=, >, <, >=, <=
 * - Lógicos: &&, ||, !
 * - Incremento/Decremento: ++, --
 * - Ternário: ? :
 * - Bitwise: &, |, ^, ~, <<, >>, >>> (opcional)
 *
 * ⚠ 2) Observações importantes:
 * - Divisão inteira descarta decimal
 * - Precedência de operadores importa
 * - Operadores lógicos curtos economizam avaliação
 * - Overflow pode ocorrer com inteiros
 *
 * =========================================================
 */
public class ExOperadores {

    public static void main(String[] args) {

        // ======================
        // 1. OPERADORES ARITMÉTICOS
        // ======================
        int a = 10;
        int b = 3;

        System.out.println("Operadores aritméticos:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // divisão inteira
        System.out.println("a % b = " + (a % b));   // resto

        // ======================
        // 2. OPERADORES DE ATRIBUIÇÃO
        // ======================
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("\nOperadores de atribuição:");
        System.out.println("x += 3 -> x = " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2 -> x = " + x);

        // ======================
        // 3. OPERADORES RELACIONAIS
        // ======================
        System.out.println("\nOperadores relacionais:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // ======================
        // 4. OPERADORES LÓGICOS
        // ======================
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("\nOperadores lógicos:");
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // ======================
        // 5. INCREMENTO / DECREMENTO
        // ======================
        int inc = 5;
        System.out.println("\nIncremento / Decremento:");
        System.out.println("inc = " + inc);
        System.out.println("++inc = " + (++inc)); // pré-incremento
        System.out.println("inc++ = " + (inc++)); // pós-incremento
        System.out.println("inc agora = " + inc);
        System.out.println("--inc = " + (--inc)); // pré-decremento
        System.out.println("inc-- = " + (inc--)); // pós-decremento
        System.out.println("inc agora = " + inc);

        // ======================
        // 6. OPERADOR TERNÁRIO
        // ======================
        int idade = 20;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("\nOperador ternário:");
        System.out.println("idade = " + idade + " -> " + resultado);

        // ======================
        // 7. OVERFLOW COM INTEIROS
        // ======================
        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nOverflow com int:");
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        System.out.println("maxInt + 1 = " + (maxInt + 1)); // overflow -> volta para negativo

        // ======================
        // 8. DIVISÃO POR ZERO
        // ======================
        // int num = 10;
        // int den = 0;
        // System.out.println(num / den); // ❌ ArithmeticException
        double divZero = 10.0 / 0; // Infinity
        System.out.println("\nDivisão por zero com double: " + divZero);

        // ======================
        // 9. DICAS DE BOAS PRÁTICAS
        // ======================
        // - Use parênteses para deixar claro a ordem de operações
        // - Evite divisão inteira quando precisar de decimal
        // - Lembre-se do overflow em inteiros
        // - Use operadores lógicos curtos (&&, ||) para eficiência
    }
}