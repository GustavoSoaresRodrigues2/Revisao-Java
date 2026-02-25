package TiposDeDados;

public class Casting {
    public static void main(ExString[] args) {
        // ==========================
        // CASTING EM JAVA
        // ==========================
        // Casting em Java é o processo de converter um tipo de dado em outro
        // Como Java é fortemente tipada, essa conversão garante compatibilidade entre tipos diferentes

        // ------------------------------------------
        // 1. CASTING DE AMPLIAÇÃO (WIDENING) AUTOMÁTICO
        // ------------------------------------------
        // Um tipo menor é convertido automaticamente para um tipo maior
        // Não há risco de perda de dados
        // Ordem comum: byte -> short -> char -> int -> long -> float -> double

        int numInt4 = 9;
        double numDouble3 = numInt4; // Casting automático: int -> double

        System.out.println("Casting automático (int -> double):");
        System.out.println("int: " + numInt4);        // Saída: 9
        System.out.println("double: " + numDouble3); // Saída: 9.0

        // ------------------------------------------
        // 2. CASTING DE ESTREITAMENTO (NARROWING) MANUAL
        // ------------------------------------------
        // Um tipo maior é convertido para um tipo menor
        // Pode haver perda de dados (truncamento ou overflow)
        double numDouble4 = 9.78;
        int numInt5 = (int) numDouble4; // Casting manual: double -> int
        System.out.println("\nCasting manual (double -> int):");
        System.out.println("double: " + numDouble4); // Saída: 9.78
        System.out.println("int (truncado): " + numInt5); // Saída: 9 (decimal cortado)

        // ------------------------------------------
        // 3. CASTING COM INTEIROS (POSSÍVEL OVERFLOW)
        // ------------------------------------------
        int numIntGrande = 130;
        byte numByte = (byte) numIntGrande; // Casting manual: int -> byte
        System.out.println("\nCasting int -> byte com overflow:");
        System.out.println("int: " + numIntGrande); // Saída: 130
        System.out.println("byte: " + numByte);     // Saída: -126 (valor "dá a volta")

        // ------------------------------------------
        // 4. CASTING COM FLOAT/DOUBLE
        // ------------------------------------------
        float numFloat = 3.99f;
        int numInt6 = (int) numFloat; // Truncamento, não arredonda
        System.out.println("\nCasting float -> int (truncamento):");
        System.out.println("float: " + numFloat); // Saída: 3.99
        System.out.println("int: " + numInt6);    // Saída: 3

        // ------------------------------------------
        // RESUMO VISUAL (WIDENING x NARROWING)
        // ------------------------------------------
        // Widening: automático, seguro
        // int -> double: 5 -> 5.0
        // Narrowing: manual, risco de perda de dados
        // double -> int: 9.78 -> 9
        // int -> byte: 130 -> -126 (overflow)
    }
}
