package Parte02_Tipos_de_dados;

public class ExChar {
    public static void main(String[] args) {
        /*
         * Tipo de dado: char
         *
         * O tipo 'char' é usado para armazenar um único caractere.
         * Ele ocupa 2 bytes de memória (16 bits) e utiliza a tabela Unicode,
         * permitindo representar letras, números, símbolos e caracteres especiais de diferentes 
           idiomas.
         *
         * Observações:
         * - O valor deve ser colocado entre aspas simples: 'A', '7', '@'.
         * - Diferente de String, char armazena apenas um caractere.
         */

        // Exemplo de declaração
        char letra = 'A';
        char numeroChar = '7';
        char simbolo = '@';

        // Exibindo os valores na tela
        System.out.println("Letra: " + letra);
        System.out.println("Número como char: " + numeroChar);
        System.out.println("Símbolo: " + simbolo);

        // Operações aritméticas com char
        // Cada char tem um valor numérico Unicode, então é possível somar ou subtrair
        char letraB = (char) (letra + 1); // 'A' + 1 → 'B'
        char letraC = (char) (letra + 2); // 'A' + 2 → 'C'
        System.out.println("Letra 'A' + 1: " + letraB);
        System.out.println("Letra 'A' + 2: " + letraC);

        // Comparação de caracteres
        if (letraB > letra) {
            System.out.println(letraB + " vem depois de " + letra + " na tabela Unicode");
        }

        // Conversão entre char e int
        int valorUnicode = letra;          // char → int (Unicode)
        char deUnicode = (char) 66;        // int → char ('B')
        System.out.println("Valor Unicode de 'A': " + valorUnicode);
        System.out.println("Caractere de Unicode 66: " + deUnicode);

        /*
         * Observações técnicas:
         * - Char pode ser usado em operações aritméticas ou comparações.
         * - Unicode garante compatibilidade internacional de caracteres.
         * - Para múltiplos caracteres, usar String.
         * - Conversão explícita (cast) é necessária quando se faz operações aritméticas que retornam 
             int.
         */
    }
}
