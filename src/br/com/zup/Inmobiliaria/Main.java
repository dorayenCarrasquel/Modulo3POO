package br.com.zup.Inmobiliaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Inmovel aptoC001 = new Inmovel("Rua Rio Amazonas 46",750,2,true,"kitnet",3);

        System.out.println(aptoC001);
        System.out.println("=======================");
        System.out.print("digite o nome do morador: ");
        String nome= ler.nextLine();
        System.out.print("Digite seu parentesco:");
        String parentesco = ler.nextLine();
        System.out.print("Digite o CPF do Morador:" );
        String cpf = ler.nextLine();
        System.out.print("Digite a idade do morador: ");
        int idade = ler.nextInt();


        System.out.println("=======================");
        Morador aptoC001Mora = new Morador(nome,cpf,idade,parentesco);

        System.out.println(aptoC001Mora);
        aptoC001.adicionarMorador(aptoC001Mora);
        System.out.println(aptoC001);

    }
}
