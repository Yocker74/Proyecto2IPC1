package com.mycompany.src.torreshanoiydamas.ui;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import java.util.TimerTask;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {

	private CheckersWindow window;
	private JButton saveGameButton;
	Timer timer;
	int second=0;
    int minute=0;
    String ddSecond;
    String ddMinute;
    DecimalFormat dFormat= new DecimalFormat("00");
	JButton initiate;
	private JLabel chrono;
	public OptionPanel(CheckersWindow window) {
		super(new GridLayout(0, 1));
		this.window = window;
		OptionListener ol = new OptionListener();
		
		this.saveGameButton = new JButton("Guardar Partida");
		this.saveGameButton.addActionListener(ol);
		this.initiate= new JButton("Iniciar Partida");
		this.initiate.addActionListener(ol);	

		JLabel labelTypeOfGame = new JLabel(" Juego contra otro jugador");
		 chrono = new JLabel("00:00");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel middle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
				labelTypeOfGame.setBounds((int) CENTER_ALIGNMENT, 50, 100, 10);
		top.add(saveGameButton);
		top.add(initiate);
		middle.add(new JLabel("(Negro) Jugador 1: "));
		bottom.add(new JLabel("(Blanco) Jugador 2: "));
		this.add(top);
		this.add(middle);
		this.add(bottom);
		this.add(labelTypeOfGame);
		this.add(chrono);
		
		
	}

	public void simpleTimer(){
        timer = new Timer(1000,  new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                second++;
                ddSecond= dFormat.format(second);
                ddMinute= dFormat.format(minute);
                
                chrono.setText(ddMinute+":"+ddSecond); 
                if(second==60){
                    second=0;
                    minute++; 
                    
                    chrono.setText(ddMinute+":"+ddSecond); 
                }
            }
        });
    }
	public CheckersWindow getWindow() {
		return window;
	}
	public void setWindow(CheckersWindow window) {
		this.window = window;
	}
	
	private class OptionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (window == null) {
				return;
			}
			Object src = e.getSource();
			JButton btn = null;
			if (src == saveGameButton) {
				
				second=0;
				minute=0;
				
				
				timer.stop();
				initiate.setVisible(true);
			} 
			if(src ==initiate){
				simpleTimer();
		timer.start();
		initiate.setVisible(false);
			}
				
			
		}
	}
}

