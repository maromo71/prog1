package com.company;

public class Main {

    public static void main(String[] args) {
	    String nome = "Marcos";
        String sobrenome = "Moraes";
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" ");
        sb.append(sobrenome);
        //Imprimindo o String completo
        System.out.println(sb.toString());
        int n = sb.lastIndexOf("Moraes");
        sb.delete(0, n);
        System.out.println(sb.toString());
    }
}
