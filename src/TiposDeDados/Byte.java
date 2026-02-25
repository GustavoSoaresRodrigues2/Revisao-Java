package TiposDeDados;

public class Byte {
    public static void main(ExString[] args) {
        // O tipo 'byte' é usado para armazenar números inteiros bem pequenos
        // Ele ocupa 1 byte de memória e pode armazenar valores de -128 até 127

        // Exemplo de declaração e inicialização de variáveis byte
        byte idadePequena = 25;       // idade de uma criança
        byte temperatura = -5;        // temperatura em graus Celsius
        byte quantidade = 100;        // pequena quantidade de itens

        // Exibindo os valores na tela
        System.out.println("Idade pequena: " + idadePequena);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Quantidade: " + quantidade);

        // Operações com byte
        // Observação importante:
        // Qualquer operação aritmética com byte é convertida automaticamente para int, por isso precisamos usar (byte) para converter de volta para byte
        byte soma = (byte) (idadePequena + quantidade);  // soma de numeros pequenos
        byte subtracao = (byte) (idadePequena - temperatura); // subtração
        byte multiplicacao = (byte) (idadePequena * 2);       // multiplicação
        byte divisao = (byte) (quantidade / 2);         // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
