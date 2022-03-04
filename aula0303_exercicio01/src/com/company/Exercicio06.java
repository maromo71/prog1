package com.company;

import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dataNascimento;
        System.out.println("Digite a data de nascimento (dd/mm/aaaa): ");
        dataNascimento = input.nextLine();
        String mes = dataNascimento.substring(3,5);
        int intMes = Integer.parseInt(mes);
        String nomeMes = verMes(intMes);
        StringBuffer buf = new StringBuffer();
        buf.append(dataNascimento.substring(0,2));
        buf.append(" de ");
        buf.append(nomeMes);
        buf.append(" de ");
        buf.append(dataNascimento.substring(dataNascimento.lastIndexOf("/")+1));
        buf.append("\n");
        System.out.println(buf.toString());


    }

    private static String verMes(int intMes) {
        switch (intMes-1){
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            case 6:
                return  "Julho";
            case 7:
                return "Agosto";
            case 8:
                return "Setembro";
            case 9:
                return "Outubro";
            case 10:
                return "Novembro";
            case 11:
                return "Dezembro";
        }
        return null;
    }
}
