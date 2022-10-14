public class Gerente extends Funcionario {
    private int senha;

    public Gerente() {

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getSalario();
    }
}
