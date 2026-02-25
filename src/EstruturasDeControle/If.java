package EstruturasDeControle;

public class If {
    public static void main(String[] args) {
        // ==========================
        // ESTRUTURA IF
        // ==========================
        // O if é usado para executar um bloco de código **somente se uma condição for verdadeira**.
        // Estrutura básica:
        /*
            if (condição) {
                código a ser executado se a condição for verdadeira
            }
        */

        // Observações importantes:
        // 1. A condição dentro do if deve retornar um valor booleano (true ou false).
        // 2. É possível usar else para tratar o caso em que a condição não é verdadeira.
        // 3. O else if permite testar múltiplas condições em sequência.
        // 4. As chaves {} podem ser omitidas se houver apenas uma linha, mas é recomendado sempre usá-las.

        // Exemplo 1: Verificando idade
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        // Exemplo 2: Verificando número positivo
        int numero = -5;
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número não é positivo.");
        }

        // Exemplo 3: Verificando nota e usando else if
        int nota = 85;
        if (nota >= 90) {
            System.out.println("Nota A");
        } else if (nota >= 70) {
            System.out.println("Nota B");
        } else if (nota >= 50) {
            System.out.println("Nota C");
        } else {
            System.out.println("Nota D");
        }

        // Exemplo 4: Comparando caracteres
        char letra = 'B';
        if (letra == 'A') {
            System.out.println("A letra é A");
        } else {
            System.out.println("A letra não é A");
        }
    }
}
