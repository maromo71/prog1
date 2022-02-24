package com.company;

public class ContaException extends Exception {
    private int codigoErro;

    public ContaException(int codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        if(codigoErro==1){
            return "Sem saldo suficiente para saque";
        }
        if(codigoErro==2){
            return "Valor inválido para depósito";
        }
        return "";
    }
}
