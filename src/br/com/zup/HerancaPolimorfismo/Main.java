package br.com.zup.HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Forcenador nike = new Forcenador("Nike", "Silicon Valley", "123456", 1500,350);
        Colaborador maria = new Colaborador("Maria", "rua Le vile", "789456", 156, 1050, 20);
        Administrador luc = new Administrador("Lucia"," Rua Aponguao", "456789", 162,1250,500,150);

        System.out.println(luc.calcularSalario());
        System.out.println(nike.obterSaldo());
        System.out.println(maria.calcularSalario());

    }




}
