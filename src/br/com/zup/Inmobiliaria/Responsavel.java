package br.com.zup.Inmobiliaria;

public class Responsavel extends Pessoa{
     // private Inmovel corretor;
    private String ctps;


    public Responsavel(String nome, String cpf, String ctps) {
        super(nome, cpf);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("Carteira de Trabalho do Corretor: "+ctps);
        return retorno.toString();
    }
}
