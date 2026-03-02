package Metodos;
public class Metodos {

    // ==========================
    // MÉTODOS EM JAVA
    // ==========================
    // Métodos são blocos de código que executam uma tarefa específica.
    // Eles ajudam a organizar, reutilizar e modularizar o código.

    // Estrutura básica de um método:
    // modificador tipoRetorno nomeMetodo(parametros) {
    //     // código
    // }

    // Exemplo 1: Método sem retorno e sem parâmetro
    public void mensagemBoasVindas() {
        System.out.println("Bem-vindo ao estudo de métodos em Java!");
    }

    // Exemplo 2: Método com parâmetro
    public void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // Exemplo 3: Método com retorno (int)
    public int somar(int a, int b) {
        return a + b;
    }

    // Exemplo 4: Método com retorno (double)
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Exemplo 5: Método estático
    // Métodos static pertencem à classe, não ao objeto.
    public static void metodoEstatico() {
        System.out.println("Este é um método estático.");
    }

    public static void main(String[] args) {

        // Criando objeto
        Metodos exemplo = new Metodos();

        // Chamando método sem parâmetro
        exemplo.mensagemBoasVindas();

        // Chamando método com parâmetro
        exemplo.saudacao("Carlos");

        // Chamando método com retorno
        int resultadoSoma = exemplo.somar(10, 5);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Chamando método com retorno double
        double media = exemplo.calcularMedia(8.5, 7.0);
        System.out.println("Média: " + media);

        // Chamando método estático
        metodoEstatico();
    }
}
