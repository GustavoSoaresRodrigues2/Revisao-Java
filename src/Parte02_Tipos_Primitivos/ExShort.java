package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo short
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'short' armazena números inteiros maiores que byte e menores que int.
 *
 * 🧠 2) Como funciona?
 * Ocupa 16 bits e usa complemento de dois.
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 16 bits
 * - Intervalo: -32.768 até 32.767
 * - Valor padrão: 0
 *
 * ⚠ 4) Pontos de atenção:
 * - Também é promovido para int em operações.
 *
 * 🎯 5) Quando usar?
 * - Sistemas embarcados
 * - Economia moderada de memória
 *
 * =========================================================
 */
public class ExShort {

    public static void main(String[] args) {

        short a = 30000;
        short b = 2000;

        // 🔹 Promoção automática
        int resultado = a + b;
        System.out.println("Resultado (int): " + resultado);

        // 🔹 Cast obrigatório
        short convertido = (short) (a + b);
        System.out.println("Convertido para short: " + convertido);

        // 🔹 Overflow
        short max = 32767;
        short overflow = (short) (max + 1);
        System.out.println("Overflow: " + overflow);
    }
}