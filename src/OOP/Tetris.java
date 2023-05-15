package OOP;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel statusbar;
	
	public Tetris() {
		initUI();
	}
	
	private void initUI() {

		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		Board board = new Board(this);
		board.setBackground(new Color (150,150,155));
		add(board);
		board.start();
		
		setSize(400, 800);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public JLabel getStatusBar() {

		return statusbar;
	}
}