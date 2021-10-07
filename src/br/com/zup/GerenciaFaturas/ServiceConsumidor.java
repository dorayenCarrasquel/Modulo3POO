package br.com.zup.GerenciaFaturas;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoPessoa) {
        Consumidor cliente = new Consumidor(nome, email, tipoPessoa);
        consumidores.add(cliente);
        return cliente;
    }


}
