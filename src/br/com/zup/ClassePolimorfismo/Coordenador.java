package br.com.zup.ClassePolimorfismo;

public class Coordenador extends Funcionario {
    //Atributos
    private String professoresSupervicionados;

    //Contructores
    public Coordenador(){

    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String professoresSupervicionados) {
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

    @Override
    public double aumentoDeSalario(double aumentoSalario){
        aumentoSalario = getSalario() * 0.05;
        double salarioNovo = getSalario() + aumentoSalario;
        return salarioNovo;
    }
}
