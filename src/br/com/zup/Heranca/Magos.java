package br.com.zup.Heranca;

public class Magos extends Heroi{
    private double poderMagico;

    public Magos(){

    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }
//getter - setter
    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }


    public double aplicarMagia(){
        return poderMagico;

    }

}
