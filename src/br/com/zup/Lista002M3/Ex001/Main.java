package br.com.zup.Lista002M3.Ex001;

public class Main {
    public static void main(String[] args) {
        Carro mercedez = new Carro("CLA Copué", 2.5, "Mercedes-Benz", "Prata", 327900);

        mercedez.mostrarDados();
        //Dar Desconto
        mercedez.darDesconto(5000);
        mercedez.mostrarDados();
        mercedez.pintar("Turquesa");
        mercedez.mostrarDados();
    }
}
