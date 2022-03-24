package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> nomes = new ArrayList<>();
        nomes.add("João Carlos");
        nomes.add("Pedro Santos");
        nomes.add("Henrique Ribeiro");
        for (String nome : nomes){
            System.out.println(nome.substring(0, nome.indexOf(" ")));
        }
    }
}
