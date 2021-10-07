package br.com.zup.GerenciaFaturas;

public class Main {
    public static void main(String[] args) {
       Consumidor cliente = Sistema.cadastrarConsumidor();
        System.out.println(cliente);
    }
}
