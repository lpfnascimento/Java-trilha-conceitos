package edu.Liliane.Variable;

public class VariableClass {
    int idade;
    int anoFabricacao;
    double preco;

    public VariableClass(int idade, int anoFabricacao, double preco) {
        this.idade = idade;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }
    public String toString (){
        return ("preco: " + this.preco + "\n idade: " +  this.idade + "\n ano fabricacao: " + this.anoFabricacao);
    }
}
