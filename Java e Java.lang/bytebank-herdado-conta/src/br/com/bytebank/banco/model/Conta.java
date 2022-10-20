package br.com.bytebank.banco.model;

/**
 * Classe que representa a moldura de uma conta
 *
 *@author Roger Pimenta
 *
 */

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto a partir da agencia e numero.
     *
     *@param agencia - agencia
     *@param numero - numero da conta
     */
    public Conta( int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    /**
     *
     *
     *@param valor - valor a sacar
     */
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
