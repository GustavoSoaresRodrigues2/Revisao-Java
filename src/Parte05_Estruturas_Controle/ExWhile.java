package Parte05_Estruturas_Controle;

/**
 * =========================================================
 * 📘 TEMA: Estrutura de repetição - while
 * =========================================================
 *
 * 🔎 1) O que é?
 * Loop que repete um bloco de código enquanto uma condição booleana for verdadeira.
 *
 * 🧠 2) Observações importantes:
 * - Avalia a condição antes de executar
 * - Pode não executar nenhuma vez se a condição for falsa
 * - Variável de controle deve ser inicializada e atualizada dentro do loop
 *
 * =========================================================
 */
public class ExWhile {

    public static void main(String[] args) {

        // ======================
        // 1. WHILE clássico
        // ======================
        int i = 0;
        System.out.println("WHILE:");
        while(i < 5) {
            System.out.println("i = " + i);
            i++; // atualização da variável de controle
        }

        // ======================
        // 2. Observações / erros comuns
        // ======================
        // ❌ Loop infinito se esquecer de atualizar a variável de controle
        // while(true) { ... }
        //
        // ✅ Boas práticas:
        // - Inicialize a variável de controle antes do loop
        // - Atualize dentro do loop para evitar loops infinitos
    }
}