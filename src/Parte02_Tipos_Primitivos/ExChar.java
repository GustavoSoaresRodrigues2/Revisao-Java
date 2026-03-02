package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo char
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'char' armazena um único caractere Unicode.
 *
 * 🧠 2) Como funciona?
 * Usa codificação Unicode (UTF-16).
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 16 bits
 * - Intervalo: 0 até 65.535
 * - Valor padrão: '\u0000'
 *
 * ⚠ 4) Pontos de atenção:
 * - Pode ser tratado como número inteiro.
 *
 * 🎯 5) Quando usar?
 * - Armazenar um único caractere
 *
 * =========================================================
 */
public class ExChar {

    public static void main(String[] args) {

        char letra = 'A';
        System.out.println("Letra: " + letra);

        // 🔹 Operação matemática
        char proxima = (char) (letra + 1);
        System.out.println("Próxima letra: " + proxima);

        // 🔹 Código Unicode
        int codigo = letra;
        System.out.println("Código: " + codigo);
    }
}