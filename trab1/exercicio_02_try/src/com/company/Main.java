package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int r = 0;
        try {
            r = x / y;
        }catch (ArithmeticException e){
            System.out.println("Erro de divisão por zero");
        }finally {
            System.out.println("Executa independente do erro");
        }
    }
}
