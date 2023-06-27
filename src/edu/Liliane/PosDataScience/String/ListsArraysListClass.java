package edu.Liliane.PosDataScience.String;

import java.util.ArrayList;
import java.util.Arrays;

public class ListsArraysListClass {
    public static void main(String[] args) {
        ArrayList<String> Estados = new ArrayList<>();

        Estados.add("Minas Gerais");
        Estados.add("São Paulo");
        Estados.add("Paraná");
        Estados.add("Ceará");
        Estados.add(Estados.indexOf("Ceará"), "Pernambuco");



        System.out.println(Estados);
    }
}
