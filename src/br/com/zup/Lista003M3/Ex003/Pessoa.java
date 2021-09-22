package br.com.zup.Lista003M3.Ex003;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

    public Pessoa(String nome, int dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    //Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome
    }

    //Data de nascimiento (considerando só o ano)
    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
//Altura
    public double getAltura(){
        return altura;
    }
    public void  setAltura(double altura){
        this.altura = altura;
    }
    //manipulando data
    public void anonascimento(){


    }

    //Calcular Idade
    public void calcularIdade(){

    }
//Imprimir
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("Altura: "+altura);
        if ()
    }

}
