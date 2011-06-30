import java.awt.Graphics;
import java.awt.Image;


public class Player extends GameObject {

	public Player(final int xPos, final int yPos, final int height, final int width, final int health, final Image img){
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.health = health;
		this.img = img;
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
	}
	
}
