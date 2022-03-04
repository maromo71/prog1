package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = input.nextLine().toUpperCase();
        for (int i = nome.length()-1; i >=0 ; i--) {
            System.out.printf("%c", nome.charAt(i));
        }
    }
}
