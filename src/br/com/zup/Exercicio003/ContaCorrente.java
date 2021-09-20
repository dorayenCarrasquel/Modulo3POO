package br.com.zup.Exercicio003;

public class ContaCorrente {
    String numeroDaConta;
    String nomeDoCorrentista;
    double saldo;

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0;
    }
}
