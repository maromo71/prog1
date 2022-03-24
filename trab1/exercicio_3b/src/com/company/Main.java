package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String>produtos = new ArrayList<>();
        produtos.add("Malha");
        produtos.add("Bolha");
        produtos.add("Xicara");
        for (String prod : produtos){
            if(prod.contains("lha")){
                System.out.println(prod);
            }
        }
    }
}
