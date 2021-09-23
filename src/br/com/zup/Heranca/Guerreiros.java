package br.com.zup.Heranca;

public class Guerreiros extends Heroi{
    double poderDeAtaque;

    public Guerreiros(String nome, double vida, double poderDeAtaque) {
        super(nome, vida);
        this.poderDeAtaque = poderDeAtaque;
    }

    public double getPoderDeAtaque() {
        return poderDeAtaque;
    }

    public void setPoderDeAtaque(double poderDeAtaque) {
        this.poderDeAtaque = poderDeAtaque;
    }
}
