package Parte02_Tipos_de_dados;

public class ExFloat {
    public static void main(String[] args) {
        /*
         * Tipo de dado: float
         *
         * O tipo 'float' é usado para armazenar números com casas decimais.
         * Ele ocupa 4 bytes de memória (32 bits) e possui precisão de aproximadamente 7 dígitos 
           decimais.
         *
         * Observações importantes:
         * - Diferente do double, é menos preciso, mas consome menos memória.
         * - Literal de float exige 'f' ou 'F' no final do número, caso contrário o Java interpreta 
             como double.
         * - É recomendado quando precisão absoluta não é crítica, por exemplo, gráficos, medidas 
             aproximadas, sensores, etc.
         */

        // Exemplo de declaração
        float preco = 19.99f;          // preço de um produto
        float altura = 1.75f;          // altura de uma pessoa
        float temperatura = -5.5f;     // temperatura em graus Celsius

        // Exibindo os valores na tela
        System.out.println("Preço: " + preco);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);

        // Operações
        float soma = preco + 10.0f;          // soma
        float subtracao = altura - 0.25f;    // subtração
        float multiplicacao = preco * 2;           // multiplicação
        float divisao = preco / 3;           // divisão

        // Exibindo os valores na tela
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Conversão e operação com int
        int inteiro = 5;
        float resultado = inteiro / 2f; // divisão correta com decimal
        System.out.println("Divisão de int por float: " + resultado);

        /*
         * Observações técnicas:
         * - Operações entre int e float podem gerar implicit casting (conversão automática para 
             float)
         * - Overflow e underflow podem ocorrer, mas são menos comuns que em int devido ao alcance 
             maior
         * - Comparações diretas de float podem ser imprecisas devido à representação binária. 
         *   Prefira comparar usando uma margem de erro (epsilon), por exemplo:
         *
         *   float a = 0.1f + 0.2f;
         *   float b = 0.3f;
         *   if (Math.abs(a - b) < 0.0001f) { ... }
         */
    }
}
