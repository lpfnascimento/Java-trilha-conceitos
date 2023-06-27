package edu.Liliane.SmartTv;

public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 5;

    public void ligarTV(){
        ligada=true;
    }
    public void desligarTV(){
        ligada=false;
    }
    public int aumentarVolume(){
        return volume++;
    }
    public int diminuirVolume(){
        return volume--;
    }
    public int mudarCanal(int novoCanal){
        canal=novoCanal;
        return canal;
    }



}
