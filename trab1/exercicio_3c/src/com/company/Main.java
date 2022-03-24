package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = Integer.parseInt(input.nextLine());
        String strValor = Integer.toString(valor);
        for (char l : strValor.toCharArray()){
            switch (l){
                case '1':
                    System.out.print("um ");
                    break;
                case '2':
                    System.out.print("dois");
                    break;
                case '3':
                    System.out.print("três ");
                    break;
                case '4':
                    System.out.print("quatro ");
                    break;
                case '5':
                    System.out.print("cinco ");
                    break;
                case '6':
                    System.out.print("seis ");
                    break;
                case '7':
                    System.out.print("sete ");
                    break;
                case '8':
                    System.out.print("oito ");
                    break;
                case '9':
                    System.out.print("nove ");
                    break;
                case '0':
                    System.out.print("zero ");
                    break;
            }
        }
    }
}
