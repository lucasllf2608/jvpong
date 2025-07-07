package jvpong.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import jvpong.Game;

public class Ball {

	public double x;
	public double y;
	public int width;
	public int height;

	public double dx, dy;
	public double speed = 1.7;

	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.height = 4;
		this.width = 4;

		int angle = new Random().nextInt((120 - 45) + 45 + 1);

		this.dx = Math.cos(Math.toRadians(angle));
		this.dy = Math.sin(Math.toRadians(angle));

	}

	public void tick() {

		if (x + (dx * speed) + width >= Game.WIDTH) {
			dx *= -1;
		} else if (x + (dx * speed) < 0) {
			dx *= -1;
		}

		if (y >= Game.HEIGHT) {
			System.out.println("ponto do inimigo");
			new Game();
			return;
		} else if (y < 0) {
			System.out.println("ponto nosso");
			new Game();
			return;
		}

		if (x + width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} else if (x < 0) {
			x = 0;
		}

		Rectangle bounds = new Rectangle((int) (x + (dx * speed)), (int) (y + (dy * speed)), width, height);

		Rectangle boundsPlayer = new Rectangle(Game.player.x, Game.player.y, Game.player.width, Game.player.height);
		Rectangle boundsEnemy = new Rectangle((int) Game.enemy.x, (int) Game.enemy.y, Game.enemy.width,
				Game.enemy.height);

		if (bounds.intersects(boundsPlayer)) {

			int angle = new Random().nextInt((120 - 45) + 45 + 1);

			this.dx = Math.cos(Math.toRadians(angle));
			this.dy = Math.sin(Math.toRadians(angle));

			if (dy > 0) {
				dy *= -1;
			}

		} else if (bounds.intersects(boundsEnemy)) {

			if (dy < 0) {
				dy *= -1;
			}

		}

		x += dx * speed;
		y += dy * speed;
	}

	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) x, (int) y, width, height);
	}

}
