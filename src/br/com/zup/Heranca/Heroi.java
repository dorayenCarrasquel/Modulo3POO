package br.com.zup.Heranca;

public class Heroi {
    //Atributos
    private String nome;
    private double vida;

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

    //Métodos Comunes
    public void trocarNome(String nome) {
        this.nome = nome;
    }

    public void receberDano(double dano) {
        double morrendo = this.getVida() - dano;
        this.setVida(morrendo);
    }

    public double exibirVida() {
        return vida;
    }

}
