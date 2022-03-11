package com.company.view;

import com.company.model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdDepositar;
    private JButton cmdSacar;
    private JButton cmdConsultar;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JPanel panelTela;
    private Caixa caixa;

    public JPanel getPanelTela() {
        return panelTela;
    }

    public Tela2() {
        caixa = new Caixa();
        cmdDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    double valor = Double.parseDouble(txtValor.getText());
                    caixa.depositar(valor);
                    JOptionPane.showMessageDialog(null,
                            "Depósito efetuado com sucesso",
                            "Aviso",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtMsg.append("Depósito realizado no valor de " + valor + "\n");
                    txtValor.setText(null);
                    txtValor.requestFocus();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage().toString(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cmdSacar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    double valor = Double.parseDouble(txtValor.getText());
                    caixa.sacar(valor);
                    JOptionPane.showMessageDialog(null,
                            "Saque efetuado com sucesso",
                            "Aviso",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtMsg.append("Saque realizado no valor de " + valor + "\n");
                    txtValor.setText(null);
                    txtValor.requestFocus();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage().toString(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cmdConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
            }
        });
        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
