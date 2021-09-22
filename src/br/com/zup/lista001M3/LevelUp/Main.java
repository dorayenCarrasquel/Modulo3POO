package br.com.zup.lista001M3.LevelUp;

import br.com.zup.lista001M3.Exercicio001.Bola;
import br.com.zup.lista001M3.Exercicio002.Pessoa;
import br.com.zup.lista001M3.Exercicio003.ContaCorrente;
import br.com.zup.lista001M3.Exercicio004.Carro;
import br.com.zup.lista001M3.LevelUp.Pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exercicio 001
        Bola tennis = new Bola(6.35, "Amarelo", "Wilson", 10.5);
        Bola basquet = new Bola(55.9, "laranja", "Nike", 5);
        Bola beisebol = new Bola(23.5, "branca", "Wilson", 175);
        Bola Soccer = new Bola(49.5, "Branca con franjas", "Adidas", 90);

        //Exercicio 002
        Pessoa beyonce = new Pessoa("Beyoncé Giselle", 40, 1.7);
        Pessoa rihanna = new Pessoa("Rihana Fenty", 33, 1.73);
        Pessoa taylor = new Pessoa("Taylor Swif", 32, 1.8);

        //Exercicio 003
        ContaCorrente b123 = new ContaCorrente("123456789", "Beyonce Knowlege");
        ContaCorrente r456 = new ContaCorrente("456123789", "Rihana Fenty");
        ContaCorrente t789 = new ContaCorrente("789456123", "Taylor Swift");

        //Exercicio 004
        Carro branco = new Carro(4, "Fiesta", "Ford");
        Carro vermelho = new Carro(2, "huracan", "Lamborghini");
        Carro azul = new Carro(4, "X90D", "Tesla");

        //Level-Up
        List<Pais> continente = new ArrayList<Pais>();
        Scanner leitor = new Scanner(System.in);
        int menu = 0;

        continente.add(new Pais("Venezuela", 916.45, 31.70));
        continente.add(new Pais("Brazil", 8510.34, 211));
        continente.add(new Pais("Chile", 756.95, 18.05));
        continente.add(new Pais("Uruguai", 176.21, 3.35));


        /* outra forma de adicionar na lista
        continente.add(venezuela);
        continente.add(brasil);
        continente.add(chile);
        continente.add(uruguai);
        */
        while (menu != 2) {
            System.out.println("Menu Atlas");
            System.out.println("[1] Listar os países do Continente");
            System.out.println("[2] Sair");
            System.out.println("Marque uma opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Lista de Paises dentro do continente");

                    //https://java-programming.mooc.fi/part-4/2-objects-in-a-list

                    for (Pais paises : continente) {
                        System.out.println("\n\n" +paises);
                        /* Erro
                        System.out.println("\n" + paises.nome);
                        System.out.println("\n" + paises.extensaoTerritorial);
                        System.out.println("\n" + paises.tamanhopopulacao);
                        */
                    }
                    System.out.println("\n\n");

                    break;
                case 2:
                    System.out.println("Adios");
                    menu = 2;
                    break;
                default:
                    System.out.println("Marque uma opção valida");
            }
        }


    }

}
