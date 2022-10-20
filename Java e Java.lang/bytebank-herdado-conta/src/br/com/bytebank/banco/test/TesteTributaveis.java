package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.CalculadorImposto;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(cc);
        calculadorImposto.registra(seguro);

        System.out.println(calculadorImposto.getTotalImposto());
    }
}
