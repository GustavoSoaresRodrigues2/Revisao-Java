package TiposDeDados;

public class Float {
    public static void main(ExString[] args) {
        // O tipo 'float' é usado para armazenar números com casas decimais
        // Ele ocupa 4 bytes de memória e tem precisão de aproximadamente 7 dígitos decimais.

        // Exemplo de declaração e inicialização de variáveis float
        // Observação importante: sempre use 'f' ou 'F' no final do número literal, caso contrário o Java interpreta como double e dá erro de compilação
        float preco = 19.99f;          // preço de um produto
        float altura = 1.75f;          // altura de uma pessoa
        float temperatura = -5.5f;     // temperatura em graus Celsius

        // Exibindo os valores na tela
        System.out.println("Preço: " + preco);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);

        // Operações com float
        float soma = preco + 10.0f;          // soma
        float subtracao = altura - 0.25f;    // subtração
        float multiplicacao = preco * 2;           // multiplicação
        float divisao = preco / 3;           // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Comparação entre int e float
        int inteiro = 5;
        float resultado = inteiro / 2f; // divisão correta com decimal
        System.out.println("Divisão de int por float: " + resultado);
    }
}
