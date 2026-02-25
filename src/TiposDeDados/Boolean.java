package TiposDeDados;

public class Boolean {
    public static void main(String[] args) {
        // O tipo boolean é usado para armazenar valores verdadeiros ou falsos
        // Pode assumir apenas true ou false

        // Exemplo de declaração e inicialização de variáveis boolean
        boolean ligado = true;
        boolean aprovado = false;

        // Exibindo os valores na tela
        System.out.println("Ligado: " + ligado);
        System.out.println("Aprovado: " + aprovado);

        // Operações com boolean
        boolean resultado1 = ligado && aprovado; // AND lógico
        boolean resultado2 = ligado || aprovado; // OR lógico
        boolean resultado3 = !ligado;            // NOT lógico

        System.out.println("\nOperações lógicas:");
        System.out.println("ligado && aprovado: " + resultado1);
        System.out.println("ligado || aprovado: " + resultado2);
        System.out.println("!ligado: " + resultado3);

        // Comparações simples retornam boolean
        int a = 10;
        int b = 5;
        boolean comparacao = a > b; // true
        System.out.println("\nComparação a > b: " + comparacao);
    }
}
