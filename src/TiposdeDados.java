import java.lang.reflect.Array;
import java.util.ArrayList;

public class TiposdeDados {

    public static void main(String[] args) {

        // Inteiros (Números sem casas decimais).
        // byte: 8 bits (-128 a 127).
        byte numByte1 = -8;
        byte numByte2 = 127;
        // byte numByte3 = 129; (erro)

        // short: 16 bits (-32.768 a 32.767).
        short numShort1 = -1458;
        short numShort2 = 30554;
        // short numShort3 = -33000; (erro)

        // int: 32 bits (-2.147.483.648 a 2.147.483.647).
        int numInt1 = 125425612;
        int numInt2 = -954236481;
        // int numInt3 = -3000000000; (erro)

        // long: 64 bits (números inteiros muito grandes).
        long numLong1 = 1234567898;
        long numLong2 = 2146543210;
        // long numLong3 = 1234567894588; (erro)

        // Ponto Flutuante (Números com casas decimais).
        // float: 32 bits (precisão simples).
        float numFloat1 = 4581254.5f;
        float numFloat2 = -54645484.874f;

        // double: 64 bits (precisão dupla, padrão para decimais).
        double numDouble1 = 65454.658;
        double numDOuble2 = -879426.321;

        // Caracteres
        // char: 16 bits (armazena um único caractere Unicode), obrigatório uso de aspas
        // simples.
        char G = 'G';
        char U = 'U';

        // String: Armazena sequências de caracteres.
        String nomeString1 = "Gustavo";
        String nomeString2 = "Rodrigues";

        // Booleano
        // boolean: 1 bit (armazena apenas true ou false).
        boolean typeBoolean1 = false;
        boolean typeBoolean2 = true;

        // Tipos de Referência (Objetos)
        // Arrays (ou também Vetor): Coleções de dados do mesmo tipo.
        String[] nomesArrays1 = new String[5]; // iniciando e informando o tamanho de 0 a 5.
        nomesArrays1[1] = "Anderson"; // adicionando ou trocando o valor da casa 1.
        String[] nomesArrays2 = { "João", "Anderson", "Maria", "Carlos" }; // iniciando e já informando com dados.

        int[] numArrays1 = new int[3];
        numArrays1[3] = 4512;
        int[] numArrays2 = { 5, 6, 4 };

        // Um ArrayList é uma lista redimensionável (array dinâmico). Diferente dos arrays tradicionais, ele ajusta automaticamente o tamanho conforme elementos são adicionados ou removidos, permitindo manipulação dinâmica de coleções de objetos, mantendo a ordem de inserção e permitindo duplicatas.
        ArrayList<String> nomesArrayList1 = new ArrayList<>();
        nomesArrayList1.add("Gustavo"); // adiciona um dado.
        nomesArrayList1.add("Soares");
        nomesArrayList1.add("Rodrigues");
        nomesArrayList1.remove(0); // remove de acordo com o indice.
        nomesArrayList1.get(0); // pega o valor de acordo com o indice.
        nomesArrayList1.set(0, "Caique"); // Atualiza o valor de um indice.
        int tamanhoArrayList = nomesArrayList1.size(); // Retorna o número de elementos. (Útil para loops)
        System.out.println("Tamanho do ArrayList: " + tamanhoArrayList);
        boolean existe = nomesArrayList1.contains("Gustavo"); // Verifica se o item existe. (true ou false)
        System.out.println("Existe esse elemento? " + existe);
        nomesArrayList1.clear(); //Remove todos os itens. (Lista fica vazia tamanho 0)

        // Laços de repetição
        // ⚠️ Se você esquecer de alterar a variável da condição, você entrará em um loop infinito.
        // while: Repete o código enquanto uma condição específica for verdadeira, útil quando o número de iterações não é conhecido.
        int count1 = 1;
        while (count1 < 9) {
            System.out.println("Estou testando o while");
            count1++;
        }

        // do-while: Semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez antes de testar a condição.
        int count2 = 10;
        do {
            System.out.println("Executou pelo menos uma vez o do-while!");
        } while (count2 < 5);

        // for: Ideal quando você sabe antecipadamente quantas vezes deseja repetir o código ou precisa percorrer uma sequência (lista, string).
        /*
            for (inicialização; condição; incremento) {
                código que será repetido
            }
        */
        String[] nomes1 = { "João", "Anderson", "Maria", "Carlos" };
        for (int i = 0; i < nomes1.length; i++) {
            System.out.println(nomes1[i]);
        }

        // Condicionais
        // As estruturas condicionais em Java permitem que o programa tome decisões e altere seu fluxo de execução com base em condições booleanas (verdadeiro ou falso).
        // Condicional Simples (if). Executa um bloco de código apenas se a condição for verdadeira.
        int idade = 18;
        if (idade > 18) {
            System.out.println("Não pode beber álcool");
        }

        // Condicional Composta (if-else). Oferece uma alternativa (else) caso a condição do if seja falsa, executando um bloco de código alternativo.
        if (idade > 18) {
            System.out.println("Não pode beber álcool");
        } else {
            System.out.println("Pode beber Refri");
        }

        // O comando switch em Java é uma estrutura de controle de fluxo utilizada para selecionar um bloco de código a ser executado com base no valor de uma expressão (variável). Ele funciona como uma alternativa mais limpa e legível a múltiplos if-else-if encadeados quando se precisa comparar a mesma variável com várias opções fixas.
        switch (numInt1) {
            case 0:
                System.out.println("Numero é ZERO");
                break;
            case 4154542:
                System.out.println("Numero é 4154542");
            default:
                System.out.println("Não atendeu nenhum dos casos");
                break;
        }

        // Casting
        // Casting em Java é o processo de converter um tipo de dado em outro. Como o Java é uma linguagem fortemente tipada, isso é necessário para garantir a compatibilidade entre diferentes tipos (como converter um int para double ou vice-versa).
        // Casting de Ampliação ocorre automaticamente quando um tipo de dado menor é convertido para um tipo maior. Não há risco de perda de dados. Ordem: byte -> short -> char -> int -> long -> float -> double.
        // Casting de Estreitamento deve ser feito manualmente, pois ocorre ao converter um tipo maior para um menor. Existe risco de perda de informação (perda de precisão).
        int numInt4 = 9;
        double numDouble3 = numInt4; // Casting automático: int para double
        System.out.println(numInt4); // Saída: 9
        System.out.println(numDouble3); // Saída: 9.0

        double numDouble4 = 9.78;
        int numInt5 = (int) numDouble4; // Casting manual: double para int
        System.out.println(numDouble4); // Saída: 9.78
        System.out.println(numInt5);    // Saída: 9 (o decimal é truncado)
    }
}
