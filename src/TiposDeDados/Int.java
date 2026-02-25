package TiposDeDados;

public class Int {
    public static void main(ExString[] args) {
        // O tipo 'int' é usado para armazenar números inteiros, ou seja, números sem casas decimais
        // Ele ocupa 4 bytes de memória e pode armazenar valores de -2.147.483.648 até 2.147.483.647

        // Exemplo de declaração e inicialização de variáveis int
        int idade = 25;       // idade de uma pessoa
        int anoAtual = 2026;  // ano corrente
        int quantidade = 100; // quantidade de produtos

        // Exibindo os valores na tela
        System.out.println("Idade: " + idade);
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Quantidade: " + quantidade);

        // Operações com int
        int soma = idade + quantidade;   // soma de dois inteiros
        int subtracao = anoAtual - idade; // subtração
        int multiplicacao = idade * 2;         // multiplicação
        int divisao = anoAtual / 2;      // divisão (resultado também é inteiro)

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Observação importante:
        // Como 'int' não aceita casas decimais, qualquer divisão que não seja exata vai "cortar" a parte decimal
        int divisaoIncompleta = 7 / 2; // Resultado será 3, não 3.5
        System.out.println("Divisão 7 / 2 com int: " + divisaoIncompleta);
    }
}
