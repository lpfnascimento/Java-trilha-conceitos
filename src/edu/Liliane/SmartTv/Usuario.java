package edu.Liliane.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tvLG = new SmartTv();

        System.out.println("Status: "+tvLG.ligada);
        System.out.println("volume: "+tvLG.volume);
        System.out.println("canal: "+tvLG.canal);

        tvLG.ligarTV();
        System.out.println("Status: "+tvLG.ligada);
        tvLG.desligarTV();
        System.out.println("Status: "+tvLG.ligada);

        tvLG.aumentarVolume();
        tvLG.aumentarVolume();
        tvLG.aumentarVolume();
        System.out.println("volume: "+tvLG.volume);
        tvLG.diminuirVolume();
        tvLG.diminuirVolume();
        System.out.println("volume: "+tvLG.volume);

        tvLG.mudarCanal(15);
        System.out.println("canal: "+tvLG.canal);
        tvLG.mudarCanal(20);
        System.out.println("canal: "+tvLG.canal);
        tvLG.mudarCanal(2);
        System.out.println("canal: "+tvLG.canal);

    }
}
