package Parte11_Algoritmos;

public class Palindromo {
    public static void main(String[] args) {
        
        /**
         * 📝 Enunciado
         * Crie um método que receba uma String e retorne true se ela for um palíndromo e false caso contrário.
         * 
         * 📌 Regras
         * ❌ Não pode usar reverse()
         * ✅ Deve ignorar:
         *      Letras maiúsculas/minúsculas
         *      Espaços
         *      Complexidade esperada: O(n)
         * 
         * Não usar estrutura pronta que já resolva tudo automaticamente
         */

        String nome = "Ananana";
        String nomeInverso = "";
        boolean validador = false;

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(nome.length() - 1 - i);
            nomeInverso += letra;
        }

        String nomeMini = nome.toLowerCase();
        String nomeInversoMini =  nomeInverso.toLowerCase();

        System.out.println(nomeMini + " / " + nomeInversoMini);

        if (nomeMini.equals(nomeInversoMini)) {
            validador = true;
            System.out.println(nome + " é um Palíndromo, então é: " + validador);
        } else {
            System.out.println(nome + " não é um Palíndromo, então é: " + validador);
        }

        // Usandos ponteiros

        String outroNome = "A man a plan a canal Panama";

        boolean ehPalindromo = verificarPalindromo(outroNome);

        if (ehPalindromo) {
            System.out.println("\"" + outroNome + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + outroNome + "\" não é um palíndromo.");
        }

    }

    // ======================
    // Método para verificar palíndromo
    // ======================
    public static boolean verificarPalindromo(String str) {

        // Remove espaços e transforma em minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false; // se achar diferença, não é palíndromo
            }
            inicio++;
            fim--;
        }

        return true; // todos os pares conferiram
    }
}
