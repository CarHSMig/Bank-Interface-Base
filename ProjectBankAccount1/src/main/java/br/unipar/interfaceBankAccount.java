package br.unipar;

public interface interfaceBankAccount {
    Double obterSaldo();

    void depositar(Double valor);

    String retornarNumeroConta();

    boolean saque(Double valor);
}
