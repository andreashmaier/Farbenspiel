package com.sabel;

import javax.swing.*;

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
        MeinActionListener mal = new MeinActionListener(jPanel);
        jbtnRot.addActionListener(mal);
        jbtnGelb.addActionListener(mal);
        jbtnBlau.addActionListener(mal);
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


}
