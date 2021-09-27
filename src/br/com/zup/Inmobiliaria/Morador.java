package br.com.zup.Inmobiliaria;

public class Morador {
    private String nomeMorador;
    private String cpf;
    private int idade;
    private String parentesco;

    public Morador(String nomeMorador, String cpf, int idade, String parentesco) {
        this.nomeMorador = nomeMorador;
        this.cpf = cpf;
        this.idade = idade;
        this.parentesco = parentesco;
    }

    public String getNomeMorador() {
        return nomeMorador;
    }

    public void setNomeMorador(String nomeMorador) {
        this.nomeMorador = nomeMorador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        StringBuilder moradoresEx = new StringBuilder();
        moradoresEx.append("\n Nome: \t"+nomeMorador);

        return moradoresEx.toString();
    }
}
