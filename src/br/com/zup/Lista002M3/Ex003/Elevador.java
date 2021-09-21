package br.com.zup.Lista002M3.Ex003;

public class Elevador {
    int andar;
    int quantidadDeAndares;
    int capacidadElevador;
    int pessoasNoElevador;

    public Elevador(int andar, int quantidadDeAndares, int capacidadElevador, int pessoasNoElevador) {
        this.andar = andar;
        this.quantidadDeAndares = quantidadDeAndares;
        this.capacidadElevador = capacidadElevador;
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public void mostrarDados() {
        System.out.println("****************");
        System.out.println("*** Elevador ***");
        System.out.println("****************");
        System.out.println("Andar atual:" + andar);

    }

    public void entra(int pessoasEntrando) {
        int viajantes = pessoasNoElevador + pessoasEntrando;
        if (viajantes > capacidadElevador) {
            System.out.println("Capacidad Máxima escedida por: " + (viajantes - capacidadElevador));
        } else {
            pessoasNoElevador = viajantes;
        }
    }

    public void sai(int pessoassaindo) {
        int desesperadas = pessoasNoElevador - pessoassaindo;
        if (desesperadas < 0) {
            System.out.println("ERRO! o número de pessoas para descer es impossivel");
            System.out.println("O numero atual de pessoas dentro do elevador é: " + pessoasNoElevador);
        } else {
            pessoasNoElevador = desesperadas;
        }
    }

    public void sobe(int andarsubir) {
        int paracima = andarsubir+andar;
        if (paracima >quantidadDeAndares){
            System.out.println("ERRO! Impossivel subir tantos andares ");
            System.out.println("o último andar é: "+(quantidadDeAndares-1));

        }else{
            andar = andarsubir;
        }
    }

    public void desce() {

    }


}
