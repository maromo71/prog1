package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    List<String> nomes = new ArrayList<>();
        nomes.add("Ana Silva");
        nomes.add("Maria Tereza");
        nomes.add("Ana Moraes");
        nomes.add("Paulo Silva");
        nomes.add("Ana de Oliveira");
        System.out.println("Todas as Anas");
        for(String nome : nomes){
            if(nome.startsWith("Ana")){
                String sobrenome = nome.substring(nome.lastIndexOf(" ")+ 1);
                System.out.println("Ana da Família: " + sobrenome);
            }
        }

        System.out.println("Família Silva");
        for(String nome: nomes){
            if(nome.endsWith("Silva")){
                System.out.println(nome);
            }
        }

        String texto = "O gato mia de noite e o outro gato de dia";
        System.out.println("Resultado: " + texto.lastIndexOf("gato"));
        boolean temGato = false;
        temGato = texto.contains("gato");
        System.out.println(temGato);
        String nomeCompleto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome completo: ");
        nomeCompleto = input.nextLine();
        String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+ 1);
        System.out.println(sobrenome);
        String completo = "Marcos".concat(" ").concat("Moraes");
        System.out.println(completo);
    }
}
