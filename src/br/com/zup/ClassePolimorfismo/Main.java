package br.com.zup.ClassePolimorfismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Menu
        boolean menu = true;
        Professor luis = new Professor("Luis", "123", "123a", "Curitiba", 1050, "Professor", "Math", 25, 2);
        Coordenador vilma = new Coordenador("Vilma", "456", "456b", "Curitiba", 1500, "5");
        FuncionarioAdministrativos adolfo = new FuncionarioAdministrativos("Adolfo", "789", "789c", "Curitiba", 1600, "Financeiro", "Doctor");



        //[1] cadastro
        while (menu == true) {
            System.out.println("\n=============== MENU ===============");
            System.out.println("[1] Calcular Aumento de Salario");
            System.out.println("[2] Adicionar Turma");
            System.out.println("[3] Adiscionar Professor");
            System.out.println("[4] sair");
            System.out.println("====================================");
            System.out.println("Marque uma opçao: ");
            int opcao = ler.nextInt();
            System.out.println("====================================");
            switch (opcao) {
                case 1:
                    System.out.printf("Profesor: %s\t Salario: %.2f\t Aumento de salario: %.2f\n", luis.getNome(), luis.getSalario(), luis.aumentoDeSalario(luis.getSalario()));
                    System.out.printf("Coordenador: %s\t Salario: %.2f\t Aumento de salario: %.2f\n", vilma.getNome(), vilma.getSalario(), vilma.aumentoDeSalario(vilma.getSalario()));
                    System.out.printf("Administrativo: %s\t Salario: %.2f\t Aumento de salario: %.2f\n", adolfo.getNome(),adolfo.getSalario(),adolfo.aumentoDeSalario(adolfo.getSalario()));

                    break;
                case 2:
                    ler.nextLine();
                    System.out.println("Digite a serie da turma: ");
                    String serieTurma = ler.nextLine();
                    System.out.println("Digite o curso da turma: ");
                    String cursoTurma = ler.nextLine();
                    System.out.println("Digite a quantidade de Alunos na Turma: ");
                    int qantAluno = ler.nextInt();
                    Turma ano1a = new Turma(serieTurma, cursoTurma,qantAluno);
                    luis.adicionarTurma(ano1a);
                    break;

                case 3:
                    vilma.adicionarProfessor(luis);
                    vilma.
                    break;

                case 4:
                    System.out.println("Hasta la vista Baby");
                    menu = false;
                    break;
                default:
                    System.out.println("Marque uma opçao valida");
            }
        }


    }
}
