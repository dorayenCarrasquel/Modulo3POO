package br.com.zup.LevelUp;

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
    public String toString(){
        return this.nome+", Extensão Territorial: "+this.extensaoTerritorial+", Tamanho da População: "+this.tamanhopopulacao;
    }
}
