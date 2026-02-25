package TiposDeDados;

public class Char {
    public static void main(ExString[] args) {
        // O tipo 'char' é usado para armazenar um único caractere
        // Ele ocupa 2 bytes e utiliza Unicode

        // Exemplo de declaração e inicialização de variáveis char
        // O uso de aspas simples é obrigatório
        char letra = 'A';
        char numeroChar = '7';
        char simbolo = '@';

        // Exibindo os valores na tela
        System.out.println("Letra: " + letra);
        System.out.println("Número como char: " + numeroChar);
        System.out.println("Símbolo: " + simbolo);

        // Operações simples com char
        char letraB = (char) (letra + 1); // letra 'A' + 1 → 'B'
        System.out.println("Letra 'A' + 1: " + letraB);

        // Comparação de caracteres
        if (letraB > letra) {
            System.out.println(letraB + " vem depois de " + letra + " na tabela Unicode");
        }
    }
}
