import java.awt.Graphics;
import java.awt.Image;


public class Bullet extends GameObject {
	//same as player basically
	
	private int deltaX;
	
	public Bullet(final int xPos, final int yPos, final int width, final int height, final Image img){
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.img = img;
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

	public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	
}
