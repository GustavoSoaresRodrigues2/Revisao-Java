package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Herança em Java
 * =========================================================
 *
 * 🔎 1) O que é herança?
 * - Permite que uma classe **herde atributos e métodos de outra**
 * - A classe que herda é chamada de **subclasse**
 * - A classe que é herdada é chamada de **superclasse**
 *
 * 🔎 2) Palavra-chave:
 * - extends: indica que uma classe herda de outra
 * - super: acessa **métodos ou construtores** da superclasse
 *
 * 🧠 Observações:
 * - Herança promove **reuso de código** e **polimorfismo**
 * - Subclasse pode **sobrescrever métodos** da superclasse
 *
 * =========================================================
 */

// ======================
// Superclasse (classe base)
// ======================
class Animal {
    String nome;

    // Construtor da superclasse
    Animal(String nome) {
        this.nome = nome;
        System.out.println("Construtor da superclasse Animal chamado!");
    }

    void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// ======================
// Subclasse (classe derivada)
// ======================
class Cachorro extends Animal {

    String raca;

    // Construtor da subclasse
    Cachorro(String nome, String raca) {
        super(nome);       // chama construtor da superclasse
        this.raca = raca;  // inicializa atributo da subclasse
        System.out.println("Construtor da subclasse Cachorro chamado!");
    }

    // Método sobrescrito
    @Override
    void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    // Chamando método da superclasse
    void somDoAnimal() {
        super.emitirSom(); // chama emitirSom() da classe Animal
    }
}

public class ExHeranca {

    public static void main(String[] args) {

        // ======================
        // 1. Criando objetos com construtor usando super()
        // ======================
        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");

        // ======================
        // 2. Chamando métodos
        // ======================
        cachorro.emitirSom();    // O cachorro late: Au Au!
        cachorro.somDoAnimal();  // chama método da superclasse: O animal faz um som genérico.

        // ======================
        // 3. Acesso a atributos herdados
        // ======================
        System.out.println("Nome do cachorro: " + cachorro.nome);
        System.out.println("Raça do cachorro: " + cachorro.raca);

        // ======================
        // 4. Observações / erros comuns
        // ======================
        // ❌ Construtor da superclasse deve ser chamado antes de acessar atributos da subclasse
        // ❌ super() sempre deve ser a primeira linha do construtor da subclasse
        // ✅ Boas práticas:
        // - Use super() para inicializar atributos herdados
        // - Ajuda a evitar repetição de código
    }
}