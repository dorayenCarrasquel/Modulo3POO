package br.com.zup.Lista002M3.Ex004;

public class CartaoCredito {
    String nomeCliente;
    double limite;
    double saldoFatura;


    public CartaoCredito(String nomeCliente, double limite, double saldoFatura){
        this.nomeCliente=nomeCliente;
        this.limite=limite;
        this.saldoFatura=saldoFatura;
    }
    public void aumentolimite(double solicitandoLimite){
        limite = limite + solicitandoLimite;
    }
    public void diminuilimite(double diminuindoLimite){
        limite = limite-diminuindoLimite;
    }
    public void realizaCompra(double valorCompra){
        double compra = limite - valorCompra;
        if (compra > limite & compra <= 0){
            System.out.println("\n=====================");
            System.out.println("Compra Rechazada");
            System.out.println("=====================");
        }
        else {
            limite= limite - valorCompra;
            saldoFatura=valorCompra;
        }
    }
    public void ImprimeFatura(){
        System.out.println("\n************************");
        System.out.println("*** Factura de Compra ***");
        System.out.println("************************");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Limite Atual: " + limite);
        System.out.println("Saldo da Fatura: " + saldoFatura);
    }
}
