package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria {
    public boolean saque(Double valor) {

        double verificar = saldo;
        verificar += 5;
        if (verificar >= valor) {
            saldo -= valor;
            saldo -= 5;
            return true;
        }


        return false;
    }
}
