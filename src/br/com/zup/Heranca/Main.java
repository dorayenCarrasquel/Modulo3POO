package br.com.zup.Heranca;

public class Main {
    public static void main(String[] args) {
        Guerreiros espadachin = new Guerreiros("Thor", 500, 80.5);
        Rasteiros fire = new Rasteiros("rojito", 650,25.2);

        System.out.println(espadachin.exibirVida());
        espadachin.receberDano(fire.danoEspinhos());
        System.out.println(espadachin.exibirVida());
    }
}
