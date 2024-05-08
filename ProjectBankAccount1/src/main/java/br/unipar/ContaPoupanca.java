package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria {

    private final Double TAXA = 5d;

    public boolean saque(Double valor) {

        if ((saldo - TAXA) >= valor) {
            saldo -= valor;
            saldo -= TAXA;
            return true;
        }
        return false;
    }
}
