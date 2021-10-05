package br.com.zup.Inmobiliaria;

public class Responsavel extends Pessoa{
      private Inmovel corretor;
    //private String ctps;


    public Responsavel(String nome, String cpf, Inmovel corretor) {
        super(nome, cpf);
        this.corretor = corretor;
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
        retorno.append(super.toString());
        retorno.append("Corretor: "+ corretor);
        return retorno.toString();
    }
}
