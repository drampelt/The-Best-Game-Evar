import java.awt.Graphics;
import java.awt.Image;


public class Bullet extends GameObject {
	
	public Bullet(final int xPos, final int yPos, final int height, final int width, final Image img){
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.img = img;
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
	}
	
}
