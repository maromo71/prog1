package com.company;

public class ContaException extends Exception {
    private int codigoErro;

    public ContaException(int codigoErro){
        this.codigoErro = codigoErro;
    }

    @Override
    public String getMessage() {
        switch (codigoErro){
            case 1:
                return "Sem saldo suficiente para saque";
            case 2:
                return "Valor inválido para depósito";
            default:
                return "";
        }

    }
}
