package br.com.zup.Lista002M3.Ex003;

public class Main {
    public static void main(String[] args) {
        Elevador predioA = new Elevador(0,10,10,2);
        predioA.mostrarDados();
        System.out.println(predioA.pessoasNoElevador);
        predioA.entra(5);
        System.out.println(predioA.pessoasNoElevador);
        predioA.sai(5);
        System.out.println(predioA.pessoasNoElevador);
        predioA.sai(7);
        System.out.println(predioA.pessoasNoElevador);
    }


}
