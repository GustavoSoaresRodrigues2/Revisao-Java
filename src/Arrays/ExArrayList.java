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
        // 3. ArrayList só armazena objetos, então tipos primitivos devem usar suas
        // classes wrapper (Integer, Double, Boolean, etc.)

        // Exemplo 1: Criando um ArrayList de Strings e adicionando elementos
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana"); // adiciona elementos
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Anderson");
        nomes.add("Matheus");

        // Exemplo 2: Removendo elementos
        nomes.remove(0); // remove "Ana"
        System.out.println("\nApós remoção do índice 0:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo 3: Acessando um elemento
        System.out.println("\nAcessando elemento com índice 0: " + nomes.get(0));

        // Exemplo 4: Alterando um elemento
        nomes.set(1, "Beatriz"); // substitui "Carlos" por "Beatriz"
        System.out.println("\nApós alteração:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo 5: Verificando tamanho e existência de um elemento
        System.out.println("\nTamanho do ArrayList: " + nomes.size());
        System.out.println("Contém 'Carlos'? " + nomes.contains("Carlos"));

        // Exibindo os elementos do ArrayList
        System.out.println("\nElementos do ArrayList:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice " + i + ": " + nomes.get(i));
        }

        // Exemplo com tipo primitivo int usando a classe wrapper Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando valores
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Exibindo elementos
        System.out.println("Elementos da lista:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Índice " + i + ": " + numeros.get(i));
        }

        // Alterando valor
        numeros.set(1, 50); // altera o valor do índice 1
        System.out.println("\nApós alteração:");
        System.out.println(numeros);

        // Removendo valor
        numeros.remove(0);
        System.out.println("\nApós remover o índice 0:");
        System.out.println(numeros);

        // Verificando tamanho
        System.out.println("\nTamanho da lista: " + numeros.size());

        // Verificando se contém um valor
        System.out.println("Contém 30? " + numeros.contains(30));

    }
}