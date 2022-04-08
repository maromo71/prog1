package br.faculdade.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;


public class MyNotepad implements ActionListener {
    private JPanel frmPanel;
    private JMenuBar MenuBar;
    private JMenu MyMenu;
    private JMenu MyMenu2;
    private JMenuItem MyOpen;
    private JMenuItem MySave;
    private JTextArea textArea1;

    private FileReader in;

    //Para poder acessar no main
    public JPanel getFrmPanel() {
        return frmPanel;
    }

    public MyNotepad(){
        MyOpen.addActionListener(this);
        MySave.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==MyOpen){
            //procedimento para a janela do abrir arquivo
            try{
                FileDialog FOpen = new FileDialog(
                        (Dialog)null,"Abrir Arquivo", FileDialog.LOAD);
                FOpen.setVisible(true);
                if(FOpen.getFile()==null) return;
                //preparar para ler o string
                String arquivo = FOpen.getDirectory() + FOpen.getFile();
                in = new FileReader(arquivo);
                String s = "";
                int i = in.read();
                while(i!=-1){
                    s += (char)i;
                    i = in.read();
                }
                textArea1.setText(s);
                in.close();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(
                        null,
                        "Não foi possível abrir o arquivo",
                        "Erro: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE
                );
            }
            return;
        }
        if(e.getSource()==MySave){
            //procedimento para a janela de salvar arquivo
            FileDialog FSave = new FileDialog((Dialog) null,
                    "Salvar Arquivo", FileDialog.SAVE);
            FSave.setVisible(true);
            if(FSave.getFile()==null)return;
            String arquivo = FSave.getDirectory() + FSave.getFile();
            try{
                FileWriter out = new FileWriter(arquivo);
                out.write(textArea1.getText());
                out.close();
            }catch (Exception ex){
               JOptionPane.showMessageDialog(null,
                       "Não foi possível salvar o arquivo",
                       "Erro ao salvar",
                       JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
