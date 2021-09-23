package br.com.zup.Lista003M3.LevelUP;

public class ControleRemoto {
    Televisor tv;

    public ControleRemoto(Televisor tv) {
        this.tv = tv;
    }


    public void aumentarVolumen(int aumentar) {

        aumentar = tv.getVolume() + 1;
        tv.setVolume(aumentar);
    }

    public void diminuirVolumen(int diminuir) {
        diminuir = tv.getVolume()-1;
        tv.setVolume(diminuir);
    }

    public void avancarCanal(int canal){
        canal = tv.getCanal()+1;
        tv.setCanal(canal);
    }
    public void regresarCanal(int canal){

        canal = tv.getCanal()-1;
        tv.setCanal(canal);
    }
    public void trocarCanal(int trocar){
        tv.setCanal(trocar);
    }


    public void consultar() {
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Canal: " + tv.getCanal());
    }
}
