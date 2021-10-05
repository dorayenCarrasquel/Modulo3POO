package br.com.zup.Inmobiliaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
   //instanciar inmoviliar padrão
    Inmobiliaria inmFerrara = new Inmobiliaria();
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
    // passo3 Cadastrar funcionario
    public static Responsavel cadastroCorretor(){
        String nomeFun = receverDados("Digite o nome do Corretor Responsaivel: ").nextLine();
        String cpfFunc = receverDados("Digite o número do CPF do corretor: ").nextLine();
        String ctps = receverDados("Digite o número da Carteira de trabalho do corretor: ").nextLine();
        Responsavel corretorInm = new Responsavel(nomeFun,cpfFunc,ctps);
        return corretorInm;
    }

    //passo 4 Cadastrar um inmovel
    public static Inmovel cadastroInmovel(){
        String endereco = receverDados("Digite o endereço do inmovel: ").nextLine();
        double valorAluguel = receverDados("Digite o valor do aluguel: ").nextDouble();
        int quartos = receverDados("Digite o número de habitações do inmovel: ").nextInt();
        boolean iptu = receverDados("O Morador debe pagar IPTU? ").nextBoolean();
        String tipoDeVivienda = receverDados("Indique tipo de vivienda: ").nextLine();
        int quantidadMoradores = moradoresEmLista().size();

        Inmovel resCaracas = new Inmovel(endereco,valorAluguel,quartos,iptu,tipoDeVivienda,quantidadMoradores,cadastroCorretor(),moradoresEmLista());
        return resCaracas;
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
                cadastroCorretor();
                System.out.println();;


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
