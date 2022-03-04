package com.company;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Digite um nome: ");
        nome = input.nextLine();
        for (char l: nome.toCharArray()) {
            System.out.println(l);
        }
        for (int i = 0; i < nome.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c", nome.charAt(j));
            }
            System.out.println();
        }
    }
}
