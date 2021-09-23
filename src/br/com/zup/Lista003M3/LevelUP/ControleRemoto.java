package br.com.zup.Lista003M3.LevelUP;

public class ControleRemoto {
    Televisor tv;

    public ControleRemoto(Televisor tv) {
        this.tv = tv;
    }


    public void aumentarVolumen() {

        int aumentar = tv.getVolume() + 1;
        tv.setVolume(aumentar);
    }

    public void diminuirVolumen() {
        int diminuir = tv.getVolume() - 1;
        tv.setVolume(diminuir);
    }

    public void avancarCanal() {
        int avancar = tv.getCanal() + 1;
        tv.setCanal(avancar);
    }

    public void regresarCanal() {
        int regresar = tv.getCanal() - 1;
        tv.setCanal(regresar);
    }

    public void trocarCanal(int trocar) {
        tv.setCanal(trocar);
    }


    public void consultar() {
        System.out.println("\nVolume: " + tv.getVolume());
        System.out.println("Canal: " + tv.getCanal());
    }
    public String retornarDados(){
        return "\nVolume: " + tv.getVolume()+
                "Canal: " + tv.getCanal();
    }
}
