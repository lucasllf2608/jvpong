package jvpong;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

	
	public static void main(String[] args) {
		
		Game game = new Game();
		JFrame frame = new JFrame("Pong");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		 
		
	}
	
	@Override
	public void run() {
		
		
	}

}
