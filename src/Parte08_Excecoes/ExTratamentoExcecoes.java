package Parte08_Excecoes;

/**
 * =========================================================
 * 📘 TEMA: Exceções em Java
 * =========================================================
 *
 * 🔎 1) O que são exceções?
 * - Situações inesperadas que ocorrem durante a execução do programa
 * - Podem interromper o fluxo normal se não forem tratadas
 *
 * 🔎 2) Tipos:
 * - Checked (verificadas em tempo de compilação) → precisam de try/catch ou throws
 * - Unchecked (não verificadas em tempo de compilação) → RuntimeException
 *
 * 🔎 3) Principais palavras-chave:
 * - try: bloco que pode lançar exceção
 * - catch: captura e trata a exceção
 * - finally: bloco que sempre executa (opcional)
 * - throw: lança uma exceção
 * - throws: declara que o método pode lançar exceção
 *
 * 🧠 Observações:
 * - Boas práticas: tratar exceções específicas, não usar catch genérico Exception sem motivo
 *
 * =========================================================
 */
public class ExTratamentoExcecoes {

    public static void main(String[] args) {

        // ======================
        // 1. Try-catch básico
        // ======================
        try {
            int resultado = 10 / 0; // ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        }

        // ======================
        // 2. Try-catch com múltiplos catches
        // ======================
        try {
            String texto = null;
            System.out.println(texto.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético!");
        } catch (NullPointerException e) {
            System.out.println("Erro: objeto nulo!");
        }

        // ======================
        // 3. Bloco finally
        // ======================
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inválido!");
        } finally {
            System.out.println("Bloco finally sempre executa");
        }

        // ======================
        // 4. Throw e throws
        // ======================
        try {
            metodoQueLancaExcecao(5);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // ======================
        // 5. Observações / boas práticas
        // ======================
        // ❌ Não ignore exceções (catch vazio)
        // ❌ Evite usar Exception genérica sem necessidade
        // ✅ Sempre trate exceções específicas
        // ✅ Use finally para liberar recursos (arquivos, conexões, etc.)
    }

    // ======================
    // Método que lança exceção
    // ======================
    static void metodoQueLancaExcecao(int valor) throws Exception {
        if (valor > 0) {
            throw new Exception("Valor não pode ser maior que zero!");
        }
    }
}