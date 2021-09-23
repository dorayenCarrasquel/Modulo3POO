package br.com.zup.Heranca;

public class Magos extends Heroi{
    double poderMagico;

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }
}
