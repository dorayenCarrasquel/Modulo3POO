package br.com.zup.Lista003M3.Ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Entrada de dados

        System.out.println("Digite seu nome: ");
        String nome = leer.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mês: ");
        int mes = leer.nextInt();
        System.out.println("Ano: ");
        int ano = leer.nextInt();
      Data dataDeNascimento = new Data(dia, mes, ano);

        System.out.println("Digite sua altura: ");
        double altura = leer.nextDouble();

        Pessoa shakira = new Pessoa(nome,dataDeNascimento,altura);
        shakira.calcularIdade(2021);
        shakira.imprimir();


    }
}
