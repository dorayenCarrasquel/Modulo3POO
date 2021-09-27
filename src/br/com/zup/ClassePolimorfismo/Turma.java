package br.com.zup.ClassePolimorfismo;

public class Turma extends Professor{
    private String serie;
    private String curso;
    private int quantidadeDeAlunos;

    public Turma(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String dsciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas, String serie, String curso, int quantidadeDeAlunos1) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario, nivelDeGraduacao, dsciplinaMinistrada, quantidadeDeAlunos, quantidadeDeTurmas);
        this.serie = serie;
        this.curso = curso;
        this.quantidadeDeAlunos = quantidadeDeAlunos1;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    @Override
    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}

