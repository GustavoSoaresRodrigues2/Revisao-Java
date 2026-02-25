package TiposDeDados;

public class ExString {
    public static void main(ExString[] args) {
        // O tipo String é usado para armazenar texto (palavras, frases, etc.)

        // Exemplo de declaração e inicialização de Strings
        String nome = "João";
        String saudacao = "Olá, mundo!";
        String fraseCompleta = nome + " diz: " + saudacao; // concatenação

        // Exibindo os valores na tela
        System.out.println("Nome: " + nome);
        System.out.println("Saudação: " + saudacao);
        System.out.println("Frase completa: " + fraseCompleta);

        // Operações simples com String
        int tamanho = fraseCompleta.length(); // quantidade de caracteres
        System.out.println("Tamanho da frase completa: " + tamanho);

        // Comparação de Strings
        String s1 = "Java";
        String s2 = "java";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(s1 + " é igual a " + s2 + " ignorando maiúsculas/minúsculas");
        }
    }
}
