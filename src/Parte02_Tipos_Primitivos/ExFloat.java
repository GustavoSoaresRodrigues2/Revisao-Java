package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo float
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'float' armazena números decimais com precisão simples (32 bits).
 *
 * 🧠 2) Como funciona?
 * Usa padrão IEEE 754. Valores muito pequenos ou muito grandes
 * podem gerar underflow ou overflow.
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 32 bits
 * - Valor padrão: 0.0f
 * - Intervalo aproximado: ±1.4e-45 a ±3.4e38
 *
 * ⚠ 4) Pontos de atenção:
 * - Pode perder precisão em operações com muitos decimais
 * - Overflow: valores acima de 3.4e38
 * - Underflow: valores abaixo de 1.4e-45
 *
 * 🎯 5) Quando usar?
 * - Economia de memória com decimais
 * - Jogos, gráficos, sistemas embarcados
 *
 * =========================================================
 */
public class ExFloat {

    public static void main(String[] args) {

        float a = 5.5f;
        float b = 2.2f;

        // 🔹 Operações básicas
        float soma = a + b;
        float divisao = a / b;
        float multiplicacao = a * b;
        float subtracao = a - b;

        System.out.println("Soma: " + soma);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Subtração: " + subtracao);

        // 🔹 Problema de precisão
        float teste = 0.1f + 0.2f;
        System.out.println("0.1 + 0.2 = " + teste); // imprecisão

        // 🔹 Underflow (menor valor positivo válido)
        float pequeno = 1e-40f; 
        System.out.println("Underflow simulado: " + pequeno);

        // 🔹 Overflow
        float grande = 3.4e38f; // valor máximo permitido para float
        System.out.println("Overflow simulado: " + grande); // Infinity
    }
}