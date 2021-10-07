package br.com.zup.GerenciaFaturas;

public class Consumidor {
    private String nome;
    private String email;

    public Consumidor() {

    }

    public Consumidor(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n   Dados do Cliente: ");
        retorno.append("\n--------------------------");
        retorno.append("\nNome: \t"+nome);
        retorno.append("\nE-mail: \t"+email);
        retorno.append("\n--------------------------");
        return retorno.toString();
    }
}
