package com.company;

import javax.swing.*;
import java.util.Scanner;

public class GerenciarConta {
    Conta conta = new Conta();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GerenciarConta gc = new GerenciarConta();
        int opc = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Depositar");
            System.out.println("2.. Sacar");
            System.out.println("3.. Ver Saldo");
            System.out.println("9.. SAIR");
            System.out.println("Escolha a opção: ");
            opc = Integer.parseInt(input.nextLine());
            switch (opc){
                case 1:
                    System.out.println("Digite o valor do deposito");

                    try{
                        double valorDeposito = Double.parseDouble(input.nextLine());
                        gc.conta.depositar(valorDeposito);
                    }catch (Exception ex){
                        emitirMensagem(ex);
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");

                    try {
                        double valorSaque = Double.parseDouble(input.nextLine());
                        gc.conta.sacar(valorSaque);
                    }catch (Exception ex){
                        emitirMensagem(ex);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + gc.conta.getSaldo());
                    break;
                case 9:
                    System.out.println("FIM do PROGRAMA");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc != 9);
    }

    private static void emitirMensagem(Exception ex) {
        JOptionPane.showMessageDialog(null,
                "Erro: " + ex.getMessage(),
                "Aconteceu um erro",
                JOptionPane.ERROR_MESSAGE);
    }
}
