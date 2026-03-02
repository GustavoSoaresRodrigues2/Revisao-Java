package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo long
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'long' armazena números inteiros grandes.
 *
 * 🧠 2) Como funciona?
 * Ocupa 64 bits e usa complemento de dois.
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 64 bits
 * - Intervalo: -2^63 até (2^63 - 1) ou -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
 * - Valor padrão: 0L
 *
 * ⚠ 4) Pontos de atenção:
 * - Literais devem terminar com L (ex: 10L).
 *
 * 🎯 5) Quando usar?
 * - Valores muito grandes
 * - Sistemas financeiros ou científicos
 *
 * =========================================================
 */
public class ExLong {

    public static void main(String[] args) {

        // _ é apenas separador visual; não altera o valor
        long a = 9_000_000_000L;
        long b = 2_000_000_000L;

        long soma = a + b;
        long multiplicacao = a * 2;

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        // 🔹 Overflow
        long max = Long.MAX_VALUE;
        long overflow = max + 1;
        System.out.println("Overflow long: " + overflow);
    }
}