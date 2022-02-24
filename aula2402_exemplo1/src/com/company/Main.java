package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int x, y;
            System.out.println("Digite um valor para x: ");
            x = Integer.parseInt(input.nextLine());
            System.out.println("Digite um valor para y: ");
            y = Integer.parseInt(input.nextLine());

            int result = x / y;
            System.out.println("Resultado: " + result);
        }catch (NumberFormatException ex){
            System.out.println("Você deve informar um valor inteiro");
            System.out.println("Mensagem de erro do sistema: " + ex.getMessage());
        }catch (ArithmeticException ex1){
            System.out.println("Impossível dividir por zero");
            System.out.println("Mensagem de erro do sistema: " + ex1.getMessage());
        }catch(Exception ex2){
            System.out.println("Aconteceu um erro inesperado");
            System.out.println("Mensagem de erro do sistema: " + ex2.getMessage());
        }finally {
            System.out.println("Passei aqui com erro ou sem erro");
        }

    }
}
