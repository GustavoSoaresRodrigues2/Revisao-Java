package Parte02_Tipos_Primitivos;

/**
 * =========================================================
 * 📘 TEMA: Casting em Java
 * =========================================================
 *
 * 🔎 1) O que é?
 * Casting é a conversão de um tipo de dado em outro.  
 * Como Java é fortemente tipada, o casting garante compatibilidade
 * entre tipos diferentes.
 *
 * 🧠 2) Tipos de Casting
 *
 * Widening (ampliação):
 * - Conversão automática de tipo menor para tipo maior
 * - Seguro, sem perda de dados
 *
 * Narrowing (estreitamento):
 * - Conversão manual de tipo maior para tipo menor
 * - Pode causar perda de dados ou overflow
 *
 * 📏 3) Características técnicas:
 * - Ordem comum Widening:
 *   byte -> short -> int -> long -> float -> double  
 *   char -> int -> long -> float -> double
 * - Narrowing exige cast explícito
 *
 * ⚠ 4) Pontos de atenção:
 * - Narrowing pode truncar valores decimais
 * - Narrowing pode causar overflow em inteiros
 * - Casting entre tipos incompatíveis não é permitido
 *
 * =========================================================
 */
public class ExCasting {

    public static void main(String[] args) {

        // ------------------------------------------
        // 1. WIDENING (CASTING AUTOMÁTICO)
        // ------------------------------------------
        int numInt = 42;
        long numLong = numInt;     // int -> long
        float numFloat = numInt;   // int -> float
        double numDouble = numInt; // int -> double

        System.out.println("Widening (automático):");
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);

        // ------------------------------------------
        // 2. NARROWING (CASTING MANUAL)
        // ------------------------------------------
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // truncamento
        System.out.println("\nNarrowing (manual):");
        System.out.println("double: " + valorDouble);
        System.out.println("int (truncado): " + valorInt);

        // ------------------------------------------
        // 3. CASTING COM INTEIROS (POSSÍVEL OVERFLOW)
        // ------------------------------------------
        int grandeInt = 130;
        byte pequenoByte = (byte) grandeInt; // overflow
        System.out.println("\nCasting int -> byte com overflow:");
        System.out.println("int: " + grandeInt);
        System.out.println("byte: " + pequenoByte + " (overflow, dá a volta)");

        // Explicando overflow:
        // 130 em binário (8 bits) = 10000010 → interpretado como complemento de dois = -126

        // ------------------------------------------
        // 4. CASTING FLOAT / DOUBLE
        // ------------------------------------------
        float numF = 3.99f;
        int numI = (int) numF; // truncamento, não arredonda
        System.out.println("\nCasting float -> int (truncamento):");
        System.out.println("float: " + numF);
        System.out.println("int: " + numI);

        double numD = 7.999;
        int numI2 = (int) numD; // truncamento
        System.out.println("\nCasting double -> int (truncamento):");
        System.out.println("double: " + numD);
        System.out.println("int: " + numI2);

        // ------------------------------------------
        // 5. CASTING CHAR
        // ------------------------------------------
        char letra = 'A';
        int codigo = letra;        // Widening automático: char -> int
        System.out.println("\nCasting char -> int:");
        System.out.println("char: " + letra);
        System.out.println("int: " + codigo);

        int numero = 66;
        char letra2 = (char) numero; // Narrowing manual: int -> char
        System.out.println("\nCasting int -> char:");
        System.out.println("int: " + numero);
        System.out.println("char: " + letra2);

        // ------------------------------------------
        // 6. RESUMO VISUAL
        // ------------------------------------------
        System.out.println("\nResumo de casting:");
        System.out.println("Widening: automático, seguro (tipo menor -> maior)");
        System.out.println("Narrowing: manual, risco de perda ou overflow (tipo maior -> menor)");
    }
}