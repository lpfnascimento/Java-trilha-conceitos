package edu.Liliane.PosDataScience.String;

import java.util.Random;

public class NumeroAleatorioClass {
    public static void main(String[] args) {
        Random gerador = new Random();
        int i;
        for(i=0; i<=10; i++){
            int x = gerador.nextInt(100);
            System.out.println("numero sorteado: " + x);
        }

    }
}
