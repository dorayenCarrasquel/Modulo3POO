package br.com.zup.GerenciaFaturas;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoPessoa) throws Exception{
        TipoConsumidor pessoavalidado =validarTipoDeConsumidor(tipoPessoa);
                Consumidor cliente = new Consumidor(nome, email, pessoavalidado);
        consumidores.add(cliente);
        return cliente;
    }

    public static TipoConsumidor validarTipoDeConsumidor(String tipoDeConsumidor) throws Exception {
        for (TipoConsumidor tipoReferencia : TipoConsumidor.values()) {
            if (tipoDeConsumidor.equalsIgnoreCase(String.valueOf(tipoReferencia))) {
                return tipoReferencia;
            }

        }
        throw new Exception("Tipo de Consumidor não Valido. ");
    }


}
