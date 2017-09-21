package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {
    private JPanel jPanel;
    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBlau;

    public Fenster() {
        super("Farbenspiel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void initEvents() {
        MeinInnererActionListener mial = new MeinInnererActionListener();
        jbtnRot.addActionListener(mial);
        jbtnBlau.addActionListener(mial);
        jbtnGelb.addActionListener(mial);
    }


    private void initComponents() {
        jPanel = new JPanel();

        jbtnRot = new JButton("Rot");
        jbtnGelb = new JButton("Gelb");
        jbtnBlau = new JButton("Blau");

        jPanel.add(jbtnRot);
        jPanel.add(jbtnGelb);
        jPanel.add(jbtnBlau);

        this.add(jPanel);

    }


    public class MeinInnererActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()){
                case "Rot":
                    jPanel.setBackground(Color.RED);
                    break;
                case "Gelb":
                    jPanel.setBackground(Color.YELLOW);
                    break;
                case "Blau":
                    jPanel.setBackground(Color.BLUE);
                    break;
            }
        }
    }
}
