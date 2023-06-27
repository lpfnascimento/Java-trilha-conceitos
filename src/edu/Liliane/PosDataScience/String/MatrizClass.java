package edu.Liliane.PosDataScience.String;

public class MatrizClass {
    public static void main(String[] args) {
        int a =3;
        int b=3;
        int [][] dadosMatriciais = new int[a][b];
        int [][] matriazData = {{9,3,6},{5,4,7},{9,2,1}};
        dadosMatriciais = populandoMatriz(a,b);
        imprimeMatriz(dadosMatriciais,a,b);


    }

    public static int[][] populandoMatriz(int a, int b){
        int [][] dados = new int[a][b];
        for (int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                dados[i][j] = i + 3*j;
            }
        }
        return dados;
    }
    public static void imprimeMatriz (int[][] mat, int a, int b){
        for (int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
               System.out.println("mat 2: " + mat[i][j]);
            }
        }
    }
}
