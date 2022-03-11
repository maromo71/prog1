package com.company;

import com.company.view.Tela;
import com.company.view.Tela2;

import javax.swing.*;

public class GerenciarCaixa {

    public static void main(String[] args) {
       /* Tela tela = new Tela();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); */
        JFrame tela2 = new JFrame("Controle de Caixa");
        tela2.setContentPane(new Tela2().getPanelTela());
        tela2.setSize(350,430);
        tela2.setResizable(false);
        tela2.setVisible(true);
    }
}
