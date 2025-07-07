package jvpong.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import jvpong.Game;

public class Enemy {

	public double x;
	public double y;
	public int width;
	public int height;

	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		this.height = 10;
		this.width = 40;
	}

	public void tick() {
		x += (Game.ball.x - x - 6) * 0.07;

		if (x + width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} else if (x < 0) {
			x = 0;
		}

	}

	public void render(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect((int) x, (int) y, width, height);
	}

}
