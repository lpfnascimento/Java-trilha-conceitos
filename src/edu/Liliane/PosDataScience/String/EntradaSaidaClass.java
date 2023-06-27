package edu.Liliane.PosDataScience.String;

import java.util.Scanner;

public class EntradaSaidaClass {
    public static void main(String[] args) {
        String palavraUsuário;
        int numUsuário;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        palavraUsuário = entrada.next();
        System.out.println("Digite um numero:");
        numUsuário = entrada.nextInt();
        System.out.println("Numero: "+ numUsuário);
        System.out.println("palavra: "+ palavraUsuário);
    }
}
