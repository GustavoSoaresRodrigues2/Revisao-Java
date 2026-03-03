package Parte06_Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * =========================================================
 * 📘 TEMA: Comparable vs Comparator em Java
 * =========================================================
 *
 * 🔎 1) Comparable
 * - Define a ORDEM NATURAL da classe
 * - Implementado dentro da própria classe
 * - Obrigatório sobrescrever o método compareTo()
 *
 * 🔎 2) Comparator
 * - Define uma ORDEM EXTERNA / CUSTOMIZADA
 * - Criado fora da classe
 * - Permite múltiplos critérios de ordenação
 *
 * 🧠 3) Diferença principal:
 * - Comparable → regra fixa (padrão da classe)
 * - Comparator → regras flexíveis
 *
 * =========================================================
 */
public class ExComparableVsComparator {

    public static void main(String[] args) {

        // ======================
        // 1. Criando lista de produtos
        // ======================
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00, "Eletrônicos"));
        produtos.add(new Produto("Mouse", 80.00, "Eletrônicos"));
        produtos.add(new Produto("Cadeira", 900.00, "Móveis"));
        produtos.add(new Produto("Mesa", 1200.00, "Móveis"));
        produtos.add(new Produto("Teclado", 150.00, "Eletrônicos"));

        System.out.println("Lista original:");
        produtos.forEach(System.out::println);

        // ======================
        // 2. Ordenação usando Comparable (ordem natural)
        // ======================
        // Ordem natural definida por PREÇO
        Collections.sort(produtos);

        System.out.println("\nOrdenado por preço (ordem natural - Comparable):");
        produtos.forEach(System.out::println);

        // ======================
        // 3. Ordenação usando Comparator (por nome)
        // ======================
        produtos.sort(Comparator.comparing(Produto::getNome));

        System.out.println("\nOrdenado por nome (Comparator):");
        produtos.forEach(System.out::println);

        // ======================
        // 4. Ordenação por categoria e depois preço
        // ======================
        produtos.sort(
                Comparator.comparing(Produto::getCategoria)
                          .thenComparing(Produto::getPreco)
        );

        System.out.println("\nOrdenado por categoria e depois preço:");
        produtos.forEach(System.out::println);

        // ======================
        // 5. Ordenação por preço decrescente
        // ======================
        produtos.sort(
                Comparator.comparing(Produto::getPreco).reversed()
        );

        System.out.println("\nOrdenado por preço decrescente:");
        produtos.forEach(System.out::println);

        // ======================
        // 6. Observações importantes
        // ======================
        /*
         * ✅ Comparable define a ordem padrão da classe
         * ✅ Comparator permite criar várias regras diferentes
         * ✅ compareTo deve retornar:
         *      < 0  → menor
         *      = 0  → igual
         *      > 0  → maior
         *
         * ⚠ Boa prática:
         * Evitar: return this.preco - outro.preco;
         * Preferir: Double.compare(this.preco, outro.preco);
         */
    }
}

/**
 * =========================================================
 * 📦 Classe Produto
 * =========================================================
 *
 * Implementa Comparable para definir ordem natural por PREÇO
 */
class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    // Ordem natural → por preço (crescente)
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}