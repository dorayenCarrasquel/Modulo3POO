package br.com.zup.GerenciaFaturas;

public class Fatura {
    private Consumidor cliente;
    private double valorAPagar;
    private String dataDeVencimento;

    public Fatura() {

    }

    public Fatura(Consumidor cliente, double valorAPagar, String dataDeVencimento) {
        this.cliente = cliente;
        this.valorAPagar = valorAPagar;
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getCliente() {
        return cliente;
    }

    public void setCliente(Consumidor cliente) {
        this.cliente = cliente;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Cliente: "+cliente);
        retorno.append("Data de Vencimento: "+dataDeVencimento);
        retorno.append("Valor A Pagar: R$ "+valorAPagar);
        return retorno.toString();
    }
}
