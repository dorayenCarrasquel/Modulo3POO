package br.com.zup.Lista002M3.Ex003;

public class Main {
    public static void main(String[] args) {
        Elevador predioA = new Elevador(12,10,10,2);
        predioA.elevadorfuncionando();
        predioA.setAndar(0);
        predioA.sobe(5);
        System.out.println(predioA.getAndar());
    }


}
