package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Tipo Primitivo boolean
 * =========================================================
 *
 * 🔎 1) O que é?
 * O 'boolean' armazena valores lógicos: true ou false.
 *
 * 🧠 2) Como funciona?
 * Representa apenas dois estados possíveis.
 *
 * 📏 3) Características técnicas:
 * - Valores possíveis: true ou false
 * - Valor padrão: false
 *
 * ⚠ 4) Pontos de atenção:
 * - Não é convertido automaticamente para número.
 *
 * 🎯 5) Quando usar?
 * - Condições
 * - Estruturas de decisão
 *
 * =========================================================
 */
public class ExBoolean {

  public static void main(String[] args) {

    boolean a = true;
    boolean b = false;

    boolean and = a && b;
    boolean or = a || b;
    boolean not = !a;

    System.out.println("AND: " + and);
    System.out.println("OR: " + or);
    System.out.println("NOT: " + not);

    // 🔹 Erro comum (não compila)
    // int x = true; ❌
  }
}