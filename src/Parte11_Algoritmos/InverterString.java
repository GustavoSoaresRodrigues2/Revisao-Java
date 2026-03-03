package Parte11_Algoritmos;

public class InverterString {
    public static void main(String[] args) {
        /**
         * 📝 Enunciado
         * Crie um método que receba uma String e retorne essa mesma string invertida.
         * 
         * 📌 Regras:
         * Não pode usar StringBuilder.reverse()
         * Não pode usar métodos prontos de inversão
         * 
         * Deve funcionar para:
         * String normal
         * String vazia
         * String com 1 caractere
         * 
         * Complexidade esperada: O(n)
         */

        String nome = "Gustavo";
        String nomeInverso = "";

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(nome.length() - 1 - i);
            nomeInverso += letra;
        }

        System.out.println(nomeInverso);
    }
}
