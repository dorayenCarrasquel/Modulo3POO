package br.com.zup.Lista002M3.Ex002;

public class Main {
    public static void main(String[] args) {
    ContaBancaria rihana = new ContaBancaria("Rihana Fenty","123456789",750);

    //adicionando Conta Corrente
    rihana.mostrarEstracto();

    //Retirando dinhero
    rihana.saque(300);
    rihana.mostrarEstracto();

    //Deposito
    rihana.deposito(150);
    rihana.mostrarEstracto();

    }
}
