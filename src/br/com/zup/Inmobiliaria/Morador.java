package br.com.zup.Inmobiliaria;

public class Morador extends Pessoa {
    //Atributos
    private int idade;
    private double renda;

    //Contructores
    public Morador(String nome, String cpf, int idade, Double renda) {
        super(nome, cpf);
        this.idade = idade;
        this.renda = renda;
    }

    //Getters & Setters

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        StringBuilder moradoresEx = new StringBuilder();
        moradoresEx.append(super.toString());
        moradoresEx.append("\n Idade: \t" + idade);
        moradoresEx.append("\n Renda: \t" + renda);

        return moradoresEx.toString();
    }
}
