package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Polimorfismo em Java
 * =========================================================
 *
 * 🔎 1) Polimorfismo:
 * - "Muitas formas": mesmo tipo pode se comportar de maneiras diferentes
 * - Permite usar **uma referência de superclasse** para objetos de subclasses diferentes
 *
 * 🔎 2) Tipos:
 * - Compile-time (sobrecarga de métodos)
 * - Runtime (sobrescrita de métodos)
 *
 * =========================================================
 */

// ======================
// Superclasse
// ======================
class Animal {
    void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// ======================
// Subclasses
// ======================
class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// ======================
// Classe principal
// ======================
public class ExPolimorfismo {

    // ======================
    // 1. Polimorfismo em compile-time (sobrecarga)
    // ======================
    int soma(int a, int b) {
        return a + b;
    }

    double soma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        ExPolimorfismo obj = new ExPolimorfismo();

        // ----------------------
        // Compile-time (sobrecarga)
        // ----------------------
        System.out.println("Compile-time (sobrecarga):");
        System.out.println("Soma int: " + obj.soma(2, 3));       // chama soma(int, int)
        System.out.println("Soma double: " + obj.soma(2.5, 3.5)); // chama soma(double, double)

        // ======================
        // 2. Polimorfismo em runtime (sobrescrita)
        // ======================
        Animal a1 = new Cachorro(); // referência Animal, objeto Cachorro
        Animal a2 = new Gato();     // referência Animal, objeto Gato

        System.out.println("\nRuntime (sobrescrita):");
        a1.emitirSom(); // O cachorro late: Au Au!
        a2.emitirSom(); // O gato mia: Miau!

        // ======================
        // 3. Array com polimorfismo
        // ======================
        Animal[] animais = { new Cachorro(), new Gato(), new Animal() };
        System.out.println("\nIterando sobre array de animais:");
        for (Animal a : animais) {
            a.emitirSom(); // cada objeto responde de acordo com sua classe real
        }

        // ======================
        // 4. Observações / erros comuns
        // ======================
        // ❌ Polimorfismo não se aplica a atributos, apenas métodos
        // ❌ Sobrecarga depende de parâmetros, não apenas do tipo de retorno
        // ❌ Sobrescrita depende do método da subclasse em runtime
        // ✅ Boas práticas:
        // - Use sobrecarga para métodos com mesmo propósito, mas diferentes parâmetros
        // - Use sobrescrita para comportamento dinâmico em hierarquia de classes
        // - Referência da superclasse pode armazenar qualquer subclasse
    }
}