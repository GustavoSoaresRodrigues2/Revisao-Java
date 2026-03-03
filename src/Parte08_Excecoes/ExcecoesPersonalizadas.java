package Parte08_Excecoes;

/**
 * =========================================================
 * 📘 TEMA: Exceções Personalizadas em Java
 * =========================================================
 *
 * 🔎 1) Por que criar exceções personalizadas?
 * - Para tratar situações específicas do seu programa
 * - Facilita a leitura e manutenção do código
 *
 * 🔎 2) Como criar:
 * - Criar uma classe que estenda Exception (checked) ou RuntimeException (unchecked)
 * - Implementar construtor que chame super(mensagem)
 *
 * =========================================================
 */

// ======================
// Exceção personalizada (checked)
class ValorInvalidoException extends Exception {
    ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}

// ======================
// Exceção personalizada (unchecked)
class OperacaoNaoPermitidaException extends RuntimeException {
    OperacaoNaoPermitidaException(String mensagem) {
        super(mensagem);
    }
}

public class ExcecoesPersonalizadas {

    public static void main(String[] args) {

        // ======================
        // 1. Exceção checked personalizada
        // ======================
        try {
            verificarIdade(15);
        } catch (ValorInvalidoException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // ======================
        // 2. Exceção unchecked personalizada
        // ======================
        try {
            realizarOperacao(false);
        } catch (OperacaoNaoPermitidaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        // ======================
        // 3. Observações / boas práticas
        // ======================
        // ✅ Checked: obriga tratamento ou declaração throws
        // ✅ Unchecked: pode ser tratada opcionalmente
        // ✅ Sempre crie mensagens claras para facilitar debug
        // ✅ Use exceções personalizadas para regras de negócio específicas
    }

    // ======================
    // Método que lança exceção checked
    // ======================
    static void verificarIdade(int idade) throws ValorInvalidoException {
        if (idade < 18) {
            throw new ValorInvalidoException("Idade deve ser maior ou igual a 18!");
        }
        System.out.println("Idade válida: " + idade);
    }

    // ======================
    // Método que lança exceção unchecked
    // ======================
    static void realizarOperacao(boolean permitido) {
        if (!permitido) {
            throw new OperacaoNaoPermitidaException("Operação não permitida!");
        }
        System.out.println("Operação realizada com sucesso!");
    }
}