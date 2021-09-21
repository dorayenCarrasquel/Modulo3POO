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
        System.out.println("\n****************");
        System.out.println("*** Elevador ***");
        System.out.println("****************");
        System.out.println("Andar atual:" + andar);
        System.out.println("Ultimo andar: " + (quantidadDeAndares - 1));
        System.out.println("A capacidad Maxima do Elevador é: " + capacidadElevador);
        System.out.println("Números de Pessoas no Elevador: " + pessoasNoElevador);

    }

    public void elevadorfuncionando() {
        System.out.println("\n****************");
        System.out.println("*** Elevador ***");
        System.out.println("****************");
        System.out.println("Andar atual:" + andar);
        System.out.println("Pessoas no Elevador: " + pessoasNoElevador);
    }

    public void entra(int pessoasEntrando) {
        int viajantes = pessoasNoElevador + pessoasEntrando;
        if (viajantes > capacidadElevador) {
            System.out.println("\n=========================");
            System.out.println("Capacidad Máxima escedida por: " + (viajantes - capacidadElevador));
            System.out.println("=========================");
        } else {
            pessoasNoElevador = viajantes;
        }
    }

    public void sai(int pessoassaindo) {
        int desesperadas = pessoasNoElevador - pessoassaindo;
        if (desesperadas < 0) {
            System.out.println("\n=========================");
            System.out.println("ERRO! o número de pessoas para descer es impossivel");
            System.out.println("=========================");
        } else {
            pessoasNoElevador = desesperadas;
        }
    }

    public void sobe(int andarsubir) {
        int paracima = andar + andarsubir;
        if (paracima > (quantidadDeAndares - 1)) {
            System.out.println("\n=========================");
            System.out.println("ERRO! Impossivel subir tantos andares ");
            System.out.println("o último andar é: " + (quantidadDeAndares - 1));
            System.out.println("você desea subir ate o: " + (paracima));
            System.out.println("=========================");
        } else {
            andar = andarsubir;
        }
    }

    public void desce(int andardescer) {
        int parabaixo = andar - andardescer;
        if ((parabaixo< andar)& (parabaixo < 0)) {
            System.out.println("\n=========================");
            System.out.println("Não pode descer mais alem do Terreo");
            System.out.println("=========================");
        } else {
            andar = parabaixo;

        }

    }


}
