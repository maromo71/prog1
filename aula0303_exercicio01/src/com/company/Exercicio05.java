package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra ou frase: ");
        palavra = input.nextLine().toLowerCase();
        palavra = palavra.replace(" ", "");
        boolean palindromo = false;
        for (int i = 0; i < palavra.length() ; i++) {
            if(palavra.charAt(i)!=palavra.charAt(palavra.length()-i-1)){
                palindromo = false;
                break;
            }
            palindromo = true;
        }
        if(palindromo){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }
    }
}
