package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numeros = "1, 2, 3, 4, 5";
        numeros = numeros.replace(",", "");
        System.out.println(numeros);
        numeros = numeros.replace(" ", "");
        System.out.println(numeros);
        int resultado = Integer.parseInt(numeros) * 2;
        System.out.println(resultado);
        StringBuffer buffer = new StringBuffer();
        buffer.append("Ana").append("\n");
        buffer.append("Manoel").append("\n");
        System.out.println(buffer.toString());

    }
}
