package edu.Liliane.ClassAnatomy;

public class MyFirstClass {

    public static void main (String [] args){
       String meuNome = "Liliane";
       String segNome = "Nascimento";
       int anoNascimento = 1990;
       String nomeCompleto = nomeCompleto(meuNome,segNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return  "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
