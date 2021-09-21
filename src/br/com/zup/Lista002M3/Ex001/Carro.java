package br.com.zup.Lista002M3.Ex001;

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valorDoCarro;

    public Carro() {

    }

    public Carro(String nome, double peso, String fabricante, String cor, double valorDoCarro) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valorDoCarro = valorDoCarro;
    }

    public void mostrarDados() {
        System.out.println("===================");
        System.out.println("Dados do Carro:");
        System.out.println("===================");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        System.out.println("Valor do carro: " + valorDoCarro);


    }


    public void darDesconto(double desconto) {
        valorDoCarro = desconto-valorDoCarro;
    }

    public void pintar(String corNovo) {
        cor = corNovo;

    }
}
