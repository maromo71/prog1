package com.company.view;

import com.company.model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Tela extends JFrame implements WindowListener, ActionListener {
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdSacar, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    private Caixa caixa;

    //Aparencia da tela (janela)
    public Tela() {
        caixa = new Caixa();
        dFrame = new Dimension(370, 430);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);
        //aparencia da janela
        setTitle("Controle de Caixa");
        setResizable(false);
        setSize(dFrame);
        setLocation(200, 200);
        setLayout(null);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdSacar = new Button("Sacar");
        cmdSacar.setSize(dButton);
        cmdSacar.setLocation(180, 150);
        cmdSacar.addActionListener(this);
        add(cmdSacar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSacar.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);

        addWindowListener(this);

    }


    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Ola",
                "Abrindo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null,
                "Bye",
                "Fechando",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdEntrada) {
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
            return;
        }

        if (e.getSource() == cmdSacar) {
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
            return;
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            return;
        }
        if(e.getSource()==cmdSair){
            System.exit(0);
        }
    }
}
