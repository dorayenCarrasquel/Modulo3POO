package br.com.zup.Lista002M3.Ex004;

public class Main {
    public static void main(String[] args) {
    CartaoCredito visa = new CartaoCredito("Shakira", 900,0,2000);
    visa.ImprimeFatura();
    visa.realizaCompra(1850);
    visa.ImprimeFatura();
    }
}
