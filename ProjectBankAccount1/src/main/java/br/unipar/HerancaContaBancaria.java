package br.unipar;

import java.util.UUID;

abstract class HerancaContaBancaria implements interfaceBankAccount {
    protected Double saldo;
    private String numeroConta;

    public HerancaContaBancaria() {
        saldo = 0.0;
        numeroConta = UUID.randomUUID().toString();
    }

    @Override
    public String retornarNumeroConta() {
        return numeroConta;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public Double obterSaldo() {
        return saldo;
    }
}
