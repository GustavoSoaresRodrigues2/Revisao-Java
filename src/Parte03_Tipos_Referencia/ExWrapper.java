package Parte03_Tipos_Referencia;

/**
 * =========================================================
 * 📘 TEMA: Tipos Wrapper em Java
 * =========================================================
 *
 * 🔎 1) O que é?
 * Tipos wrapper são classes que "embrulham" tipos primitivos,
 * permitindo que eles sejam tratados como objetos.
 *
 * 🧠 2) Tipos wrapper comuns:
 * - byte → Byte
 * - short → Short
 * - int → Integer
 * - long → Long
 * - float → Float
 * - double → Double
 * - char → Character
 * - boolean → Boolean
 *
 * 📏 3) Características:
 * - Objetos imutáveis
 * - Permitem métodos úteis (ex.: parse, valueOf, compare)
 * - Podem ser usados em coleções (List, Map) que exigem objetos
 *
 * ⚠ 4) Pontos de atenção:
 * - Comparações: '==' compara referências, 'equals()' compara valor
 * - Autoboxing/unboxing pode gerar NullPointerException se wrapper for null
 *
 * =========================================================
 */
public class ExWrapper {

    public static void main(String[] args) {

        // 🔹 Criando wrappers manualmente
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(3.14);
        Boolean boolObj = Boolean.valueOf(true);

        System.out.println("Wrappers criados:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Boolean: " + boolObj);

        // 🔹 Autoboxing (conversão automática de primitivo para wrapper)
        int num = 50;
        Integer numObj = num; // autoboxing
        System.out.println("\nAutoboxing:");
        System.out.println("numObj: " + numObj);

        // 🔹 Unboxing (wrapper → primitivo)
        Integer outroObj = 200;
        int outroNum = outroObj; // unboxing automático
        System.out.println("\nUnboxing:");
        System.out.println("outroNum: " + outroNum);

        // 🔹 Operações matemáticas com wrappers (autounboxing)
        Integer a = 10;
        Integer b = 20;
        int soma = a + b; // autounboxing durante a operação
        System.out.println("\nOperações matemáticas:");
        System.out.println("a + b = " + soma);

        // 🔹 Comparações
        Integer x1 = 100;
        Integer x2 = 100;
        Integer y1 = 200;
        Integer y2 = 200;

        System.out.println("\nComparações:");
        System.out.println("x1 == x2: " + (x1 == x2)); // true (cache -128 a 127)
        System.out.println("y1 == y2: " + (y1 == y2)); // false (fora do cache)
        System.out.println("y1.equals(y2): " + y1.equals(y2)); // true (conteúdo)

        // 🔹 Conversão de String para wrapper
        String strNum = "123";
        Integer fromStr = Integer.parseInt(strNum); // retorna primitivo
        System.out.println("\nConversão de String para int: " + fromStr);

        // 🔹 Erro comum: NullPointerException
        // Integer nulo = null;
        // int primitivo = nulo; // ❌ lança NullPointerException

        // 🔹 Dicas de boas práticas
        // - Prefira usar equals() para comparar valores de wrapper
        // - Evite unboxing de objetos null
    }
}