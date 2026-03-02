package Parte02_Tipos_de_dados;

public class ExDouble {
    public static void main(String[] args) {
        /*
         * Tipo de dado: double
         *
         * O tipo 'double' é usado para armazenar números com casas decimais.
         * Ele ocupa 8 bytes de memória (64 bits) e possui precisão de aproximadamente 15 dígitos 
           decimais.
         * É o tipo mais comum para cálculos com números reais que exigem precisão.
         *
         * Observação:
         * - Diferente do float, não é necessário colocar 'f' no final do número.
         * - Para maior precisão que float, usamos double.
         */

        // Exemplo de declaração
        double preco = 19.99;          // preço de um produto
        double altura = 1.75;          // altura de uma pessoa
        double temperatura = -5.5;     // temperatura em graus Celsius

        // Exibindo os valores na tela
        System.out.println("Preço: " + preco);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);

        // Operações
        double soma = preco + 10.0;          // soma
        double subtracao = altura - 0.25;    // subtração
        double multiplicacao = preco * 2;    // multiplicação
        double divisao = preco / 3;          // divisão

        // Exibindo os resultados
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        /*
         * Observações importantes:
         * - Operações com double podem ter pequenas imprecisões por causa da representação binária.
         * - Para comparações, nunca use '==' diretamente; prefira comparar com uma margem de 
             erro (epsilon).
         * - Se precisar de mais precisão, especialmente para valores monetários, recomenda-se usar 
         BigDecimal.
         */
    }
}
