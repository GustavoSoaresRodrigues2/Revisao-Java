package EstruturasDeControle;

public class For {
    public static void main(String[] args) {
        // ==========================
        // LAÇO FOR
        // ==========================
        // O laço for é usado quando você sabe **quantas vezes** quer repetir um bloco de código
        // Estrutura básica:
        /*
            for (inicialização; condição; incremento/decremento) {
                código a ser repetido
            }
        */

        // Observações importantes:
        // 1. A variável de controle (i) é geralmente do tipo int.
        // 2. A condição é verificada antes de cada repetição; se for falsa, o laço termina.
        // 3. O incremento/decremento acontece no final de cada repetição.
        // 4. É possível usar mais de uma variável no for (ex: for(int i=0, j=10; i<j; i++, j--))
        // 5. O for é ideal quando sabemos **quantas vezes** queremos executar o bloco de código.

        // Exemplo 1: Contando de 1 a 5
        System.out.println("Contando de 1 a 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Exemplo 2: Contando de 10 até 2, decrementando
        System.out.println("\nContando de 10 até 2:");
        for (int i = 10; i >= 2; i--) {
            System.out.println("Número: " + i);
        }

        // Exemplo 3: Somando números de 1 a 100
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i; // soma = soma + i
        }
        System.out.println("\nSoma de 1 a 100: " + soma);

        // Exemplo 4: Iterando sobre um array
        int[] numeros = {2, 4, 6, 8, 10};
        System.out.println("\nIterando sobre um array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }
}
