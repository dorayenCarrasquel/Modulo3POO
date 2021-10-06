package br.com.zup.Inmobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {
    private List<Inmovel>inmovelsLista = new ArrayList<>();

    public List<Inmovel> getInmovelsLista() {
        return inmovelsLista;
    }

    public void cadastrarInmovelInmovi (Inmovel inmovel){
        inmovelsLista.add(inmovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Inmoveis Listados: "+inmovelsLista);
        return retorno.toString();
    }
}


