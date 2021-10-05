package br.com.zup.Inmobiliaria;

public class Morador extends Pessoa{
    //Atributos
    private int idade;
    private String parentesco;

    //Contructores
       public Morador(String nome, String cpf, int idade, String parentesco) {
        super(nome, cpf);
        this.idade = idade;
        this.parentesco = parentesco;
    }

    //Getters & Setters

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
        moradoresEx.append(super.toString());
        moradoresEx.append("\n Idade: \t"+idade);
        moradoresEx.append("\n Parentesco: \t" +parentesco);

        return moradoresEx.toString();
    }
}
