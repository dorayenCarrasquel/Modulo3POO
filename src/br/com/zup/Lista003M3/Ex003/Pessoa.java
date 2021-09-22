package br.com.zup.Lista003M3.Ex003;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Data dataNascimento;
    private double altura;
    private int idade;


    public Pessoa(String nome, Data dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    //Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Data de nascimiento (considerando só o ano)
    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Calcular Idade
    public void calcularIdade(int anoAtual) {
    int idade = anoAtual - dataNascimento.getAno();
    this.idade = idade;
    }

    //Imprimir
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento.getDia()+"/"+dataNascimento.getMes()+"/"+dataNascimento.getAno());
        System.out.println("Altura: " + altura);
        System.out.println("Idade: "+idade);

    }

}
