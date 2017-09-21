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
        jbtnRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            }
        });

        jbtnGelb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.YELLOW);
            }
        });

        jbtnBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
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
