package Arrays;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        // ==========================
        // ARRAYLIST
        // ==========================
        // ArrayList é uma coleção que armazena vários elementos do mesmo tipo
        // Diferente de arrays, seu tamanho é dinâmico e pode crescer ou diminuir

        // Observações importantes:
        // 1. ArrayList é parte do pacote java.util.
        // 2. O tamanho é dinâmico, diferente de arrays.
        // 3. Para acessar elementos, usamos get(), para modificar set(), para adicionar add(), e para remover remove().
        // 4. ArrayList só armazena objetos, então tipos primitivos devem usar suas classes wrapper (Integer, Double, Boolean, etc.)
        
        // Exemplo 1: Criando um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");     // adiciona elementos
        nomes.add("Bruno");
        nomes.add("Carlos");

        // Exibindo os elementos
        System.out.println("Elementos do ArrayList:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo 2: Alterando um elemento
        nomes.set(1, "Beatriz"); // substitui "Bruno" por "Beatriz"
        System.out.println("\nApós alteração:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo 3: Removendo elementos
        nomes.remove(0); // remove "Ana"
        System.out.println("\nApós remoção do índice 0:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo 4: Verificando tamanho e existência de um elemento
        System.out.println("\nTamanho do ArrayList: " + nomes.size());
        System.out.println("Contém 'Carlos'? " + nomes.contains("Carlos"));
    }
}
