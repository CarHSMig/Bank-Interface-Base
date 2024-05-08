package br.unipar;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contacorrente = new ContaCorrente();

        contacorrente.depositar(1000d);

        System.out.println("Saldo é : " +
            contacorrente.obterSaldo());
        System.out.println("Número da conta é" +
                contacorrente.retornarNumeroConta());
    }
}