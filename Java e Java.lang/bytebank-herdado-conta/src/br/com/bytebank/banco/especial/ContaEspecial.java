package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.model.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        // TODO auto-generated method stub

    }
}
