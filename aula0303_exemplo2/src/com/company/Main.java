package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Digite um valor para x: ");
        x = Integer.parseInt(input.nextLine());
        System.out.println("Digite um valor para y: ");
        y =  Integer.parseInt(input.nextLine());
        if(x == y){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        String a, b;
        System.out.println("Digite um nome: ");
        a = input.nextLine();
        System.out.println("Digite outro nome: ");
        b = input.nextLine();
        if(a.equalsIgnoreCase(b)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

    }
}
