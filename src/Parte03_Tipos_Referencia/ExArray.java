package Parte03_Tipos_Referencia;

/**
 * =========================================================
 * 📘 TEMA: Tipo de referência Array
 * =========================================================
 *
 * 🔎 1) O que é?
 * Array é um objeto que armazena múltiplos elementos do mesmo tipo.
 * Pode ser de tipos primitivos ou de referência.
 *
 * 🧠 2) Como funciona?
 * - Arrays são objetos, mesmo quando armazenam primitivos
 * - Variável de array guarda referência ao objeto
 * - Acessa elementos por índice (começa em 0)
 *
 * 📏 3) Características:
 * - Tipo de referência
 * - Valor padrão dos elementos:
 *    * int, byte, short, long: 0
 *    * float, double: 0.0
 *    * char: '\u0000'
 *    * boolean: false
 *    * objetos (ex.: String): null
 * - Tamanho fixo após criação (`array.length`)
 *
 * ⚠ 4) Pontos de atenção:
 * - Índices fora do intervalo causam `ArrayIndexOutOfBoundsException`
 * - Arrays são mutáveis (elementos podem ser alterados)
 *
 * =========================================================
 */
public class ExArray {

    public static void main(String[] args) {

        // 🔹 Criando arrays de primitivos
        int[] numeros = new int[5]; // inicializados com 0
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println("Array de int:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // 🔹 Criando array de Strings (tipo referência)
        String[] nomes = {"Ana", "Bruno", "Carla"};
        System.out.println("\nArray de String:");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // 🔹 Alterando elementos
        nomes[1] = "Beatriz";
        System.out.println("\nApós alteração:");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // 🔹 Tamanho do array
        System.out.println("\nTamanho do array numeros: " + numeros.length);
        System.out.println("Tamanho do array nomes: " + nomes.length);

        // 🔹 Arrays são objetos (referência)
        int[] copiaNumeros = numeros;
        copiaNumeros[0] = 999;
        System.out.println("\nApós alterar copiaNumeros[0] = 999:");
        System.out.println("numeros[0] = " + numeros[0]); // mostra 999
        // ⚠ mesmo array, mesmo objeto, referência compartilhada

        // 🔹 Erro comum: índice fora do limite
        // numeros[10] = 50; // ❌ ArrayIndexOutOfBoundsException

        // 🔹 Dicas de boas práticas
        // - Prefira foreach para leitura, for com índice para escrita
        // - Arrays de objetos podem conter nulls
    }
}