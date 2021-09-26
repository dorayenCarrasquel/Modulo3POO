package br.com.zup.ClassePolimorfismo;

public class Coordenadores extends Funcionarios{
    //Atributos
    private String professoresSupervicionados;

    //Contructores
    public Coordenadores(){

    }

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String professoresSupervicionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervicionados = professoresSupervicionados;
    }

    //Getters & Setters

    public String getProfessoresSupervicionados() {
        return professoresSupervicionados;
    }

    public void setProfessoresSupervicionados(String professoresSupervicionados) {
        this.professoresSupervicionados = professoresSupervicionados;
    }
}
