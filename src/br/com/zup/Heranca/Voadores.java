package br.com.zup.Heranca;

public class Voadores extends Inimigos{
    private double danoTire;

    public Voadores(double danoTire) {
        this.danoTire = danoTire;
    }

    public Voadores(String nome, double vida, double danoTire) {
        super(nome, vida);
        this.danoTire = danoTire;
    }

    public double getDanoTire() {
        return danoTire;
    }

    public void setDanoTire(double danoTire) {
        this.danoTire = danoTire;
    }

    public double aplicarDano(){
        return danoTire;
    }


}
