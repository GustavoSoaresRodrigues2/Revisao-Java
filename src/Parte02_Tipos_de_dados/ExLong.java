package Parte02_Tipos_de_dados;

public class ExLong {
    public static void main(String[] args) {
        /*
         * Tipo de dado: long
         *
         * O tipo 'long' é usado para armazenar números inteiros muito grandes.
         * Ele ocupa 8 bytes de memória (64 bits) e pode armazenar valores de
           -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
         *
         * Observações:
         * - Números literais grandes devem terminar com 'L' ou 'l', 
             caso contrário o compilador interpreta como int e pode gerar erro.
         * - Operações com long seguem regras da aritmética inteira.
         * - Divisão entre longs também retorna resultado inteiro.
         */

        // Exemplo de declaração
        long populacaoMundial = 8000000000L; // 8 bilhões
        long distanciaEstrelas = 9460730472580800L; // distância em km (número grande)
        long dinheiro = 1000000000000L; // 1 trilhão

        // Exibindo os valores na tela
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Distância de uma estrela: " + distanciaEstrelas);
        System.out.println("Dinheiro acumulado: " + dinheiro);

        // Operações
        long soma = populacaoMundial + dinheiro;   // soma
        long subtracao = dinheiro - distanciaEstrelas; // subtração
        long multiplicacao = populacaoMundial * 2;         // multiplicação
        long divisao = dinheiro / 2;      // divisão (resultado também é inteiro)

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);       
        
        // Divisão com long (também inteira)
        long divisaoIncompleta = 10L / 3L; // resultado será 3, não 3.333...
        System.out.println("Divisão 10 / 3 com long: " + divisaoIncompleta);

        /*
         * Observações técnicas:
         * - Overflow: se o resultado exceder 9.223.372.036.854.775.807, o valor "dá a volta" 
             (wrap-around)
         * - Conversão: operações entre int e long promovem o int para long automaticamente
         * - Para números maiores que o limite do long, é necessário usar BigInteger
         */
    }
}
