package br.com.zup.GerenciaFaturas;

import java.util.ArrayList;
import java.util.List;

public class ServiceConsumidor {
    public static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoPessoa) throws Exception {
        TipoConsumidor pessoavalidado = validarTipoDeConsumidor(tipoPessoa);
        validarEmail(email);
        verificarEmailRepetido(email);
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

    public static Consumidor pegarConsumidor(String email) throws Exception {
        for (Consumidor emailReferencia : consumidores) {
            if (email.equalsIgnoreCase(emailReferencia.getEmail())) {
                return emailReferencia;
            }
        }
        throw new Exception("Email não cadastrado. ");
    }

    public static void verificarEmailRepetido(String email) throws Exception {
        for (Consumidor emailReferencia : consumidores) {
            if (emailReferencia.getEmail().equals(email)) {
                throw new Exception("E-mail repetido");
            }
        }
    }

    public static void validarEmail(String email) throws Exception {
        for (Consumidor emailReferencia : consumidores) {
            if (!email.contains("@")) {
                throw new Exception("O e-mail não é valido");
            }
        }
    }


}
