package Parte06_Colecoes;

import java.util.ArrayList;

/**
 * =========================================================
 * 📘 TEMA: ArrayList com Tipos Primitivos (Wrappers)
 * =========================================================
 *
 * 🔎 1) O que é?
 * - ArrayList só aceita objetos (tipos de referência)
 * - Para tipos primitivos, usamos wrappers:
 *   int -> Integer, double -> Double, boolean -> Boolean, etc.
 * - Java faz autoboxing e unboxing automaticamente
 *
 * 🧠 2) Observações importantes:
 * - Autoboxing: primitivo -> wrapper automaticamente
 * - Unboxing: wrapper -> primitivo automaticamente
 * - Permite operações matemáticas mesmo dentro do ArrayList
 *
 * =========================================================
 */
public class ExArrayListWrappers {

    public static void main(String[] args) {

        // ======================
        // 1. ArrayList de Integer (int)
        // ======================
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);   // autoboxing int -> Integer
        numeros.add(20);
        numeros.add(30);
        System.out.println("ArrayList<Integer>: " + numeros);

        // ======================
        // 2. Operações matemáticas
        // ======================
        int soma = 0;
        for(Integer num : numeros) { // unboxing: Integer -> int
            soma += num; 
        }
        System.out.println("Soma dos elementos: " + soma);

        // ======================
        // 3. Alterando elementos
        // ======================
        numeros.set(1, 25); // altera 20 para 25
        System.out.println("Após alteração: " + numeros);

        // ======================
        // 4. ArrayList de Double (double)
        // ======================
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(8.5);  // autoboxing
        notas.add(9.3);
        notas.add(7.8);

        double media = 0.0;
        for(Double nota : notas) { // unboxing
            media += nota;
        }
        media /= notas.size();
        System.out.println("Média das notas: " + media);

        // ======================
        // 5. ArrayList de Boolean (boolean)
        // ======================
        ArrayList<Boolean> respostas = new ArrayList<>();
        respostas.add(true);
        respostas.add(false);
        respostas.add(true);
        System.out.println("ArrayList<Boolean>: " + respostas);

        // ======================
        // 6. ArrayList de Character (char)
        // ======================
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        System.out.println("ArrayList<Character>: " + letras);

        // ======================
        // 7. ArrayList de Long (long)
        // ======================
        ArrayList<Long> grandes = new ArrayList<>();
        grandes.add(1_000_000_000L);
        grandes.add(5_000_000_000L);
        System.out.println("ArrayList<Long>: " + grandes);

        // ======================
        // 8. ArrayList de Float (float)
        // ======================
        ArrayList<Float> decimais = new ArrayList<>();
        decimais.add(1.5f);
        decimais.add(2.3f);
        System.out.println("ArrayList<Float>: " + decimais);

        // ======================
        // 9. ArrayList de Byte (byte)
        // ======================
        ArrayList<Byte> pequenos = new ArrayList<>();
        pequenos.add((byte)10); // cast necessário
        pequenos.add((byte)20);
        System.out.println("ArrayList<Byte>: " + pequenos);

        // ======================
        // 10. ArrayList de Short (short)
        // ======================
        ArrayList<Short> numerosShort = new ArrayList<>();
        numerosShort.add((short)100); // cast necessário
        numerosShort.add((short)200);
        System.out.println("ArrayList<Short>: " + numerosShort);

        // ======================
        // 11. Observações / erros comuns
        // ======================
        // ❌ Não é possível usar tipos primitivos diretamente: ArrayList<int> -> ERRO
        // ✅ Sempre usar wrapper correto (Integer, Double, Boolean, etc.)
        // ✅ Autoboxing/unboxing facilita operações matemáticas
        // ✅ For-each funciona para leitura, for clássico ou Iterator para remover elementos
    }
}