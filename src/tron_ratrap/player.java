package tron_ratrap;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class player extends JPanel{
	private int posX = 200;
	private int posY = 360;
	private int posX2 = 300;
	private int posY2 = 360;
	boolean playeralive = true;
	
	
	public void paintComponent(Graphics g){
		g.setColor(Color.red);
		g.fillRect(posX, posY, 2, 2);
		g.setColor(Color.blue);
		g.fillRect(posX2, posY2, 2, 2);
	}
	
	
	public int getPosX2() {
		return posX2;
	}


	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}


	public int getPosY2() {
		return posY2;
	}


	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}

	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
}
