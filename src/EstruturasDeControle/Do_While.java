package EstruturasDeControle;

public class Do_While {
    public static void main(String[] args) {
        // ==========================
        // LAÇO DO-WHILE
        // ==========================
        // O laço do-while é usado quando queremos que o bloco de código seja executado **pelo menos uma vez**, mesmo que a condição seja falsa inicialmente
        // Estrutura básica:
        /* 
            do {
                código a ser repetido
            } while (condição);
        */

        // Observações importantes:
        // 1. A condição é verificada **após** a execução do bloco.
        // 2. Garantia de execução mínima de uma vez, mesmo se a condição for falsa.
        // 3. Pode ser usado para menus interativos, onde a primeira exibição sempre ocorre.
        // 4. Evite loops infinitos: sempre atualize a variável de controle dentro do bloco.

        // Exemplo 1: Contando de 1 a 5
        System.out.println("Contando de 1 a 5 com do-while:");
        int i = 1;
        do {
            System.out.println("Número: " + i);
            i++;
        } while (i <= 5);

        // Exemplo 2: Executando pelo menos uma vez, mesmo com condição falsa
        System.out.println("\nExecutando com condição inicialmente falsa:");
        int j = 10;
        do {
            System.out.println("Isso será impresso pelo menos uma vez! j = " + j);
            j++;
        } while (j < 5); // condição é falsa, mas o bloco executa 1 vez

        // Exemplo 3: Soma de números de 1 a 10
        int soma = 0;
        int k = 1;
        do {
            soma += k;
            k++;
        } while (k <= 10);
        System.out.println("\nSoma de 1 a 10 usando do-while: " + soma);
    }
}
