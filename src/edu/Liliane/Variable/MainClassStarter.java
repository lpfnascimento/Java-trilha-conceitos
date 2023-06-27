package edu.Liliane.Variable;

import edu.Liliane.Variable.VariableClass;

public class MainClassStarter {
    public static void main(String[] args) {
        //classe Operadores.java
        int numero = 5;

//Imprimindo o numero negativo
        System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        VariableClass var01 = new VariableClass(15,1999,2560.99);
        System.out.println(var01.toString());
    }
}
