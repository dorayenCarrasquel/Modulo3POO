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
        System.out.println("[2] Exibir dados da inmoviliaria");
        System.out.println("[3] Excluir morador no inmovel");
        System.out.println("[4] Adicionar morador no inmovel");
        System.out.println("[5] Sair");

    }

    //Entrega Minima Cadastrar inmovel, exibir inmovels
    //passo 1 criar objeto
    public static Morador cadastrarMorador() {
        String nomeMor = receverDados("Digite o nome do morador: ").nextLine();
        int idadeMor = receverDados("Digite a idade do Morado: ").nextInt();
        double renda = receverDados("Digite a renda do morador: ").nextDouble();
        String cpfMor = receverDados("Digite o CPF do morador: ").nextLine();
        System.out.println("\n============================================");
        Morador objMorador = new Morador(nomeMor, idadeMor, renda);
        return objMorador;
    }


    // passo3 criar objeto funcionario
    public static Responsavel cadastroCorretor() {
        String nomeFun = receverDados("Digite o nome do Corretor Responsaivel: ").nextLine();
        String cpfFunc = receverDados("Digite o número do CPF do corretor: ").nextLine();
        String ctps = receverDados("Digite o número da Carteira de trabalho do corretor: ").nextLine();
        Responsavel corretorInm = new Responsavel(nomeFun, cpfFunc, ctps);
        return corretorInm;
    }

    //Validar IPTU
    private static boolean validarIptu() {
        boolean iptuvalidado = false;
        String pagoIptu = receverDados("O morador está excento de IPTU? digite SIM o NÃO").nextLine();
        if (pagoIptu.equalsIgnoreCase("sim")) {
            iptuvalidado = true;
        } else if (pagoIptu.equalsIgnoreCase("não")) {
            iptuvalidado = false;
        } else {
            System.out.println("Valor digitado não corresponde");
        }
        return iptuvalidado;
    }

    //validar CPF repetidos
    public static void validarCPF(Inmovel inmovel,Morador morador) {
        String cpfMor = receverDados("Digite o CPF do morador: ").nextLine();
        for (Morador cpfReferencia: inmovel.getMoradores()) {

        }
        morador.getCpf();
    }


    //passo 4 Cadastrar um inmovel
    public static Inmovel cadastroInmovel() {
        String endereco = receverDados("Digite o endereço do inmovel: ").nextLine();
        double valorAluguel = receverDados("Digite o valor do aluguel: ").nextDouble();
        int quartos = receverDados("Digite o número de habitações do inmovel: ").nextInt();
        boolean iptu = validarIptu();
        String tipoDeVivienda = receverDados("Indique tipo de vivienda: ").nextLine();

        Inmovel resCaracas = new Inmovel(endereco, valorAluguel, quartos, iptu, tipoDeVivienda, cadastroCorretor());

        int numMor = receverDados("Digite o numeros do Moradores a cadastrar no inmovel").nextInt();
        for (int i = 0; i < numMor; i++) {
            Morador moradorNoInmovel = cadastrarMorador();
            if (i == 1) {
                resCaracas.adicionarMorador(moradorNoInmovel);
            } else if (i > 1) {
                validarCPF(resCaracas, moradorNoInmovel);

            }
            return resCaracas;
        }
        return resCaracas;
    }
//        //Adicionando mais de um inmovel
//        public static void addInmovelaMais(Inmobiliaria inmovels){
//            inmovels.cadastrarInmovelInmovi(cadastroInmovel());
//
//        }

//        //Excluir morador de um endereço específico
//        public static void excluirMorador (Inmobiliaria inmoveis){
//            String moradorRemover = receverDados("Digite o ").nextLine();
//        }

// passo 2 adicionando objeto na Lista de moradores
//    public static List moradoresEmLista() {
//        List<Morador> moradores = new ArrayList<>();
//
//        int numMor = receverDados("Digite o numeros do Moradores a cadastrar no inmovel").nextInt();
//
//        for (int i = 0; i < numMor; i++) {
//            moradores.add(cadastrarMorador());
//        }
//        return moradores;


        public static void executar() {
            Inmobiliaria casaDosSonos = new Inmobiliaria();

            boolean loopMenu = true;
            while (loopMenu) {
                menu();
                int opcaoMenu = receverDados("Digite uma opção valida: ").nextInt();
                if (opcaoMenu == 1) {
                    System.out.println("1 . Cadastro do inmovel");
                    System.out.println("============================================");
                    //addInmovelaMais(casaDosSonos);
                    System.out.println("============================================");
                } else if (opcaoMenu == 2) {
                    System.out.println("2. Exibir dados do Inmovel");
                    System.out.println("********************************************");
                    System.out.println(casaDosSonos);
                    System.out.println("********************************************");

                } else if (opcaoMenu == 3) {
                    System.out.println("3. Excluir morador no inmovel");
                    System.out.println("********************************************");

                    System.out.println("********************************************");
                } else if (opcaoMenu == 5) {
                    System.out.println("Saindo do sistema");
                    loopMenu = false;
                } else {
                    System.out.print("Digite uma opção valida do menu ");
                }
            }
        }


    }
