package com.mycompany.src.torreshanoiydamas.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
    public Window() {
        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Torres de Hanoi & Damas");
        setLocationRelativeTo(null);
        initiateComponents();
    }
    private void initiateComponents(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
    }
}
