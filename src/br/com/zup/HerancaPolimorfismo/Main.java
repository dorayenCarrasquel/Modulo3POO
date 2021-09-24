package br.com.zup.HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Forcenador nike = new Forcenador("Nike", "Silicon Valley", "123456", 1500,350);
        Colaborador maria = new Colaborador("Maria", "rua Le vile", "789456", 156, 1050, 20);
        System.out.println(nike.obterSaldo());
        System.out.println(maria.calcularSalario());
    }




}
