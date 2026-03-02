package Parte02_Tipos_de_dados;

public class ExShort {
    public static void main(String[] args) {
        /*
         * Tipo de dado: short
         *
         * O tipo 'short' é usado para armazenar números inteiros pequenos.
         * Ocupa 2 bytes de memória (16 bits) e pode armazenar valores de -32.768 até 32.767.
         *
         * Observações:
         * - Operações aritméticas com short são promovidas automaticamente para int.
         * - Para atribuir o resultado de uma operação de volta a um short, é necessário usar 
             cast: (short).
         * - É útil para economizar memória quando os valores são pequenos, por exemplo, idades, 
             pequenas contagens, índices.
         * - Pode sofrer overflow: valores acima de 32.767 "dão a volta" para o mínimo (-32.768).
         */

        // Exemplo de declaração
        short idade = 25;         // idade de uma pessoa
        short temperatura = -5;   // temperatura em graus Celsius
        short quantidade = 300;   // pequena quantidade de itens

        // Exibindo os valores na tela
        System.out.println("Idade: " + idade);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Quantidade: " + quantidade);

        // Operações com short
        // Observação importante:
        // Como 'short' é menor que int, qualquer operação aritmética é convertida para int, por isso 
        // precisamos usar (short) para converter de volta para short
        short soma = (short) (idade + quantidade);  // soma de numeros pequenos
        short subtracao = (short) (idade - temperatura); // subtração
        short multiplicacao = (short) (idade * 2);       // multiplicação
        short divisao = (short) (quantidade / 2);  // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        /*
         * Observações técnicas:
         * - Operações como idade + quantidade retornam int, mesmo que ambos sejam short.
         * - Sempre usar cast para converter de int de volta para short.
         * - Para valores maiores, usar int ou long.
         * - Short é raro no dia a dia; int é mais comum por padrão.
         */
    }
}
