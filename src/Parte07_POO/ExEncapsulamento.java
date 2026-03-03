package Parte07_POO;

/**
 * =========================================================
 * 📘 TEMA: Encapsulamento e Modificadores de Acesso em Java
 * =========================================================
 *
 * 🔎 1) Encapsulamento:
 * - Proteger atributos de uma classe
 * - Tornar atributos privados e fornecer getters e setters
 *
 * 🔎 2) Modificadores de acesso:
 * - public: acessível de qualquer classe
 * - private: acessível somente dentro da própria classe
 * - protected: acessível em subclasses e no mesmo pacote
 * - default (sem modificador): acessível apenas dentro do mesmo pacote
 *
 * =========================================================
 */
public class ExEncapsulamento {

    // ======================
    // 1. Atributos com diferentes modificadores
    // ======================
    public String nomePublico;       // qualquer classe pode acessar
    private int idadePrivada;        // só esta classe pode acessar
    protected double alturaProtegida; // subclasses e mesmo pacote podem acessar
    String enderecoDefault;          // acesso somente dentro do mesmo pacote

    // ======================
    // 2. Getters e Setters para atributo privado
    // ======================
    public int getIdadePrivada() {
        return idadePrivada;
    }

    public void setIdadePrivada(int idadePrivada) {
        if (idadePrivada > 0) {
            this.idadePrivada = idadePrivada;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    // ======================
    // 3. Método para apresentação
    // ======================
    void apresentar() {
        System.out.println("Nome público: " + nomePublico);
        System.out.println("Idade privada: " + idadePrivada);
        System.out.println("Altura protegida: " + alturaProtegida);
        System.out.println("Endereço default: " + enderecoDefault);
    }

    public static void main(String[] args) {

        // ======================
        // 4. Criando objeto
        // ======================
        ExEncapsulamento pessoa = new ExEncapsulamento();

        // ======================
        // 5. Atribuindo valores aos atributos
        // ======================
        pessoa.nomePublico = "Ana";             // public, pode acessar diretamente
        pessoa.setIdadePrivada(25);             // private, usar setter
        pessoa.alturaProtegida = 1.65;          // protected, mesmo pacote ou subclasses podem acessar
        pessoa.enderecoDefault = "Rua A, 123";  // default, acesso dentro do pacote

        // ======================
        // 6. Chamando método para exibir
        // ======================
        pessoa.apresentar();

        // ======================
        // 7. Observações / erros comuns
        // ======================
        // ❌ Não é possível acessar atributo privado diretamente de fora da classe
        // ❌ protected só acessível fora do pacote se for via herança
        // ✅ Boas práticas:
        // - Use private para atributos importantes + getters/setters
        // - Use public para métodos que devem ser acessíveis globalmente
        // - Use protected com cuidado em heranças
        // - Default é útil para organizar pacotes internos
    }
}