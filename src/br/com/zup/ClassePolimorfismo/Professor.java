package br.com.zup.ClassePolimorfismo;

public class Professor extends Funcionario {
    //Atributos
    private String nivelDeGraduacao;
    private String dsciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;


    //Construtores
    public Professor() {

    }

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String dsciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.dsciplinaMinistrada = dsciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    //Getter & Setters

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDsciplinaMinistrada() {
        return dsciplinaMinistrada;
    }

    public void setDsciplinaMinistrada(String dsciplinaMinistrada) {
        this.dsciplinaMinistrada = dsciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

//001 Aumento de salario


}
