package br.com.zup.Lista003M3.LevelUP;

public class Main {
    public static void main(String[] args) {
        Televisor lg = new Televisor(0,1);
       ControleRemoto cr = new ControleRemoto(lg);
       lg.getVolume();
       lg.getCanal();
        System.out.println("Canal "+ lg.getCanal()+" Volume "+ lg.getVolume());
        cr.aumentarVolumen();
        cr.consultar();
        cr.aumentarVolumen();
        cr.retornarDados();
        cr.aumentarVolumen();
        cr.consultar();
        cr.diminuirVolumen();
        cr.consultar();
        cr.trocarCanal(5);
        cr.consultar();






    }
}
