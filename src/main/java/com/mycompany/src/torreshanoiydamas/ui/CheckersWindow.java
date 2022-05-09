package com.mycompany.src.torreshanoiydamas.ui;

import com.mycompany.src.torreshanoiydamas.users.Users;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckersWindow extends JFrame {
	private CheckerBoard board;
	private OptionPanel opts;
	
	public CheckersWindow(int width, int height, String title,Users user) {
		super(title);
		super.setSize(width, height);
		JPanel layout = new JPanel(new BorderLayout());
		this.board = new CheckerBoard(this , user);
		this.opts = new OptionPanel(this,user);
		layout.add(board, BorderLayout.CENTER);
		layout.add(opts, BorderLayout.SOUTH);
		this.add(layout);
	}
	public CheckerBoard getBoard() {
		return board;
	}

}