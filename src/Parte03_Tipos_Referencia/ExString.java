package Parte03_Tipos_Referencia;

/**
 * =========================================================
 * 📘 TEMA: Tipo de referência String
 * =========================================================
 *
 * 🔎 1) O que é?
 * String é um tipo de referência que representa uma sequência de caracteres.
 * É imutável: uma vez criada, não pode ser alterada diretamente.
 *
 * 🧠 2) Como funciona?
 * - Internamente, String usa array de caracteres.
 * - Operações que "modificam" a String retornam um novo objeto.
 *
 * 📏 3) Características:
 * - Tipo de referência
 * - Valor padrão: null
 * - Comparações: '==' compara referências, 'equals()' compara conteúdo
 *
 * ⚠ 4) Pontos de atenção:
 * - String literal é armazenada no "pool de Strings"
 * - Operações podem gerar novos objetos na memória
 * - Concatenar muitas Strings em loop pode ser ineficiente (usar StringBuilder)
 *
 * =========================================================
 */
public class ExString {

    public static void main(String[] args) {

        // 🔹 Criando Strings
        String s1 = "Olá";                 // literal
        String s2 = new String("Mundo");   // usando construtor
        String s3 = "Olá";                 // mesma literal de s1 (pool)

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // 🔹 Comparando Strings
        System.out.println("\nComparações:");
        System.out.println("s1 == s3: " + (s1 == s3));       // true (mesmo objeto no pool)
        System.out.println("s1 == s2: " + (s1 == s2));       // false (objetos diferentes)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false (conteúdo diferente)

        // 🔹 Operações comuns
        System.out.println("\nOperações:");
        System.out.println("s1 length: " + s1.length());      // tamanho
        System.out.println("s1 charAt(1): " + s1.charAt(1));  // caractere no índice 1
        System.out.println("s1 toUpperCase: " + s1.toUpperCase()); // converte para maiúscula
        System.out.println("s1 substring(1,3): " + s1.substring(1,3)); // fatiamento

        // 🔹 Concatenando Strings
        String saudacao = s1 + " " + s2;
        System.out.println("\nConcatenação: " + saudacao);

        // 🔹 Strings imutáveis
        String original = "Java";
        String modificada = original.replace('a', 'o');
        System.out.println("\nOriginal: " + original);     // não muda
        System.out.println("Modificada: " + modificada);   // novo objeto

        // 🔹 NullPointerException
        // String nula = null;
        // System.out.println(nula.length()); // ❌ causaria NullPointerException

        // 🔹 Dicas de boas práticas
        // - Para muitas concatenações em loop, use StringBuilder
        // - Sempre use equals() para comparar conteúdo
    }
}