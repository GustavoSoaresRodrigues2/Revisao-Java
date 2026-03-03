package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Classes e Objetos
 * =========================================================
 *
 * 🔎 1) O que é uma classe?
 * - Modelo ou "molde" que define atributos e métodos
 * - A classe não ocupa memória até que seja criado um objeto
 *
 * 🔎 2) O que é um objeto?
 * - Instância de uma classe
 * - Cada objeto tem seus próprios valores de atributos
 *
 * 🧠 Observações:
 * - Java é fortemente orientada a objetos, então tudo gira em torno de classes e objetos
 * - A palavra-chave 'new' cria um novo objeto
 *
 * =========================================================
 */
public class ExPessoa {

    // ======================
    // 1. Atributos (características)
    // ======================
    String nome;
    int idade;
    double altura;

    // ======================
    // 2. Método (ação)
    // ======================
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }

    public static void main(String[] args) {

        // ======================
        // 3. Criando objetos
        // ======================
        ExPessoa pessoa1 = new ExPessoa(); // instanciando o objeto
        ExPessoa pessoa2 = new ExPessoa();

        // ======================
        // 4. Atribuindo valores aos atributos
        // ======================
        pessoa1.nome = "Ana";
        pessoa1.idade = 25;
        pessoa1.altura = 1.65;

        pessoa2.nome = "Bruno";
        pessoa2.idade = 30;
        pessoa2.altura = 1.80;

        // ======================
        // 5. Chamando métodos
        // ======================
        pessoa1.apresentar(); // Olá, meu nome é Ana, tenho 25 anos e 1.65m de altura.
        pessoa2.apresentar(); // Olá, meu nome é Bruno, tenho 30 anos e 1.8m de altura.

        // ======================
        // 6. Observações / erros comuns
        // ======================
        // ❌ Não é possível acessar atributos de objeto antes de instanciá-lo
        // ❌ Cada objeto tem seus próprios valores (não compartilha atributos por padrão)
        // ✅ Boas práticas:
        // - Nome de classes inicia com letra maiúscula (CamelCase)
        // - Atributos e métodos seguem padrão lowerCamelCase
    }
}