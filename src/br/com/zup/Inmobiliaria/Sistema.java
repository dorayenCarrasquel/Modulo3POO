package br.com.zup.Inmobiliaria;

import java.util.Scanner;

public class Sistema {
    //Captura de Dados
    private static Scanner receverDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu
    public static void menu() {
        System.out.println("******************** M * E * N * U *********************************");
        System.out.println("[1] Cadastrar inmovel");
        System.out.println("[2] Exibir dados do inmovel");
        System.out.println("[3] Sair");

    }

    //Executar
    public static void executar() {
        boolean loopMenu = true;
        while (loopMenu) {
            menu();
            int opcaoMenu = receverDados("Digite uma opção valida: ").nextInt();
            if (opcaoMenu == 1) {
                System.out.println("1 . Cadastro do usuario");


            } else if (opcaoMenu == 2) {
                System.out.println("2. Exibir dados do Inmovel");

            } else if (opcaoMenu == 3) {
                System.out.println("Saindo do sistema");
                loopMenu = false;
            } else {
                System.out.print("Digite uma opção valida do menu ");
            }
        }
    }


}
