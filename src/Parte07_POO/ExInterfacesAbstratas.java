package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Interfaces e Classes Abstratas em Java
 * =========================================================
 *
 * 🔎 1) Classe abstrata:
 * - Classe que não pode ser instanciada diretamente
 * - Pode ter métodos abstratos (sem corpo) e concretos (com implementação)
 * - Serve como base para subclasses
 *
 * 🔎 2) Interface:
 * - Só declara métodos (todos abstratos até Java 7; Java 8+ pode ter default e static)
 * - Uma classe pode implementar várias interfaces (polimorfismo múltiplo)
 *
 * 🧠 Observações:
 * - Abstrata = “pode ter código e atributos”  
 * - Interface = “contrato que a classe precisa cumprir”
 *
 * =========================================================
 */

// ======================
// Classe abstrata
// ======================
abstract class Forma {
    String cor;

    // Construtor
    Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato (obrigatório sobrescrever na subclasse)
    abstract double calcularArea();

    // Método concreto
    void mostrarCor() {
        System.out.println("Cor: " + cor);
    }
}

// ======================
// Subclasse concreta
// ======================
class Circulo extends Forma {
    double raio;

    Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// ======================
// Interface
// ======================
interface Dimensao3D {
    double calcularVolume();
}

// ======================
// Classe que implementa interface
// ======================
class Cubo implements Dimensao3D {
    double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}

// ======================
// Classe principal
// ======================
public class ExInterfacesAbstratas {

    public static void main(String[] args) {

        // ======================
        // 1. Classe abstrata
        // ======================
        Circulo c = new Circulo("Vermelho", 2.5);
        c.mostrarCor();
        System.out.println("Área do círculo: " + c.calcularArea());

        // ======================
        // 2. Interface
        // ======================
        Cubo cubo = new Cubo(3);
        System.out.println("\nVolume do cubo: " + cubo.calcularVolume());

        // ======================
        // 3. Observações / erros comuns
        // ======================
        // ❌ Não é possível instanciar Forma diretamente: Forma f = new Forma("Azul");
        // ❌ Ao implementar interface, todos os métodos abstratos devem ser sobrescritos
        // ✅ Boas práticas:
        // - Use classes abstratas quando quiser código reutilizável + métodos obrigatórios
        // - Use interfaces para definir contratos e permitir polimorfismo múltiplo
    }
}