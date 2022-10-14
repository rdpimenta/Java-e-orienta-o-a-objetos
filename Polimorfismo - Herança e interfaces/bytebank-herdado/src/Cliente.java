public class Cliente implements Autenticavel {
    private final AutenticacaoUtil autenticacaoUtil;

    public Cliente() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }
}
