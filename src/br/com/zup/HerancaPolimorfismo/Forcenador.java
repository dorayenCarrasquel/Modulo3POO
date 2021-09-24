package br.com.zup.HerancaPolimorfismo;

public class Forcenador extends Pessoa {
    //Atributos

    private double valorCredito;
    private double valorDivida;

    //Metodo Construtor

    public Forcenador(){

    }
    public Forcenador(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Getter - Setter

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //métodos
    public double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }
}

