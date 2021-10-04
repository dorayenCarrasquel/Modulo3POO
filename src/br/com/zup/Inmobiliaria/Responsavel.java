package br.com.zup.Inmobiliaria;

public class Responsavel {
    private String nomeResponsavel;
    private String cpf;
    private Inmovel corretor;
    //private String ctps;

    public Responsavel(String nomeResponsavel, String cpf, Inmovel corretor) {
        this.nomeResponsavel = nomeResponsavel;
        this.cpf = cpf;
        this.corretor = corretor;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Inmovel getCorretor() {
        return corretor;
    }

    public void setCorretor(Inmovel corretor) {
        this.corretor = corretor;
    }

    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        retorno.append("Responsavel: "+nomeResponsavel);
        retorno.append("CPF Responsavel: "+cpf);
        return retorno.toString();
    }
}
