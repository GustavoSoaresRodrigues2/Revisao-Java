package EstruturasDeControle;

public class While {
    public static void main(String[] args) {
        // ==========================
        // LAÇO WHILE
        // ==========================
        // O laço while é usado quando queremos repetir um bloco de código **enquanto uma condição for verdadeira**
        // Estrutura básica:
        /*
            while (condição) {
                código a ser repetido
            }
        */

        // Observações importantes:
        // 1. A condição é verificada **antes** da primeira execução do bloco.
        //    Se for falsa, o bloco **não será executado**.
        // 2. É essencial atualizar a variável de controle dentro do loop para evitar loops infinitos.
        // 3. Pode ser usado quando o número de repetições **não é conhecido** antecipadamente.
        //    Ex: esperar até que o usuário digite um valor específico.

        // Exemplo 1: Contando de 1 a 5
        System.out.println("Contando de 1 a 5 com while:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Número: " + i);
            i++;
        }

        // Exemplo 2: Soma de números de 1 a 10
        int soma = 0;
        int j = 1;
        while (j <= 10) {
            soma += j; // soma = soma + j
            j++;
        }
        System.out.println("\nSoma de 1 a 10 usando while: " + soma);

        // Exemplo 3: Loop com condição dinâmica
        int contador = 0;
        while (contador < 3) {
            System.out.println("\nContador atual: " + contador);
            contador++;
        }
    }
}
