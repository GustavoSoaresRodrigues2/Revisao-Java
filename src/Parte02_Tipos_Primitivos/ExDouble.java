package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo double
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'double' armazena números decimais com precisão dupla.
 *
 * 🧠 2) Como funciona?
 * Usa padrão IEEE 754.
 *
 * 📏 3) Características técnicas:
 * - Tamanho: 64 bits
 * - Valor padrão: 0.0d
 *
 * ⚠ 4) Pontos de atenção:
 * - Pode haver pequenas imprecisões.
 *
 * 🎯 5) Quando usar?
 * - Cálculos matemáticos
 * - Operações com casas decimais
 *
 * =========================================================
 */
public class ExDouble {

    public static void main(String[] args) {

        double a = 10.0;
        double b = 3.0;

        double divisao = a / b;
        System.out.println("10 / 3 = " + divisao);

        // 🔹 Erro clássico de precisão
        double teste = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + teste);

        // 🔹 Infinity
        double infinito = 1.0 / 0.0;
        System.out.println("Infinity: " + infinito);

        // 🔹 NaN
        double nan = 0.0 / 0.0;
        System.out.println("NaN: " + nan);
    }
}