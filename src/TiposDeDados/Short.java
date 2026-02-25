package TiposDeDados;

public class Short {
    public static void main(ExString[] args) {
        // O tipo 'short' é usado para armazenar números inteiros pequenos
        // Ele ocupa 2 bytes de memória e pode armazenar valores de -32.768 até 32.767

        // Exemplo de declaração e inicialização de variáveis short
        short idade = 25;         // idade de uma pessoa
        short temperatura = -5;   // temperatura em graus Celsius
        short quantidade = 300;   // pequena quantidade de itens

        // Exibindo os valores na tela
        System.out.println("Idade: " + idade);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Quantidade: " + quantidade);

        // Operações com short
        // Observação importante:
        // Como 'short' é menor que int, qualquer operação aritmética é convertida para int, por isso precisamos usar (short) para converter de volta para short
        short soma = (short) (idade + quantidade);  // soma de numeros pequenos
        short subtracao = (short) (idade - temperatura); // subtração
        short multiplicacao = (short) (idade * 2);       // multiplicação
        short divisao = (short) (quantidade / 2);  // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
