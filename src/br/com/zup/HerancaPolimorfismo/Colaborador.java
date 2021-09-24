package br.com.zup.HerancaPolimorfismo;

public class Colaborador extends Pessoa {
    //Atributos
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //Constructor

    public Colaborador(){

    }

    public Colaborador(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    //Getter - Setter

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //
    public double calcularSalario(){
    double salarioLiquido = salarioBase - imposto;
    return salarioLiquido;
    }

}

