package Parte05_Estruturas_Controle;

/**
 * =========================================================
 * 📘 TEMA: Controle de fluxo - break / continue / return
 * =========================================================
 *
 * 🔎 1) O que é?
 * - break: sai imediatamente do loop ou switch
 * - continue: pula a iteração atual do loop e vai para a próxima
 * - return: sai do método imediatamente, opcionalmente retornando um valor
 *
 * 🧠 2) Observações importantes:
 * - break pode ser usado em loops ou switch
 * - continue não sai do loop, apenas ignora a iteração atual
 * - return termina o método imediatamente
 *
 * =========================================================
 */
public class ExBreakContinueReturn {

    public static void main(String[] args) {

        // ======================
        // 1. BREAK em for
        // ======================
        System.out.println("BREAK em for:");
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("i = " + i + " -> break!");
                break; // sai do loop quando i == 5
            }
            System.out.println("i = " + i);
        }

        // ======================
        // 2. CONTINUE em for
        // ======================
        System.out.println("\nCONTINUE em for:");
        for(int i = 0; i < 5; i++) {
            if(i == 2) {
                System.out.println("i = " + i + " -> continue!");
                continue; // pula para próxima iteração
            }
            System.out.println("i = " + i);
        }

        // ======================
        // 3. RETURN em método
        // ======================
        System.out.println("\nRETURN em método:");
        System.out.println("Chamando método testeReturn(3): " + testeReturn(3));
        System.out.println("Chamando método testeReturn(6): " + testeReturn(6));

        // ======================
        // 4. Observações / erros comuns
        // ======================
        // ❌ Usar break fora de loop ou switch -> erro de compilação
        // ❌ Usar continue fora de loop -> erro de compilação
        // ❌ Esquecer return em método que exige retorno -> erro de compilação
        // ✅ Boas práticas:
        // - Use break para sair de loops quando necessário
        // - Use continue para pular iterações específicas
        // - Use return para encerrar métodos ou funções claramente
    }

    // Exemplo de método com return
    public static String testeReturn(int valor) {
        if(valor < 5) {
            return "Valor menor que 5"; // retorna imediatamente
        } else {
            return "Valor 5 ou maior";   // retorna imediatamente
        }
    }
}