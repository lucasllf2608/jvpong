package jvpong.entities;

import java.awt.Color;
import java.awt.Graphics;

public class Enemy {

	public double x;
	public double y;
	public int width;
	public int height;
	
	public Enemy(double x, double y) {
		this.x = x;
		this.y = y;
		this.height = 10;
		this.width = 40;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.MAGENTA);
		
		int i  = (int) x;
		int z  = (int) y;
		
		
		g.fillRect(i, z, width, height);
	}
	
}
