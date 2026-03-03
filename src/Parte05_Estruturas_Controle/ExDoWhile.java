package Parte05_Estruturas_Controle;

/**
 * =========================================================
 * 📘 TEMA: Estrutura de repetição - do-while
 * =========================================================
 *
 * 🔎 1) O que é?
 * Loop que repete um bloco de código **pelo menos uma vez**, 
 * avaliando a condição ao final de cada execução.
 *
 * 🧠 2) Observações importantes:
 * - Sempre executa pelo menos uma vez
 * - Variável de controle deve ser inicializada antes e atualizada dentro do loop
 *
 * =========================================================
 */
public class ExDoWhile {

    public static void main(String[] args) {

        // ======================
        // 1. DO-WHILE clássico
        // ======================
        int j = 0;
        System.out.println("DO-WHILE:");
        do {
            System.out.println("j = " + j);
            j++; // atualização da variável de controle
        } while(j < 5);

        // ======================
        // 2. Observações / erros comuns
        // ======================
        // ❌ Loop infinito se esquecer de atualizar a variável de controle
        // do { ... } while(true);
        //
        // ✅ Boas práticas:
        // - Inicialize a variável de controle antes do loop
        // - Atualize dentro do loop
        // - Use do-while quando for necessário executar pelo menos uma vez
    }
}