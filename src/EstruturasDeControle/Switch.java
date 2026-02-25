package EstruturasDeControle;

public class Switch {
    public static void main(String[] args) {
        // ==========================
        // ESTRUTURA SWITCH
        // ==========================
        // O switch é usado quando queremos comparar uma variável com **vários valores possíveis** e executar blocos diferentes para cada caso
        // É uma alternativa mais organizada para múltiplos "if-else if".

        // Observações importantes:
        // 1. O break encerra a execução do case; sem ele, o código "cai" nos próximos cases (fall-through).
        // 2. O default é opcional, mas serve para tratar valores que não correspondem a nenhum case.
        // 3. O switch funciona com: byte, short, int, char, String e enums.
        // 4. É mais legível que vários "if-else if" quando há muitos valores possíveis.

        // Exemplo 1: Dia da semana
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Exemplo 2: Avaliação de nota
        char nota = 'B';
        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Nota inválida");
        }
    }
}
