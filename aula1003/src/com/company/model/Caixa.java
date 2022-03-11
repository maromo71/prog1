package com.company.model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(valor > saldo){
            throw new IllegalArgumentException("Sem saldo para o saque");
        }
        saldo -= valor;
    }

    public void depositar(double valor){
        if(valor <=0){
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
        saldo += valor;
    }
}
