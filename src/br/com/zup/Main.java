package br.com.zup;

import br.com.zup.Exercicio001.Bola;
import br.com.zup.Exercicio002.Pessoa;
import br.com.zup.Exercicio003.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        //Exercicio 001
        Bola tennis = new Bola(6.35,"Amarelo", "Wilson",10.5);
        Bola basquet = new Bola(55.9,"laranja","Nike",5);
        Bola beisebol = new Bola(23.5,"branca","Wilson", 175)
        Bola Soccer = new Bola(49.5,"Branca con franjas", "Adidas",90);

        //Exercicio 002
        Pessoa beyonce = new Pessoa("Beyoncé Giselle",40,1.7);
        Pessoa rihanna = new Pessoa("Rihana Fenty",33,1.73);
        Pessoa taylor = new Pessoa("Taylor Swif",32,1.8);

        //Exercicio 003
        ContaCorrente b123 = new ContaCorrente("123456789","Beyonce Knowlege");
        ContaCorrente r456= new ContaCorrente("456123789", "Rihana Fenty");
        ContaCorrente t789 = new ContaCorrente("789456123", "Taylor Swift");
        //Level-Up
    }

}
