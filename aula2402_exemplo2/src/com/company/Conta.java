package com.company;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws ContaException {
        if(valor > saldo){
            throw new ContaException(1);
        }
        saldo -= valor;
    }

    public void depositar(double valor) throws ContaException {
        if(valor <=0){
            throw new ContaException(2);
        }
        saldo += valor;
    }
}
