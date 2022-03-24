package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String cep;
        System.out.println("Digite o cep: ");
        cep = input.nextLine();
        //verificando se está no formato correto primeiro
        if(cep.length()==10){
            if(cep.charAt(2)=='.'){
                if(cep.charAt(6)=='-'){
                    System.out.println("Formato correto");
                    return;
                }
            }
        }
        String vCep = "";
        for (char l : cep.toCharArray()){
            if(l >=48 && l<=57){
                vCep += l;
            }
        }
        System.out.println(vCep);
        String cepFormatado = "";
        if(vCep.length()==8){
            System.out.println(
                    vCep.substring(0, 2) + "." +
                    vCep.substring(2,5) + "-" +
                   vCep.substring(5)
            );
        }else{
            System.out.println("CEP Inválido");
        }




    }
}
