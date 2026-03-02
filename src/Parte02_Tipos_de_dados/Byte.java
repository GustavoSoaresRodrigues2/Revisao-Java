package Parte02_Tipos_de_dados;

public class Byte {
    public static void main(String[] args) {
         /*
         * Tipo de dado: byte
         *
         * O tipo 'byte' é usado para armazenar números inteiros muito pequenos.
         * Ocupa 1 byte de memória (8 bits) e pode armazenar valores de -128 até 127.
         *
         * Observações:
         * - Operações aritméticas com byte são automaticamente promovidas para int.
         * - Para atribuir o resultado de volta a byte, é necessário usar cast: (byte).
         * - Útil para economizar memória em grandes arrays ou pequenas contagens.
         */

        // Exemplo de declaração
        byte idadePequena = 25;       // idade de uma criança
        byte temperatura = -5;        // temperatura em graus Celsius
        byte quantidade = 100;        // pequena quantidade de itens

        // Exibindo os valores na tela
        System.out.println("Idade pequena: " + idadePequena);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Quantidade: " + quantidade);

        // Operações com byte
        // Observação importante:
        // Qualquer operação aritmética com byte é convertida automaticamente para int, por isso 
        // precisamos usar (byte) para converter de volta para byte
        byte soma = (byte) (idadePequena + quantidade);  // soma de numeros pequenos
        byte subtracao = (byte) (idadePequena - temperatura); // subtração
        byte multiplicacao = (byte) (idadePequena * 2);       // multiplicação
        byte divisao = (byte) (quantidade / 2);         // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        /*
         * Observações importantes:
         * - Overflow: se o resultado exceder 127 ou for menor que -128, o valor "dá a volta".
         * - Byte é usado com frequência em manipulação de arquivos binários e streams de dados.
         */
    }
}
