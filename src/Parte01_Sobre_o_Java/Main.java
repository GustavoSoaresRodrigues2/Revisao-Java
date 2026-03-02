package Parte01_Sobre_o_Java;
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
/*
* Em Java, todo programa precisa estar dentro de uma classe, pois a linguagem é orientada a objetos. 
* No exemplo clássico, temos a classe Main, que é pública (public) para que a JVM consiga acessá-la e executar o programa. 
* O nome da classe pública deve coincidir exatamente com o nome do arquivo, no caso Main.java.
*
* O ponto de entrada de qualquer aplicação Java é o método main, cuja assinatura deve ser exatamente:
* public static void main(String[] args). 
* Aqui, public indica que o método pode ser acessado externamente pela JVM, static significa que ele pertence à classe em si e não precisa de um objeto para ser chamado, e void indica que o método não retorna nenhum valor. 
* O parâmetro String[] args permite que o programa receba argumentos da linha de comando, sendo um array de strings.
*
* Dentro do main, podemos colocar instruções como System.out.println("Olá, mundo!"). 
* Aqui, System é uma classe padrão do Java que contém o objeto estático out, do tipo PrintStream, que representa a saída padrão do sistema (geralmente o console). 
* O método println imprime o texto passado como argumento e adiciona uma quebra de linha automática. 
* Dessa forma, o fluxo do programa começa na JVM, que carrega o bytecode do arquivo .class, chama o método main e executa as instruções nele contidas.
*
* A sintaxe do Java exige que cada instrução termine com ponto e vírgula (;), e que blocos de código sejam delimitados por chaves { }. 
* O Java também diferencia maiúsculas de minúsculas (case-sensitive), ou seja, Main e main são diferentes. 
*
* O menor programa Java válido consiste em uma classe pública com um método main vazio. 
* Mesmo sem nenhuma instrução dentro do main, ele é compilável e executável, pois a JVM encontra o ponto de entrada correto.
*
* Em resumo, a estrutura de um programa Java reflete a filosofia da linguagem: tudo está organizado em classes, a execução começa no main e a JVM fornece a camada de abstração que garante portabilidade e segurança. 
* Compreender essa base é essencial, pois todos os conceitos subsequentes de Java, como variáveis, métodos, objetos e herança, dependem dessa estrutura fundamental.
*/ 
}}