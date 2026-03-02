package Parte02_Tipos_de_dados;

public class ExBoolean {
    public static void main(String[] args) {
        /*
         * Tipo de dado: boolean
         *
         * O tipo boolean é usado para armazenar valores lógicos, ou seja, verdadeiro (true) ou falso 
           (false).
         * Ocupa geralmente 1 bit de informação, mas em Java, por motivos de alinhamento, o tamanho 
           exato pode variar.
         *
         * Boolean é fundamental para:
         * - Controle de fluxo (if, while, for)
         * - Operações lógicas (AND, OR, NOT)
         * - Comparações (>, <, ==, !=, >=, <=)
         */

        // Exemplo de declaração
        boolean ligado = true;
        boolean aprovado = false;

        // Exibindo os valores na tela
        System.out.println("Ligado: " + ligado);
        System.out.println("Aprovado: " + aprovado);

        // Operações lógicas
        boolean resultado1 = ligado && aprovado; // AND lógico: true se ambos forem true
        boolean resultado2 = ligado || aprovado; // OR lógico: true se algum for true
        boolean resultado3 = !ligado;            // NOT lógico: inverte o valor

        // Exibindo os valores na tela
        System.out.println("\nOperações lógicas:");
        System.out.println("ligado && aprovado: " + resultado1);
        System.out.println("ligado || aprovado: " + resultado2);
        System.out.println("!ligado: " + resultado3);

        // Comparações simples retornam boolean
        int a = 10;
        int b = 5;
        boolean comparacao = a > b; // true
        System.out.println("\nComparação a > b: " + comparacao);

        /*
         * Observações técnicas:
         * - Operadores lógicos &&, || e ! seguem a lógica booleana tradicional.
         * - Comparações entre valores de tipos primitivos (int, double, char) retornam boolean.
         * - Boolean não armazena números; true != 1 e false != 0.
         * - Boolean é essencial em estruturas de controle: if, while, for, do-while.
         * - Em Java, também existe a classe wrapper Boolean, que permite uso de boolean como objeto 
             (útil em coleções, generics e conversão com null).
         */
    }
}
