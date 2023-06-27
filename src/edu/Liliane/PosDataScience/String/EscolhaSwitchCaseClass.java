package edu.Liliane.PosDataScience.String;

import java.util.Scanner;

public class EscolhaSwitchCaseClass {
    public static void main(String[] args) {
        int numUsuario;
        Scanner entradauser = new Scanner(System.in);
        System.out.println("digite um numero");
        numUsuario = entradauser.nextInt();

        switch (numUsuario){
                case 1:
                System.out.println("Cadastro: ");
                break;
                case 2:
                System.out.println("Pagamento: ");
                break;
                case 3:
                System.out.println("tranferencia: ");
                break;
            default:
                System.out.println("numero invalido");
        }
    }
}
