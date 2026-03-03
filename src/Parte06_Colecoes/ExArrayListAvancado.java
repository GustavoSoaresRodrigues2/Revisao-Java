package Parte06_Colecoes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * =========================================================
 * 📘 TEMA: ArrayList Avançado em Java
 * =========================================================
 *
 * 🔎 1) O que é?
 * - Operações avançadas permitem manipular listas de forma eficiente
 * - Inclui filtragem, subList, iterações combinadas com cálculos
 *
 * 🧠 2) Observações importantes:
 * - removeIf aceita uma condição (lambda ou Predicate)
 * - subList cria uma "visão" da lista, alterações refletem na lista original
 * - Iterações com Iterator permitem remover elementos durante iteração
 *
 * =========================================================
 */
public class ExArrayListAvancado {

    public static void main(String[] args) {

        // ======================
        // 1. Filtragem com removeIf
        // ======================
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(30);
        numeros.add(15);
        numeros.add(40);

        System.out.println("Original: " + numeros);

        // Remover todos os números menores que 20
        numeros.removeIf(n -> n < 20);
        System.out.println("Após removeIf(n < 20): " + numeros);

        // ======================
        // 2. SubList
        // ======================
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Daniel");
        nomes.add("Elisa");

        System.out.println("\nLista original: " + nomes);

        // Pegar sublista dos índices 1 até 3 (não inclui índice 3)
        ArrayList<String> subNomes = new ArrayList<>(nomes.subList(1, 3));
        System.out.println("SubList (1,3): " + subNomes);

        // Alterações na subList não alteram a cópia (porque criamos new ArrayList)
        subNomes.set(0, "Breno");
        System.out.println("SubList alterada: " + subNomes);
        System.out.println("Lista original após alterar subList: " + nomes);

        // ======================
        // 3. Iteração com cálculo (ex: soma)
        // ======================
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.5);

        double soma = 0.0;
        for(Double nota : notas) { // unboxing
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println("\nNotas: " + notas);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        // ======================
        // 4. Iteração com Iterator e remoção segura
        // ======================
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Laranja");

        System.out.println("\nFrutas originais: " + frutas);

        Iterator<String> it = frutas.iterator();
        while(it.hasNext()) {
            String fruta = it.next();
            if(fruta.startsWith("B")) { // remover frutas que começam com "B"
                it.remove(); // seguro durante iteração
            }
        }
        System.out.println("Após remover frutas com 'B': " + frutas);

        // ======================
        // 5. Observações / boas práticas
        // ======================
        // ✅ removeIf é útil para filtragem rápida com lambda
        // ✅ subList cria uma visão da lista original, cuidado ao modificar
        // ✅ Iterator permite remoção segura durante iteração
        // ✅ Para cálculos, for-each funciona bem com autoboxing/unboxing
        // ❌ Remover elementos dentro do foreach clássico sem Iterator -> ConcurrentModificationException
    }
}