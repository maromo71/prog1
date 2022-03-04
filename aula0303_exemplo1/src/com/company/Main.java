package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 256; i++) {
            System.out.println(i + " -> " + (char)i);
        }
        char letra1 = 'X';
        char letra2 = 'A';
        System.out.println(letra1 > letra2);

        int x = 10;
        System.out.println(x);
        x = 15;
        System.out.println(x);

        String nome = "Marcos";
        System.out.println(nome);
        System.out.println(nome.hashCode());
        nome = "José";
        System.out.println(nome);
        System.out.println(nome.hashCode());
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for(char z : vogais){
            System.out.println(z);
        }
        String strVogais =  new String(vogais);
        System.out.println(strVogais);
        System.out.println("Tamanho: " + strVogais.length());
        System.out.println(strVogais.charAt(1));
        String texto = "Brasil ganhou a copa em 1958";
        char[] arrayPais = new char[6];
        texto.getChars(0,6, arrayPais, 0);
        for (char letra: arrayPais) {
            System.out.println(letra);
        }

    }
}
