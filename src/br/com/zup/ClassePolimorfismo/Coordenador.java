package br.com.zup.ClassePolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    //Atributos
    private List<Professor> professoresSupervicionados = new ArrayList<>();

    //Contructores
    public Coordenador() {

    }

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    //Getters & Setters


    public List<Professor> getProfessoresSupervicionados() {
        return professoresSupervicionados;
    }

    public void setProfessoresSupervicionados(List<Professor> professoresSupervicionados) {
        this.professoresSupervicionados = professoresSupervicionados;
    }

    public void adicionarProfessor(Professor professorAdic) {
        professoresSupervicionados.add(professorAdic);
        System.out.println("Adiscionado com sucesso");
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: \t" + getNome());
        retorno.append("\n CPF: \t" + getCpf());
        retorno.append("\n Salario: \t" + getSalario());
        retorno.append("\n Professores Supervicionados: \t" + professoresSupervicionados);
        return retorno.toString();
    }


    @Override
    public double aumentoDeSalario() {
        double aumentoSalario = getSalario() * 0.05;
        double salarioNovo = getSalario() + aumentoSalario;
        return salarioNovo;
    }
}
