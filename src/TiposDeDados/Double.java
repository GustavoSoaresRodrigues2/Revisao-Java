package TiposDeDados;

public class Double {
    public static void main(ExString[] args) {
        // O tipo 'double' é usado para armazenar números com casas decimais
        // Ele ocupa 8 bytes de memória e tem precisão de aproximadamente 15 dígitos decimais

        // Exemplo de declaração e inicialização de variáveis double
        double preco = 19.99;          // preço de um produto
        double altura = 1.75;          // altura de uma pessoa
        double temperatura = -5.5;     // temperatura em graus Celsius

        // Exibindo os valores na tela
        System.out.println("Preço: " + preco);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);

        // Operações com double
        double soma = preco + 10.0;          // soma
        double subtracao = altura - 0.25;    // subtração
        double multiplicacao = preco * 2;    // multiplicação
        double divisao = preco / 3;          // divisão

        // Exibindo os resultados
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Observação importante:
        // Diferente do float, não precisamos do 'f' no final do número, Double é mais preciso e recomendado para cálculos com maior exatidão
    }
}
