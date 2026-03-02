package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo int
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'int' é um tipo primitivo usado para armazenar números inteiros
 * (valores sem casas decimais).
 *
 * 🧠 2) Como funciona?
 * Ele ocupa 32 bits (4 bytes) de memória e utiliza representação
 * binária em complemento de dois, permitindo armazenar valores
 * negativos e positivos.
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 32 bits
 * - Intervalo: -2^31 até (2^31 - 1)
 * - Valor padrão: 0 (para atributos de classe)
 *
 * ⚠ 4) Pontos de atenção:
 * - Divisão entre dois int descarta a parte decimal.
 * - Pode ocorrer overflow se ultrapassar o limite.
 * - Operações com tipos maiores promovem o int automaticamente.
 *
 * 🎯 5) Quando usar?
 * - Contadores
 * - Índices de arrays
 * - Quantidades
 * - Idades
 *
 * 🆚 6) Comparação:
 * Diferente do double, o int não armazena casas decimais.
 *
 * =========================================================
 */
public class ExInt {

    public static void main(String[] args) {

        // 🔹 1) Exemplo básico
        int numero = 10;
        System.out.println("Número: " + numero);

        // 🔹 2) Explorando comportamento (divisão inteira)
        int divisao = 7 / 2;
        System.out.println("7 / 2 = " + divisao); // resultado: 3

        // 🔹 3) Erro comum (esperar decimal)
        double correto = 7 / 2.0;
        System.out.println("7 / 2.0 = " + correto); // 3.5

        // 🔹 4) Overflow
        int max = Integer.MAX_VALUE;
        System.out.println("Máximo: " + max);

        int overflow = max + 1;
        System.out.println("Após overflow: " + overflow);

        // 🔹 5) Conclusão prática
        System.out.println("Use int quando precisar de números inteiros dentro do intervalo suportado.");
    }
}