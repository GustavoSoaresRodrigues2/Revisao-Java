package Parte05_Estruturas_Controle;

/**
 * =========================================================
 * 📘 TEMA: Estrutura de decisão - switch / case / default
 * =========================================================
 *
 * 🔎 1) O que é?
 * Estrutura de decisão que permite escolher entre múltiplos caminhos
 * com base no valor de uma expressão.
 *
 * 🧠 2) Observações importantes:
 * - Funciona com: int, byte, short, char, String, enum
 * - Cada case termina com break (ou arrow ->) para evitar "fall-through"
 * - Sempre ter default para casos não previstos
 *
 * =========================================================
 */
public class ExSwitch {

    public static void main(String[] args) {

        int dia = 3;

        // ======================
        // 1. SWITCH clássico com break
        // ======================
        System.out.println("Switch clássico:");
        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
        }

        // ======================
        // 2. SWITCH moderno (Java 14+) com arrow ->
        // ======================
        System.out.println("\nSwitch moderno:");
        switch(dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            default -> System.out.println("Outro dia");
        }

        // ======================
        // 3. Observações / erros comuns
        // ======================
        // ❌ Esquecer break no switch clássico causa execução de múltiplos cases
        // ❌ Usar tipos incompatíveis (ex: boolean) não compila
        // ✅ Boas práticas:
        // - Usar default sempre
        // - Prefira switch moderno com -> para clareza
    }
}