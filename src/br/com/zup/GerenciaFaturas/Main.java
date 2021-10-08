package br.com.zup.GerenciaFaturas;

public class Main {
    public static void main(String[] args) {
       try {
           Consumidor cliente = Sistema.cadastrarConsumidor();
           Consumidor cte = Sistema.cadastrarConsumidor();
           System.out.println(ServiceConsumidor.consumidores);
           Fatura fatura= Sistema.cadastrarFatura();
           Fatura ft= Sistema.cadastrarFatura();
           System.out.println(ServiceFatura.faturas);
       }catch (Exception erro) {
           System.out.println(erro.getMessage());
       }
    }
}
