package br.com.zup.GerenciaFaturas;

import java.util.ArrayList;
import java.util.List;

public class ServiceFatura {
    public static List<Fatura> faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, String dataDeVencimento, double valorAPagar) throws Exception{
        Consumidor clientevalidado = ServiceConsumidor.pegarConsumidor(email);
        Fatura faturagerada = new Fatura(clientevalidado,valorAPagar,dataDeVencimento);
        faturas.add(faturagerada);
        return faturagerada;

    }
}
