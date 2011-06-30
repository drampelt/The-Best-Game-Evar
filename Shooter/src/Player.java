import java.awt.Graphics;
import java.awt.Image;


public class Player extends GameObject {
//extends gameobject class we have
	/** 
	 * create a player
	 * @param xPos x position
	 * @param yPos y position
	 * @param height height of player
	 * @param width width of player
	 * @param health health of player
	 * @param img image of player
	 */
	public Player(final int xPos, final int yPos, final int width, final int height, final int health, final Image img){
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.health = health;
		this.img = img;
		//set variables like position on screen
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
		//draw the player image (we havent made one yet)
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}
	
}
