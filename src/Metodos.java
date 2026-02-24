public class Metodos {

    // public static void main(String[] args) é o ponto de entrada obrigatório em Java, indicando à Máquina Virtual Java (JVM) onde iniciar a execução de um programa. Ele é público (acessível), estático (chamado sem criar objetos), vazio (sem retorno) e reconhecido pelo nome main.
    // O método main serve como o coordenador principal do código, delegando tarefas para outras partes do programa.
    public static void main(String[] args) {
        Carro novoCarro1 = new Carro("Traker");
        Carro novoCarro2 = new Carro("Sandero");
        Carro novoCarro3 = new Carro("Fit");
        novoCarro1.acelerar();
        novoCarro2.acelerar();
        novoCarro3.acelerar();
        String numPortasCarro1 = novoCarro1.quantPortas(6);
        String numPortasCarro2 = novoCarro1.quantPortas(4);
        String numPortasCarro3 = novoCarro1.quantPortas(2);
        System.out.println(numPortasCarro1);
        System.out.println(numPortasCarro2);
        System.out.println(numPortasCarro3);
    }
}

class Carro {
    // Um atributo em Java é uma variável declarada dentro de uma classe, mas fora de qualquer método, que representa uma característica, propriedade ou o estado de um objeto.
    String modelo;
    int quantPortas;

    // Um construtor em Java é um método especial chamado automaticamente no momento da criação (instanciação) de um objeto, usando a palavra-chave new. Sua função principal é inicializar os atributos do objeto, garantindo que ele comece a ser usado em um estado válido.
    /*
    public Carro(){} // Esse contrutor é criado automaticamente quando se cria uma classe.
    */
    public Carro() {
        System.out.println("Esperando modelo do carro");
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    // Métodos em Java são blocos de código encapsulados dentro de uma classe que executam tarefas específicas, funcionando como funções ou procedimentos reutilizáveis. Eles organizam a lógica, facilitando a manutenção, leitura e depuração do código, podendo receber parâmetros (dados de entrada) e retornar valores após a execução.
    public void acelerar() {
        System.out.println("Acelerando o carro " + modelo);
    }

    public String quantPortas (int quantPortas) {
        this.quantPortas = quantPortas;
        
        if (quantPortas > 4) {
            return "Carro Grande";
        } else if (quantPortas > 2) {
            return "Carro médio";
        } else {
            return "Carro pequeno";
        }
    }
}