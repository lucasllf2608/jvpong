package jvpong.entities;

import java.awt.Color;
import java.awt.Graphics;

import jvpong.Game;

public class Player {
	
	public boolean right;
	public boolean left;
	public int x;
	public int y;
	public int width = 40;
	public int height;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 10;
	}
	
	
	public void tick() {
		if(right) {
			x++;
		} else if (left) {
			x--;
		}
		
		
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} else if ( x < 0 ) {
			x = 0;
		}
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 40, 10);
		
	}

}
