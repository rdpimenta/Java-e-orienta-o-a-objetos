public class GuardadorDeReferencias {
    private final Object[] referencias;
    private int posicaoLivre = 0;

    public GuardadorDeReferencias() {
        this.referencias = new Conta[10];
    }

    public void adiciona(Conta conta) {
        this.referencias[posicaoLivre] = conta;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return referencias[pos];
    }
}
