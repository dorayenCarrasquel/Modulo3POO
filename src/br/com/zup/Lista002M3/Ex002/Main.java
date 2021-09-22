package br.com.zup.Lista002M3.Ex002;

public class Main {
    public static void main(String[] args) {
    ContaBancaria rihana = new ContaBancaria("Rihana Fenty","123456789",750);



    //adicionando Conta Corrente
    rihana.mostrarEstracto();


    //Retirando dinhero
    rihana.saque(300);
    rihana.mostrarEstracto();

    //Trocando nome do Correntista
    rihana.setNome("Rihana Maria Fenty");
    rihana.setNumeroConta("987654321");
        System.out.println("\n==================");
        System.out.println(rihana.getSaldo());
        System.out.println("==================");

    //Deposito
    rihana.deposito(150);
    rihana.mostrarEstracto();

    }
}
