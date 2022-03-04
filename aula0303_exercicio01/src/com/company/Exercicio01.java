package com.company;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b;
        System.out.println("Digite a primeira string: ");
        a = input.nextLine();
        System.out.println("Digite a segunda string: ");
        b = input.nextLine();
        System.out.println("Conteúdo de a: " + a);
        System.out.println("Tamanho de a: " + a.length());
        System.out.println("Conteúdo de b: " + b);
        System.out.println("Tamanho de b: " + b.length());
        if(a.length()==b.length()){
            if(a.equals(b)){
                System.out.println("São iguais");
            }else{
                System.out.println("Tem mesmo tamanho, mas são diferentes");
            }
        }else{
                System.out.println("São diferentes");
        }

    }
}
