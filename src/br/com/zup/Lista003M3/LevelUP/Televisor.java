package br.com.zup.Lista003M3.LevelUP;

public class Televisor {
    private int volume;
    private int canal;

    public Televisor(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
}
