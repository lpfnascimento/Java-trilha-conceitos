package edu.Liliane.PosDataScience.String;

public class repeticaoTabuadaClass {
    public static void main(String[] args) {
       // calcular();
        int d = 0;
        double x = 314;
        while (x > 1){
            x = x/2;
            d=d+1;
        }
        System.out.println(x+" "+d);

    }
    public static void calcular(){
        for(int i=1; i<=10;i++){
            System.out.println("Tabuada " + i);
            for (int j=0; j<=10;j++){
                int valor = i*j;
                System.out.println("Valor: "+ i + " x "+ j + " = " + valor);
            }
        }
    }
}
