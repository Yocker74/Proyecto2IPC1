package com.mycompany.src.torreshanoiydamas.ui;

import com.mycompany.src.torreshanoiydamas.model.Board;
import com.mycompany.src.torreshanoiydamas.model.Game;
import com.mycompany.src.torreshanoiydamas.model.Player;
import com.mycompany.src.torreshanoiydamas.users.Users;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;


public class CheckerBoard extends JButton {

    Users user;
	private static final int PADDING = 16;
	private Game game;
	private CheckersWindow window;
	private Player player1;
	private Player player2;
	private Point selected;
	private boolean selectionValid;
	private Color lightTile;
	private Color darkTile;
	private boolean isGameOver;
	
	public CheckerBoard(CheckersWindow window, Users user) {
		this(window, new Game(), null, null);
                this.user= user;
	}

	public CheckerBoard(CheckersWindow window, Game game,Player player1, Player player2) {

		super.setBackground(Color.WHITE);
		this.addActionListener(new ClickListener());
		this.game = (game == null)? new Game() : game;
		this.lightTile = Color.WHITE;
		this.darkTile = Color.BLACK;
		this.window = window;
		setPlayer1(player1);
		setPlayer2(player2);
	}
	
	public void update() {
		this.isGameOver = game.isGameOver();
		repaint();
	}
	
	public boolean setGameState(boolean testValue,String newState, String expected) {
		if (testValue && !game.getGameState().equals(expected)) {
			return false;
		}
		this.game.setGameState(newState);
		repaint();
		
		return true;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		Game game = this.game.copy();
	
		final int BOX_PADDING = 4;
		final int W = getWidth(), H = getHeight();
		final int DIM = W < H? W : H, BOX_SIZE = (DIM - 2 * PADDING) / 8;
		final int OFFSET_X = (W - BOX_SIZE * 8) / 2;
		final int OFFSET_Y = (H - BOX_SIZE * 8) / 2;
		final int CHECKER_SIZE = Math.max(0, BOX_SIZE - 2 * BOX_PADDING);
		
		g.setColor(Color.BLACK);
		g.drawRect(OFFSET_X - 1, OFFSET_Y - 1, BOX_SIZE * 8 + 1, BOX_SIZE * 8 + 1);
		g.setColor(lightTile);
		g.fillRect(OFFSET_X, OFFSET_Y, BOX_SIZE * 8, BOX_SIZE * 8);
		g.setColor(darkTile);
		for (int y = 0; y < 8; y ++) {
			for (int x = (y + 1) % 2; x < 8; x += 2) {
				g.fillRect(OFFSET_X + x * BOX_SIZE, OFFSET_Y + y * BOX_SIZE,
						BOX_SIZE, BOX_SIZE);
			}
		}

		if (Board.isValidPoint(selected)) {
			g.setColor(selectionValid? Color.GREEN : Color.RED);
			g.fillRect(OFFSET_X + selected.x * BOX_SIZE,
					OFFSET_Y + selected.y * BOX_SIZE,
					BOX_SIZE, BOX_SIZE);
		}

		Board b = game.getBoard();
		for (int y = 0; y < 8; y ++) {
			int cy = OFFSET_Y + y * BOX_SIZE + BOX_PADDING;
			for (int x = (y + 1) % 2; x < 8; x += 2) {
				int id = b.get(x, y);

				if (id == Board.EMPTY) {
					continue;
				}
				
				int cx = OFFSET_X + x * BOX_SIZE + BOX_PADDING;

				if (id == Board.BLACK_CHECKER) {
					g.setColor(Color.DARK_GRAY);
					g.fillOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.LIGHT_GRAY);
					g.drawOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.BLACK);
					g.fillOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.LIGHT_GRAY);
					g.drawOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
				}

				else if (id == Board.BLACK_KING) {
					g.setColor(Color.DARK_GRAY);
					g.fillOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.LIGHT_GRAY);
					g.drawOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.DARK_GRAY);
					g.fillOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.LIGHT_GRAY);
					g.drawOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.BLACK);
					g.fillOval(cx - 1, cy - 2, CHECKER_SIZE, CHECKER_SIZE);
				}

				else if (id == Board.WHITE_CHECKER) {
					g.setColor(Color.LIGHT_GRAY);
					g.fillOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.DARK_GRAY);
					g.drawOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.WHITE);
					g.fillOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.DARK_GRAY);
					g.drawOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
				}

				else if (id == Board.WHITE_KING) {
					g.setColor(Color.LIGHT_GRAY);
					g.fillOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.DARK_GRAY);
					g.drawOval(cx + 1, cy + 2, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.LIGHT_GRAY);
					g.fillOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.DARK_GRAY);
					g.drawOval(cx, cy, CHECKER_SIZE, CHECKER_SIZE);
					g.setColor(Color.WHITE);
					g.fillOval(cx - 1, cy - 2, CHECKER_SIZE, CHECKER_SIZE);
				}

				if (id == Board.BLACK_KING || id == Board.WHITE_KING) {
					g.setColor(new Color(169, 169,169));
					g.drawOval(cx - 1, cy - 2, CHECKER_SIZE, CHECKER_SIZE);
					g.drawOval(cx + 1, cy, CHECKER_SIZE - 4, CHECKER_SIZE - 4);
				}
			}
		}

		String msg = game.isP1Turn()? "Turno de "+ user.getName() : "Turno Jugador 2";
                user.setJugadasRealizadasDamas(user.getJugadasRealizadasDamas()+1);
		int width = g.getFontMetrics().stringWidth(msg);
                
		Color back = game.isP1Turn()? Color.BLACK : Color.WHITE;
		Color front = game.isP1Turn()? Color.WHITE : Color.BLACK;
		g.setColor(back);
		g.fillRect(W / 2 - width / 2 - 5, OFFSET_Y + 8 * BOX_SIZE + 2,
				width + 10, 15);
		g.setColor(front);
		g.drawString(msg, W / 2 - width / 2, OFFSET_Y + 8 * BOX_SIZE + 2 + 11);

		if (isGameOver) {
			g.setFont(new Font("Arial", Font.BOLD, 20));
                        user.setjJDamas(user.getjJDamas()+1);
                        user.setjGDamas(user.getjGDamas()+1);
                        
			msg = "Juego Terminado";
			width = g.getFontMetrics().stringWidth(msg);
			g.setColor(new Color(240, 240, 255));
			g.fillRoundRect(W / 2 - width / 2 - 5,
					OFFSET_Y + BOX_SIZE * 4 - 16,
					width + 10, 30, 10, 10);
			g.setColor(Color.RED);
			g.drawString(msg, W / 2 - width / 2, OFFSET_Y + BOX_SIZE * 4 + 7);
		}
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = (game == null)? new Game() : game;
	}

	public CheckersWindow getWindow() {
		return window;
	}

	public void setWindow(CheckersWindow window) {
		this.window = window;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = (player1 == null)? new Player() : player1;
		
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = (player2 == null)? new Player() : player2;
		
	}
	
	public Player getCurrentPlayer() {
		return game.isP1Turn()? player1 : player2;
	}

	public Color getLightTile() {
		return lightTile;
	}

	public void setLightTile(Color lightTile) {
		this.lightTile = (lightTile == null)? Color.WHITE : lightTile;
	}

	public Color getDarkTile() {
		return darkTile;
	}

	public void setDarkTile(Color darkTile) {
		this.darkTile = (darkTile == null)? Color.BLACK : darkTile;
	}

	private void handleClick(int x, int y) {

		if (isGameOver ) {
			return;
		}
		
		Game copy = game.copy();

		final int W = getWidth(), H = getHeight();
		final int DIM = W < H? W : H, BOX_SIZE = (DIM - 2 * PADDING) / 8;
		final int OFFSET_X = (W - BOX_SIZE * 8) / 2;
		final int OFFSET_Y = (H - BOX_SIZE * 8) / 2;
		x = (x - OFFSET_X) / BOX_SIZE;
		y = (y - OFFSET_Y) / BOX_SIZE;
		Point sel = new Point(x, y);

		if (Board.isValidPoint(sel) && Board.isValidPoint(selected)) {
			boolean change = copy.isP1Turn();
			String expected = copy.getGameState();
			boolean move = copy.move(selected, sel);
			boolean updated = (move?
					setGameState(true, copy.getGameState(), expected) : false);
			if (updated) {

			}
			change = (copy.isP1Turn() != change);
			this.selected = change? null : sel;
		} else {
			this.selected = sel;
		}
		this.selectionValid = isValidSelection(
				copy.getBoard(), copy.isP1Turn(), selected);
		
		update();
	}
	
	private boolean isValidSelection(Board b, boolean isP1Turn, Point selected) {

		int i = Board.toIndex(selected), id = b.get(i);
		if (id == Board.EMPTY || id == Board.INVALID) {
			return false;
		} else if(isP1Turn ^ (id == Board.BLACK_CHECKER ||
				id == Board.BLACK_KING)) { 
			return false;
		} 
	
		List<Point> points = b.find(
				isP1Turn? Board.BLACK_CHECKER : Board.WHITE_CHECKER);
		points.addAll(b.find(
				isP1Turn? Board.BLACK_KING : Board.WHITE_KING));
		for (Point p : points) {
			int checker = Board.toIndex(p);
			if (checker == i) {
				continue;
			}

		}

		return true;
	}

	private class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Point m = CheckerBoard.this.getMousePosition();
			if (m != null) {
				handleClick(m.x, m.y);
			}
		}
	}
}
