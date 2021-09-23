package br.com.zup.Lista003M3.LevelUP;

public class Main {
    public static void main(String[] args) {
        Televisor lg = new Televisor(0,1);
       ControleRemoto cr = new ControleRemoto(lg);
       lg.getVolume();
       lg.getCanal();
        System.out.println("Canal "+ lg.getCanal()+" Volume "+ lg.getVolume());
        cr.aumentarVolumen(1);
        cr.consultar();
        cr.aumentarVolumen(1);
        cr.aumentarVolumen(1);
        cr.consultar();
        cr.diminuirVolumen(1);
        cr.consultar();






    }
}
