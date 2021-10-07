package br.com.zup.Inmobiliaria;

public abstract class Pessoa {
    private String nome;
    private String cpf;


    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }public Pessoa(String nome) {
        this.nome = nome;


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome: \t"+nome);
        retorno.append("\nCPF: \t"+cpf);
        return retorno.toString();
    }
}
