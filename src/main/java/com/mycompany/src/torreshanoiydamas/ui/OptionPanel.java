package com.mycompany.src.torreshanoiydamas.ui;


import com.mycompany.src.torreshanoiydamas.principalMenu;
import com.mycompany.src.torreshanoiydamas.users.Users;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {

	private CheckersWindow window;
	private JButton saveGameButton, exitgame;
	Timer timer;
	int second=0;
        JButton loadGame;
    int minute=0;
    String ddSecond;
    String ddMinute;
    Users user;
    DecimalFormat dFormat= new DecimalFormat("00");
	JButton initiate;
	private JLabel chrono;
	public OptionPanel(CheckersWindow window, Users user) {
		super(new GridLayout(0, 1));
		this.window = window;
                this.user = user;
		OptionListener ol = new OptionListener();
		
		this.saveGameButton = new JButton("Guardar Partida");
		this.saveGameButton.addActionListener(ol);
		this.initiate= new JButton("Iniciar Partida");
		this.exitgame= new JButton("Volver al menú principal");
		this.exitgame.addActionListener(ol);
		this.initiate.addActionListener(ol);	
                this.loadGame=new JButton("Cargar Partida");
		 chrono = new JLabel("00:00");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel middle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));

                                
		top.add(saveGameButton);
		top.add(initiate);
		top.add(exitgame);
                top.add(loadGame);
		middle.add(new JLabel("(Negro) "+ user.getName()  +": "));
		bottom.add(new JLabel("(Blanco) Jugador 2: "));
		this.add(top);
		this.add(middle);
		this.add(bottom);

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
	
	
	private class OptionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (window == null) {
				return;
			}
			Object src = e.getSource();
			if (src == saveGameButton) {
				
				second=0;
				minute=0;
				
				
				timer.stop();
				initiate.setVisible(true);
                                user.addCheckersgame(window);
			} 
			if(src ==initiate){
				simpleTimer();
		timer.start();
		initiate.setVisible(false);
			}
			if (src== exitgame) {
				window.setVisible(false);
				user.setTiempoDamas(user.getTiempoDamas()+60*minute+second);
				user.setjJDamas(user.getjJDamas()+1);
				principalMenu newone = new principalMenu();
				newone.setLocationRelativeTo(null);
				newone.setVisible(true);
				

			}
				
			
		}
	}
}

