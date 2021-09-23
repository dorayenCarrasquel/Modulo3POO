package br.com.zup.Heranca;

public class Heroi {
    //Atributos
    String nome;
    double vida;
    //Metodo Construtor
    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    // Getters - Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
