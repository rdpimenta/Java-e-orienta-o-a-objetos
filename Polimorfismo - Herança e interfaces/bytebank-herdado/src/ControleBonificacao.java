public class ControleBonificacao {
    private double soma;

    public double getSoma() {
        return soma;
    }

    public void registra(Funcionario f) {
        double bonificacao = f.getBonificacao();
        this.soma += bonificacao;
    }
}
