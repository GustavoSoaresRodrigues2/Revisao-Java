package TiposDeDados;

public class Long {
    public static void main(ExString[] args) {
        // O tipo 'long' é usado para armazenar números inteiros grandes
        // Ele ocupa 8 bytes de memória e pode armazenar valores de -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807

        // Exemplo de declaração e inicialização de variáveis long
        // Observação: sem o 'L' no final, números muito grandes podem causar erro de compilação
        long populacaoMundial = 8000000000L; // 8 bilhões
        long distanciaEstrelas = 9460730472580800L; // distância em km (número grande)
        long dinheiro = 1000000000000L; // 1 trilhão
        // Exemplo de erro: long numeroGrande = 10000000000; // ERRO! precisa do 'L'

        // Exibindo os valores na tela
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Distância de uma estrela: " + distanciaEstrelas);
        System.out.println("Dinheiro acumulado: " + dinheiro);

        // Operações com long
        long soma = populacaoMundial + dinheiro;   // soma de números grandes
        long multiplicacao = dinheiro * 2;               // multiplicação

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);       
        
        // Divisão com long (também inteira)
        long divisao = 10L / 3L; // resultado será 3, não 3.333...
        System.out.println("Divisão 10 / 3 com long: " + divisao);
    }
}
