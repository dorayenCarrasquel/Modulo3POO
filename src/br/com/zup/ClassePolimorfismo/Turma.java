package br.com.zup.ClassePolimorfismo;

public class Turma {
    private String serie;
    private String curso;
    private int quantidadeDeAlunos;


    public Turma(){

    }

    public Turma(String serie, String curso, int quantidadeDeAlunos) {
        this.serie = serie;
        this.curso = curso;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
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

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeAlunos(int adicionarAlunos) {
        adicionarAlunos = getQuantidadeDeAlunos()+adicionarAlunos;
        return quantidadeDeAlunos;
    }


}

