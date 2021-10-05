package br.com.zup.Inmobiliaria;

import java.util.ArrayList;
import java.util.List;
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

    //Entrega Minima Cadastrar inmovel, exibir inmovels
    //passo 1 cadastrar unico morador
    public static Morador cadastrarMorador() {
        String nomeMor = receverDados("Digite o nome do morador: ").nextLine();
        String cpfMor = receverDados("Digite o CPF do morador: ").nextLine();
        int idadeMor = receverDados("Digite a idade do Morado: ").nextInt();
        double renda = receverDados("Digite a renda do morador: ").nextDouble();
        System.out.println("\n============================================");
        Morador objMorador = new Morador(nomeMor, cpfMor, idadeMor, renda);
        return objMorador;
    }

    // passo 2 Lista de moradores
    public static List moradoresEmLista() {
        List<Morador> moradores = new ArrayList<>();
        int numMor = receverDados("Digite o numeros do Moradores a cadastrar no inmovel").nextInt();

        for (int i = 0; i < numMor; i++) {
            moradores.add(cadastrarMorador());
        }
        System.out.println(moradores);
        return moradores;
    }

    //Executar
    public static void executar() {
        boolean loopMenu = true;
        while (loopMenu) {
            menu();
            int opcaoMenu = receverDados("Digite uma opção valida: ").nextInt();
            if (opcaoMenu == 1) {
                System.out.println("1 . Cadastro do usuario");
                moradoresEmLista();

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
