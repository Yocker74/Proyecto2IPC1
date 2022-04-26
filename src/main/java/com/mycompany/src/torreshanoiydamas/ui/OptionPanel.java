package com.mycompany.src.torreshanoiydamas.ui;
import com.mycompany.src.torreshanoiydamas.model.ComputerPlayer;
import com.mycompany.src.torreshanoiydamas.model.HumanPlayer;
import com.mycompany.src.torreshanoiydamas.model.Player;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OptionPanel extends JPanel {

	private CheckersWindow window;
	private JButton saveGameButton;
	private JComboBox<String> player1Opts;
	private JButton player1Btn;
	private JComboBox<String> player2Opts;
	private JButton player2Btn;
	private JLabel labelTypeOfGame;
	public OptionPanel(CheckersWindow window) {
		super(new GridLayout(0, 1));
		this.window = window;
		OptionListener ol = new OptionListener();
		final String[] typeOfPlayers = {"Human", "Computer"};
		this.saveGameButton = new JButton("Guardar Partida");
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("It Works");
				
			}
			
		};
	//	this.player1Opts = new JComboBox<>(typeOfPlayers);
	//	this.player2Opts = new JComboBox<>(typeOfPlayers);
	//	player2Opts.setSelectedItem("Computer");
		this.saveGameButton.addActionListener(ol);
	//	this.player1Opts.addActionListener(ol);
	//	this.player2Opts.addActionListener(ol);
		JLabel labelTypeOfGame = new JLabel(" Juego Contra Computadora");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel middle = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
				labelTypeOfGame.setBounds((int) CENTER_ALIGNMENT, 50, 100, 10);
		top.add(saveGameButton);
		middle.add(new JLabel("(Negro) Jugador 1: "));
		bottom.add(new JLabel("(Blanco) Jugador 2: "));
		this.add(top);
		this.add(middle);
		this.add(bottom);
		this.add(labelTypeOfGame);
		
	}
	public CheckersWindow getWindow() {
		return window;
	}
	public void setWindow(CheckersWindow window) {
		this.window = window;
	}
	private static Player getPlayer(JComboBox<String> playerOpts) {
		Player player = new HumanPlayer();
		if (playerOpts == null) {
			return player;
		}
		String type = "" + playerOpts.getSelectedItem();
		if (type.equals("Computer")) {
			player = new ComputerPlayer();
		} 
		return player;
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
			} else if (src == player1Opts) {
				Player player = getPlayer(player1Opts);
				window.setPlayer1(player);
				btn = player1Btn;
			} else if (src == player2Opts) {
				Player player = getPlayer(player2Opts);
				window.setPlayer2(player);
				btn = player2Btn;
			if (btn != null) {
				btn.repaint();
				}
				
			}
		}
	}
}

