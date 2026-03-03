package Parte11_Algoritmos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================
 * 📘 TEMA: Expressões Regulares (Regex) em Java
 * =========================================================
 *
 * 🔎 1) O que é Regex?
 * - Um padrão usado para procurar, validar ou manipular strings
 * - Muito útil para:
 *      - Validar e-mails
 *      - Validar números
 *      - Extrair palavras
 *      - Substituir caracteres
 *
 * 🔎 2) Conceitos básicos
 * - .      → qualquer caractere
 * - \d     → dígito (0-9)
 * - \D     → não dígito
 * - \s     → espaço
 * - \S     → não espaço
 * - \w     → caractere alfanumérico
 * - \W     → não alfanumérico
 * - *      → 0 ou mais vezes
 * - +      → 1 ou mais vezes
 * - ?      → 0 ou 1 vez
 * - {n}    → exatamente n vezes
 * - ^      → início da string
 * - $      → fim da string
 *
 * 🔎 3) Exemplo de uso
 */
public class ExRegex {

    public static void main(String[] args) {

        String texto = "Meu email é teste123@gmail.com e meu telefone é 99999-8888.";

        // ======================
        // 1. Validar e-mail simples
        // ======================
        String padraoEmail = "\\w+@\\w+\\.\\w+";
        boolean emailValido = texto.matches(".*" + padraoEmail + ".*");
        System.out.println("Contém email válido? " + emailValido);

        // ======================
        // 2. Encontrar números no texto
        // ======================
        String padraoNumero = "\\d+";
        Pattern pattern = Pattern.compile(padraoNumero);
        Matcher matcher = pattern.matcher(texto);

        System.out.print("Números encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        // ======================
        // 3. Substituir caracteres
        // ======================
        String textoSemNumeros = texto.replaceAll("\\d", "#");
        System.out.println("Texto sem números: " + textoSemNumeros);

        // ======================
        // 4. Usar regex para limpar string de palíndromo
        // ======================
        String exemploPalindromo = "A man a plan a canal Panama";
        String limpo = exemploPalindromo.replaceAll("\\s+", "").toLowerCase();
        System.out.println("Palindromo limpo: " + limpo);
    }
}