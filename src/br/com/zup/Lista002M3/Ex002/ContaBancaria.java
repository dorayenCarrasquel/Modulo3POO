package br.com.zup.Lista002M3.Ex002;

public class ContaBancaria {
    private String nomeCorrentista;
    private String numeroConta;
    private double saldo;

    //Metodo Constructor

    public ContaBancaria() {

    }

    public ContaBancaria(String nomeCorrentista, String numeroConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //Getter

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarEstracto() {
        System.out.println("\n*********************");
        System.out.println(" Extrato Bancario");
        System.out.println("*********************");
        System.out.println("Nome do Titular: " + nomeCorrentista);
        System.out.println("Numero de Conta: " + numeroConta);
        System.out.println("saldo: R$ " + saldo);
    }

    public void saque(double retirar) {
        saldo = saldo - retirar;
    }

    public void deposito(double adicionar) {
        saldo = saldo + adicionar;
    }

    //Setter
    public void setNome(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }


}
