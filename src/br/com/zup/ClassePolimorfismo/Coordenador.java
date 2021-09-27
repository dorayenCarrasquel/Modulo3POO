package br.com.zup.ClassePolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    //Atributos
    private List<Professor>professoresSupervicionados = new ArrayList<>();

    //Contructores
    public Coordenador(){

    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    //Getters & Setters

    public String getProfessoresSupervicionados() {
        return professoresSupervicionados;
    }

    public void setProfessoresSupervicionados(String professoresSupervicionados) {
        this.professoresSupervicionados = professoresSupervicionados;
    }

    public void adicionarProfessor(Professor professorAdic){
        professoresSupervicionados.add(professorAdic);
        System.out.println("Adiscionado com sucesso");
    }

    @Override
    public double aumentoDeSalario(double aumentoSalario){
        aumentoSalario = getSalario() * 0.05;
        double salarioNovo = getSalario() + aumentoSalario;
        return salarioNovo;
    }
}
