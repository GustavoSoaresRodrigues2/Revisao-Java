package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Construtores em Java
 * =========================================================
 *
 * 🔎 1) O que é um construtor?
 * - Método especial da classe usado para **inicializar objetos**
 * - Nome do construtor é igual ao nome da classe
 * - Não possui tipo de retorno (nem void)
 *
 * 🔎 2) Tipos de construtor:
 * - Padrão (sem parâmetros)
 * - Com parâmetros (para inicializar atributos com valores específicos)
 *
 * 🧠 Observações:
 * - Se não declararmos nenhum construtor, Java cria um **construtor padrão automaticamente**
 * - Podemos ter **sobrecarga de construtores** (vários construtores com diferentes parâmetros)
 *
 * =========================================================
 */
public class ExConstrutor {

    // ======================
    // Atributos
    // ======================
    String nome;
    int idade;
    double altura;

    // ======================
    // 1. Construtor padrão
    // ======================
    ExConstrutor() {
        System.out.println("Construtor padrão chamado!");
    }

    // ======================
    // 2. Construtor com parâmetros
    // ======================
    ExConstrutor(String nome, int idade, double altura) {
        this.nome = nome; // 'this.nome' é o atributo, 'nome' é o parâmetro
        this.idade = idade;
        this.altura = altura;
    }

    // ======================
    // Método para apresentar
    // ======================
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }

    public static void main(String[] args) {

        // ======================
        // Criando objeto com construtor padrão
        // ======================
        ExConstrutor pessoa1 = new ExConstrutor();
        pessoa1.nome = "Ana";
        pessoa1.idade = 25;
        pessoa1.altura = 1.65;
        pessoa1.apresentar();

        // ======================
        // Criando objeto com construtor com parâmetros
        // ======================
        ExConstrutor pessoa2 = new ExConstrutor("Bruno", 30, 1.80);
        pessoa2.apresentar();

        // ======================
        // Observações / erros comuns
        // ======================
        // ❌ Construtor não retorna valor, não usar 'void' ou outro tipo
        // ❌ 'this' referencia o atributo do objeto atual 'this' referencia o atributo do objeto atual
        // ✅ Boas práticas:
        // - Use construtores para evitar atribuições manuais repetitivas
        // - Sobrecarga de construtores permite inicializar objetos de formas diferentes
    }
}