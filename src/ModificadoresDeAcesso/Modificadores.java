package ModificadoresDeAcesso;

public class Modificadores {
    // ==========================
    // MODIFICADORES DE ACESSO
    // ==========================
    // Os modificadores de acesso definem onde uma classe, atributo ou método pode ser acessado.

    // Existem 4 tipos principais:
    // 1. public
    // 2. private
    // 3. protected
    // 4. default (sem modificador)

    // Exemplo 1: Atributos com diferentes modificadores

    public String nome = "João"; // Pode ser acessado de qualquer lugar
    private int idade = 25; // Só pode ser acessado dentro da própria classe
    protected String cidade = "São Paulo"; // Pode ser acessado no mesmo pacote ou por herança
    String pais = "Brasil"; // default - acessível apenas dentro do mesmo pacote

    // Exemplo 2: Método público
    public void mostrarNome() {
        System.out.println("Nome: " + nome);
    }

    // Exemplo 3: Método privado
    private void mostrarIdade() {
        System.out.println("Idade: " + idade);
    }

    // Exemplo 4: Método protegido
    protected void mostrarCidade() {
        System.out.println("Cidade: " + cidade);
    }

    // Exemplo 5: Método default (sem modificador)
    void mostrarPais() {
        System.out.println("País: " + pais);
    }

    // Método principal
    public static void main(String[] args) {

        Modificadores pessoa = new Modificadores();

        // Acessando membros public
        pessoa.mostrarNome();

        // Acessando método private (funciona porque estamos dentro da mesma classe)
        pessoa.mostrarIdade();

        // Acessando método protected
        pessoa.mostrarCidade();

        // Acessando método default
        pessoa.mostrarPais();
    }
}
