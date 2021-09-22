package br.com.zup.lista001M3.LevelUp;

public class Pais {
    String nome;
    double extensaoTerritorial;
    double tamanhopopulacao;

    public Pais(String nome, double extensaoTerritorial, double tamanhopopulacao) {
        this.nome = nome;
        this.extensaoTerritorial = extensaoTerritorial;
        this.tamanhopopulacao = tamanhopopulacao;
    }

    public String getNome(){
        return this.nome;
    }
    public double getExtensaoTerritorial(){
        return this.extensaoTerritorial;
    }
    public double getTamanhopopulacao(){
        return this.tamanhopopulacao;
    }

    @Override
    //https://pt.stackoverflow.com/questions/22913/qual-a-finalidade-da-override
    public String toString(){
        return this.nome+", Extensão Territorial: "+this.extensaoTerritorial+", Tamanho da População: "+this.tamanhopopulacao;
    }
}
