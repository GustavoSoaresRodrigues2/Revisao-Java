package Parte06_Colecoes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * =========================================================
 * 📘 TEMA: ArrayList em Java
 * =========================================================
 *
 * 🔎 1) O que é?
 * - Um ArrayList é uma lista dinâmica de objetos, parte da Collections Framework
 * - Armazena elementos de tipos de referência (não primitivos diretamente)
 * - Permite crescimento automático e acesso por índice
 *
 * 🧠 2) Observações importantes:
 * - Para tipos primitivos, use wrapper classes: Integer, Double, Boolean etc.
 * - Índices começam em 0
 * - Métodos comuns: add, remove, get, set, size, clear, contains, indexOf
 *
 * =========================================================
 */
public class ExArrayList {

    public static void main(String[] args) {

        // ======================
        // 1. Criação de ArrayList
        // ======================
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("ArrayList criado: " + nomes);

        // ======================
        // 2. Adicionar elementos
        // ======================
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        System.out.println("Após adicionar elementos: " + nomes);

        // ======================
        // 3. Acessar elementos
        // ======================
        System.out.println("Primeiro elemento: " + nomes.get(0));
        System.out.println("Segundo elemento: " + nomes.get(1));

        // ======================
        // 4. Alterar elemento
        // ======================
        nomes.set(1, "Bruna"); // substitui "Bruno" por "Bruna"
        System.out.println("Após alteração: " + nomes);

        // ======================
        // 5. Remover elementos
        // ======================
        nomes.remove(0); // remove elemento pelo índice
        System.out.println("Após remover índice 0: " + nomes);

        nomes.remove("Carla"); // remove elemento pelo valor
        System.out.println("Após remover 'Carla': " + nomes);

        // ======================
        // 6. Iteração com for clássico
        // ======================
        nomes.add("Daniel");
        nomes.add("Elisa");
        System.out.println("\nIterando com for clássico:");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println("nomes[" + i + "] = " + nomes.get(i));
        }

        // ======================
        // 7. Iteração com foreach (enhanced for)
        // ======================
        System.out.println("\nIterando com foreach:");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // ======================
        // 8. Iteração com Iterator
        // ======================
        System.out.println("\nIterando com Iterator:");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ======================
        // 9. Outros métodos úteis
        // ======================
        System.out.println("\nMétodos úteis:");
        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println("Contém 'Elisa'? " + nomes.contains("Elisa"));
        System.out.println("Índice de 'Daniel': " + nomes.indexOf("Daniel"));

        // ======================
        // 10. Limpar lista
        // ======================
        nomes.clear();
        System.out.println("Após clear(): " + nomes);

        // ======================
        // 11. Observações / erros comuns
        // ======================
        // ❌ Acessar índice fora do tamanho -> IndexOutOfBoundsException
        // ❌ Remover elementos dentro do foreach -> ConcurrentModificationException
        // ✅ Boas práticas:
        // - Usar foreach para leitura
        // - Usar for clássico ou Iterator para remover elementos durante a iteração
        // - Sempre verificar size() antes de acessar índices
    }
}