// Os modificadores de acesso em Java (public, private, protected e default) definem a visibilidade de classes, métodos e atributos, controlando quais partes do código podem acessá-los. Eles aumentam a segurança, ocultam detalhes de implementação e previnem uso incorreto de dados.
// public: O membro é acessível de qualquer lugar (outras classes, outros pacotes).
// private: O membro só pode ser acessado dentro da própria classe onde foi declarado.
// protected: O membro pode ser acessado no mesmo pacote e por subclasses (herança), mesmo que em pacotes diferentes.
// default (sem palavra-chave): O membro é acessível apenas dentro do próprio pacote (também conhecido como package-private).
public class ModificadoresDeAcesso {
    public static void main(String[] args) {
        Modificadores acesso1 = new Modificadores();
        Modificadores acesso2 = new Modificadores();
        Modificadores acesso3 = new Modificadores();
        acesso1.trocar("publico");
        acesso1.mostrar();
        acesso2.trocar("private");
        // acesso2.banir(); // (erro) metodo nao visivel
        acesso3.trocar("protected");
        acesso3.protegido();
    }
}

class Modificadores {
    String tipoAcesso;

    public void trocar(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public String mostrar() {
        return tipoAcesso;
    }

    private String banir() {
        return "Modificador privado";
    }

    protected String protegido() {
        return "Modificador protegido";
    }
}
