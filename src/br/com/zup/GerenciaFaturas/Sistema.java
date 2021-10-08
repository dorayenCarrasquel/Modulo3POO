package br.com.zup.GerenciaFaturas;

import java.util.Scanner;

public class Sistema {
    public static Scanner receverDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Consumidor cadastrarConsumidor()throws Exception{
        System.out.println("***  Dados do Cliente ***");
        String nome = receverDados("\nDigite o nome do Consumidor: ").nextLine();
        String email = receverDados("Digite o e-mail do consumidor: ").nextLine();
        String tipoPessoa = receverDados("Digite o tipo do Consumidor: ").nextLine();

        return ServiceConsumidor.cadastrarConsumidor(nome, email, tipoPessoa);
    }

    public static Fatura cadastrarFatura() throws Exception{
        System.out.println("*** Dados da Fatura ***");
        String email = receverDados("Digite o email do cliente:").nextLine();
        double valor = receverDados("Digite o valor a pagar: ").nextDouble();
        String dataVencimento = receverDados("Digite a data de Vencimento: ").nextLine();
        return ServiceFatura.cadastrarFatura(email,dataVencimento,valor);
    }
}
