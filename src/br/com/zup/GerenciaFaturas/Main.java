package br.com.zup.GerenciaFaturas;

public class Main {
    public static void main(String[] args) {
       try {
           Consumidor cliente = Sistema.cadastrarConsumidor();
           System.out.println(cliente);
       }catch (Exception erro) {
           System.out.println(erro.getMessage());
       }
    }
}
