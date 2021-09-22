package br.com.zup.Lista002M3.Ex003;

import com.sun.source.tree.WhileLoopTree;

public class Elevador {
    private int andar;
    private int quantidadDeAndares;
    private int capacidadElevador;
    private int pessoasNoElevador;

    public Elevador(int andar, int quantidadDeAndares, int capacidadElevador, int pessoasNoElevador) {
        this.andar = andar;
        this.quantidadDeAndares = quantidadDeAndares;
        this.capacidadElevador = capacidadElevador;
        this.pessoasNoElevador = pessoasNoElevador;
    }

    public int getAndar() {
        return andar;
    }

    public int getQuantidadDeAndares() {
        return quantidadDeAndares;
    }

    public int getCapacidadElevador() {
        return capacidadElevador;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    //setter
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setQuantidadDeAndares(int quantidadDeAndares) {
        this.quantidadDeAndares = quantidadDeAndares;
    }

    public void setCapacidadElevador(int capacidadElevador) {
        this.capacidadElevador = capacidadElevador;
    }

    public void mostrarDados() {
        System.out.println("\n****************");
        System.out.println("*** Elevador ***");
        System.out.println("****************");
        System.out.println("Andar atual:" + andar);
        System.out.println("Ultimo andar: " + quantidadDeAndares);
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
        if (andarsubir > andar & andarsubir < quantidadDeAndares) {
            while (andar < andarsubir) {
                System.out.println(andar);
                andar++;
            }

        } else {
            System.out.println("\n=========================");
            System.out.println("ERRO! Impossivel subir para o andar " + andarsubir);
            System.out.println("=========================");
            andar--;
        }
    }

    public void desce(int andarbaixar) {
        if ((andarbaixar < 0) || (andarbaixar > andar)) {
            System.out.println("\n=========================");
            System.out.println("ERRO! Impossivel descer para o" + andarbaixar);
            System.out.println("=========================");
            andar++;

        } else {
            while (andar > andarbaixar) {
                System.out.println(andar);
                andar--;
            }
        }
    }

/*
    public void sobe(int andarsubir) {
        int paracima = andar + andarsubir;
        if (paracima > (quantidadDeAndares - 1)) {
            System.out.println("\n=========================");
            System.out.println("ERRO! Impossivel subir tantos andares ");
            System.out.println("o último andar é: " + (quantidadDeAndares - 1));
            System.out.println("você desea subir ate o: " + (paracima));
            System.out.println("=========================");
        } else {
            andar = paracima;
        }
    }
*/
/*
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
*/

}
