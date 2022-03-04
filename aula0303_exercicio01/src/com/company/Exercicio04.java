package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = input.nextLine();
        int total = 0;
        int vogais = 0;
        for(char letra : texto.toLowerCase().toCharArray()){
            if(letra==' ')total++;
            switch (letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vogais++;
                    break;
            }
        }
        System.out.println("Espaços em branco na frase: " + total);
        System.out.println("Vogais na frase: " + vogais);
    }
}
