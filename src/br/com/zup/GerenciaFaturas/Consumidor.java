package br.com.zup.GerenciaFaturas;

public class Consumidor {
    private String nome;
    private String email;
    private Pessoa tipoPessoa;

    public Consumidor() {

    }

    public Consumidor(String nome, String email, Pessoa tipoPessoa) {
        this.nome = nome;
        this.email = email;
        this.tipoPessoa = tipoPessoa;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(Pessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n   Dados do Cliente: ");
        retorno.append("\n------------------------------");
        retorno.append("\nNome: \t\t" + nome);
        retorno.append("\nE-mail: \t" + email);
        retorno.append("\nConsumidor: " + tipoPessoa);
        retorno.append("\n------------------------------");
        return retorno.toString();
    }
}
