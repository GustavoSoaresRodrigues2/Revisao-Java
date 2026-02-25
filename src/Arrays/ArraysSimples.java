package Arrays;

public class ArraysSimples {
    public static void main(String[] args) {
        // ==========================
        // ARRAYS SIMPLES
        // ==========================
        // Um array é uma estrutura que armazena **vários valores do mesmo tipo** em uma única variável
        // Cada valor é acessado por um índice, que começa em 0

        // Observações importantes:
        // 1. Arrays possuem tamanho fixo, definido na declaração ou pela quantidade de elementos iniciais.
        // 2. O índice sempre começa em 0 e vai até array.length - 1.
        // 3. É necessário conhecer o tipo do array (int, double, String, etc.).

        // Exemplo 1: Declarando e inicializando um array de inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        // Exibindo os elementos do array
        System.out.println("Elementos do array numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Exemplo 2: Alterando valores do array
        numeros[2] = 35; // muda o terceiro elemento (índice 2) de 30 para 35
        System.out.println("\nArray após alteração:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Exemplo 3: Array de Strings
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        System.out.println("\nNomes no array:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Índice " + i + ": " + nomes[i]);
        }
    }
}
