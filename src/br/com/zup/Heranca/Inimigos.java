package br.com.zup.Heranca;

public class Inimigos {
    //Atributos
    private String nome;
    private double vida;

    //constructor

    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //getter - setter

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

    //Métodos Comunes
    public void trocarNome(String nome) {
        this.nome = nome;
    }


}
