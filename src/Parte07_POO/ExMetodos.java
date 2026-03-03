package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Métodos e Sobrecarga em Java
 * =========================================================
 *
 * 🔎 1) O que é um método?
 * - Conjunto de instruções que realizam uma ação
 * - Pode receber parâmetros e retornar valores
 * - Divide o código em blocos reutilizáveis
 *
 * 🔎 2) Tipos de métodos:
 * - Instância: pertencem a um objeto (precisa de objeto para chamar)
 * - Estático (static): pertencem à classe (podem ser chamados sem criar objeto)
 *
 * 🔎 3) Sobrecarga de métodos:
 * - Ter múltiplos métodos com **mesmo nome**, mas **parâmetros diferentes**
 * - Permite diferentes formas de chamar a mesma ação
 *
 * =========================================================
 */
public class ExMetodos {

    // ======================
    // 1. Método de instância (pertence ao objeto)
    // ======================
    void apresentar(String nome, int idade) {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    // ======================
    // 2. Sobrecarga do método apresentar
    // ======================
    void apresentar(String nome, int idade, double altura) {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }

    // ======================
    // 3. Método estático (pertence à classe)
    // ======================
    static void mensagemBoasVindas() {
        System.out.println("Bem-vindo à aula de POO!");
    }

    // ======================
    // 4. Método com retorno
    // ======================
    int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // ======================
        // 5. Chamando método estático
        // ======================
        ExMetodos.mensagemBoasVindas(); // não precisa criar objeto

        // ======================
        // 6. Criando objeto para chamar métodos de instância
        // ======================
        ExMetodos obj = new ExMetodos();

        // Chamando método de instância
        obj.apresentar("Ana", 25);

        // Chamando método sobrecarregado
        obj.apresentar("Bruno", 30, 1.80);

        // Chamando método com retorno
        int resultado = obj.soma(10, 15);
        System.out.println("Resultado da soma: " + resultado);

        // ======================
        // 7. Observações / erros comuns
        // ======================
        // ❌ Não é possível chamar métodos de instância sem criar objeto
        // ❌ Sobrecarga exige parâmetros diferentes, não só tipo de retorno
        // ❌ Métodos estáticos não podem acessar diretamente atributos de instância
        // ✅ Boas práticas:
        // - Use métodos para dividir tarefas
        // - Sobrecarga deixa o código mais legível
        // - Métodos estáticos para utilidades que não dependem de objeto
    }
}