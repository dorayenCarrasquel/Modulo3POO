package br.com.zup.Inmobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Inmovel {
    private String Endereco;
    private double valorAluguel;
    private int quartos;
    private boolean iptu;
    private String tipoDeVivienda;
    private int quantidadMoradores;
    private Responsavel corretor;
    private List<Morador>moradores = new ArrayList<>();


    public Inmovel(){

    }

    public Inmovel(String endereco, double valorAluguel, int quartos, boolean iptu, String tipoDeVivienda, int quantidadMoradores) {
        this.Endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.quartos = quartos;
        this.iptu = iptu;
        this.tipoDeVivienda = tipoDeVivienda;
        this.quantidadMoradores = quantidadMoradores;

    }

    public Responsavel getCorretor() {
        return corretor;
    }

    public void setCorretor(Responsavel corretor) {
        this.corretor = corretor;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public boolean isIptu() {
        return iptu;
    }

    public void setIptu(boolean iptu) {
        this.iptu = iptu;
    }

    public String getTipoDeVivienda() {
        return tipoDeVivienda;
    }

    public void setTipoDeVivienda(String tipoDeVivienda) {
        this.tipoDeVivienda = tipoDeVivienda;
    }

    public int getQuantidadMoradores() {
        return quantidadMoradores;
    }

    public void setQuantidadMoradores(int quantidadMoradores) {
        this.quantidadMoradores = quantidadMoradores;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void adicionarMorador(Morador nuevoMorador){
        moradores.add(nuevoMorador);
        quantidadMoradores = moradores.size();
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nEndereço: \t"+Endereco);
        retorno.append("\nValor do Aluguel: \t"+valorAluguel);
        retorno.append("\nEspaços do Aluguel: \t"+quartos);
        retorno.append("\nPaga IPTU: \t"+iptu);
        retorno.append("\nTipo de Inmueble: \t"+tipoDeVivienda);
        retorno.append("\nQuantidad de moradores: \t" +quantidadMoradores);
        retorno.append("\nMoradores: \t"+moradores);
        return retorno.toString();
    }
}
