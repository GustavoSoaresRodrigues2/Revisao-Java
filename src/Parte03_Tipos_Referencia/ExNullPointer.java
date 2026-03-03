package Parte03_Tipos_Referencia;

/**
 * =========================================================
 * 📘 TEMA: Null em tipos de referência
 * =========================================================
 *
 * 🔎 1) O que é null?
 * - Representa a ausência de referência a um objeto.
 * - Variáveis de tipos de referência podem ser null.
 * - Diferente de zero ou valor vazio.
 *
 * 🧠 2) Como funciona?
 * - Qualquer tentativa de acessar métodos ou campos de um objeto null
 *   lança NullPointerException.
 *
 * ⚠ 3) Pontos de atenção:
 * - Tipos primitivos **não podem** ser null
 * - Sempre inicialize suas referências antes de usar
 * - Comparações podem ser feitas com '==' para verificar null
 *
 * =========================================================
 */
public class ExNullPointer {

    public static void main(String[] args) {

        // 🔹 Variável de referência sem objeto
        String texto = null;

        System.out.println("texto: " + texto); // ok, apenas imprime null

        // 🔹 Comparação com null
        if (texto == null) {
            System.out.println("texto está nulo!");
        }

        // 🔹 Tentativa de acessar método em null
        // System.out.println(texto.length()); // ❌ NullPointerException

        // 🔹 Exemplo com objeto inicializado
        texto = "Java";
        System.out.println("\nApós inicialização:");
        System.out.println("texto: " + texto);
        System.out.println("tamanho: " + texto.length());

        // 🔹 Arrays e null
        String[] nomes = null;
        // nomes.length; // ❌ NullPointerException
        nomes = new String[3]; // inicializando
        System.out.println("\nArray inicializado com tamanho: " + nomes.length);

        // 🔹 Wrapper e null
        Integer num = null;
        // int primitivo = num; // ❌ NullPointerException durante unboxing
        num = 50; // agora seguro
        int primitivo = num;
        System.out.println("\nWrapper após inicialização: " + primitivo);

        // 🔹 Boas práticas
        // - Sempre verifique se referência não é null antes de usar
        // - Evite unboxing de objetos que podem ser null
        // - Inicialize arrays e wrappers antes de operações
    }
}