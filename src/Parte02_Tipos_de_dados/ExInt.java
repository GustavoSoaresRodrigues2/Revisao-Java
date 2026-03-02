package Parte02_Tipos_de_dados;

public class ExInt {
    public static void main(String[] args) {
        /*
         * Tipo de dado: int
         *
         * O tipo 'int' é usado para armazenar números inteiros, ou seja, números sem casas decimais.
         * Ele ocupa 4 bytes de memória (32 bits) e pode armazenar valores de -2.147.483.648 até 
           2.147.483.647.
         *
         * Em tempo de execução, operações com int seguem regras da aritmética inteira:
         * - Soma, subtração, multiplicação, divisão e módulo (%)
         * - Divisão entre inteiros descarta a parte decimal
         */

        // Exemplo de declaração
        int idade = 25;       // idade de uma pessoa
        int anoAtual = 2026;  // ano corrente
        int quantidade = 100; // quantidade de produtos

        // Exibindo os valores na tela
        System.out.println("Idade: " + idade);
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Quantidade: " + quantidade);

        // Operações
        int soma = idade + quantidade;   // soma
        int subtracao = anoAtual - idade; // subtração
        int multiplicacao = idade * 2;         // multiplicação
        int divisao = anoAtual / 2;      // divisão (resultado também é inteiro)

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Divisão não exata
        int divisaoIncompleta = 7 / 2; // Resultado será 3, não 3.5
        System.out.println("Divisão 7 / 2 com int: " + divisaoIncompleta);

        // Módulo (resto da divisão)
        int resto = 7 % 2;                      // resultado será 1
        System.out.println("Resto da divisão 7 % 2: " + resto);

        /*
         * Observações importantes:
         * - Overflow: se um valor ultrapassar o limite máximo de int, ele "dá a volta" 
             (ex.: 2.147.483.647 + 1 = -2.147.483.648)
         * - Operações entre int e tipos diferentes podem exigir conversão (cast)
         * - Para valores maiores que 2 bilhões, deve-se usar 'long'
         */
    }
}
