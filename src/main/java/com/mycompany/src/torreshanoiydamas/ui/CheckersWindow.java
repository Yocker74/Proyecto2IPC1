package com.mycompany.src.torreshanoiydamas.ui;
import com.mycompany.src.torreshanoiydamas.model.Player;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckersWindow extends JFrame {
	private CheckerBoard board;
	private OptionPanel opts;
	
	public CheckersWindow(int width, int height, String title) {
		super(title);
		super.setSize(width, height);
		JPanel layout = new JPanel(new BorderLayout());
		this.board = new CheckerBoard(this);
		this.opts = new OptionPanel(this);
		layout.add(board, BorderLayout.CENTER);
		layout.add(opts, BorderLayout.SOUTH);
		this.add(layout);
	}
	public CheckerBoard getBoard() {
		return board;
	}
	public void setPlayer1(Player player1) {
		this.board.setPlayer1(player1);
		this.board.update();
	}
	public void setPlayer2(Player player2) {
		this.board.setPlayer2(player2);
		this.board.update();
	}

}