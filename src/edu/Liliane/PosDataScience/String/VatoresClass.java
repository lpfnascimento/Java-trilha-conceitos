package edu.Liliane.PosDataScience.String;

public class VatoresClass {
    public static void main(String[] args) {
        //vetores ocupam espaço na memoria
        //precisa declarar tamanho
        //chama new porque ele será um onjeto na memoria
        int [] dados = new int[5];
        int [] dados02 = {0,2,4,8,9,14,13,15};
        dados[0] = 9;
        dados[1] = 7;
        dados[2] = 8;

        System.out.println(dados[2]);
    }

}
