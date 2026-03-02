package Parte03_Tipos_Referencia;

public class ExString {
    public static void main(String[] args) {
        /*
         * Tipo de dado: String
         *
         * String não é um tipo primitivo, mas uma classe que representa texto.
         * Pode armazenar palavras, frases ou qualquer sequência de caracteres.
         * Strings em Java são imutáveis: uma vez criadas, seu conteúdo não pode ser alterado.
         *
         * Elas são muito usadas em interfaces de usuário, arquivos, comunicação entre sistemas, etc.
         */

        // Exemplo de declaração
        String nome = "João";
        String saudacao = "Olá, mundo!";
        String fraseCompleta = nome + " diz: " + saudacao; // concatenação

        // Exibindo os valores na tela
        System.out.println("Nome: " + nome);
        System.out.println("Saudação: " + saudacao);
        System.out.println("Frase completa: " + fraseCompleta);

        // Métodos úteis de String
        int tamanho = fraseCompleta.length();        // retorna quantidade de caracteres
        String maiuscula = fraseCompleta.toUpperCase(); // transforma em maiúsculas
        String minuscula = fraseCompleta.toLowerCase(); // transforma em minúsculas
        char primeiroChar = fraseCompleta.charAt(0);    // acessa o primeiro caractere

        System.out.println("Tamanho da frase completa: " + tamanho);
        System.out.println("Maiúsculas: " + maiuscula);
        System.out.println("Minúsculas: " + minuscula);
        System.out.println("Primeiro caractere: " + primeiroChar);

        // Comparação de Strings
        String s1 = "Java";
        String s2 = "java";

        // equals(): compara conteúdo exato
        boolean iguaisExato = s1.equals(s2); // false
        // equalsIgnoreCase(): ignora maiúsculas/minúsculas
        boolean iguaisIgnorandoCase = s1.equalsIgnoreCase(s2); // true

        System.out.println("s1.equals(s2): " + iguaisExato);
        System.out.println("s1.equalsIgnoreCase(s2): " + iguaisIgnorandoCase);

        /*
         * Observações técnicas:
         * - Strings são objetos imutáveis: operações como concatenação criam novos objetos.
         * - Para manipulações intensivas, usar StringBuilder ou StringBuffer é mais eficiente.
         * - Comparação com '==' verifica referência (se apontam para o mesmo objeto), não o conteúdo.
         * - Muitas funções úteis estão disponíveis na classe String: substring, replace, split, 
             contains, indexOf, etc.
         */
    }
}
