package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo byte
 * =========================================================
 *
 * 🔎 1) O que é?
 * Tipo inteiro pequeno de 8 bits.
 *
 * 🧠 2) Como funciona?
 * Usa complemento de dois.
 * Sempre que participa de operações matemáticas,
 * é promovido automaticamente para int.
 *
 * 📏 3) Características técnicas:
 * - 8 bits
 * - Intervalo: -128 até 127
 * - Valor padrão: 0
 *
 * ⚠ 4) Pontos de atenção:
 * - Overflow ocorre facilmente
 * - Operações retornam int
 * - Pode exigir cast
 *
 * =========================================================
 */
public class ExByte {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        // 🔹 Promoção automática para int
        int soma = a + b;
        System.out.println("Soma (int): " + soma);

        // 🔹 Necessário cast para voltar para byte
        byte somaByte = (byte) (a + b);
        System.out.println("Soma com cast: " + somaByte);

        // 🔹 Overflow
        byte max = 127;
        byte overflow = (byte) (max + 1);
        System.out.println("Overflow: " + overflow);

        // 🔹 Underflow
        byte min = -128;
        byte underflow = (byte) (min - 1);
        System.out.println("Underflow: " + underflow);
    }
}