package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener {

    private JPanel jPanel;

    public MeinActionListener(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
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
