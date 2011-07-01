import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


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
	public Player(final int xPos, final int yPos, final int width, final int height, final int health, final String img){
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.rect = new Rectangle(xPos, yPos, width, height);
		this.health = health;
		this.img = getImage(img);
		//set variables like position on screen
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
		//draw the player image (we havent made one yet)
	}

	@Override
	void update(final Shooter shooter, final int id) {
		if(id == 1){
			if(shooter.player1Up){
				if(!(yPos < 26)){
					yPos--;
					rect.y--;
				}
			} else if (shooter.player1Down){
				if(!(yPos > shooter.getHeight() - 86)){
					yPos++;
					rect.x++;
				}
			}
			
		}else if(id == 2){
			if(shooter.player2Up){
				if(!(yPos < 26)){
					yPos--;
					rect.y--;
				}
			} else if (shooter.player2Down){
				if(!(yPos > shooter.getHeight() - 86)){
					yPos++;
					rect.y++;
				}
			}
		}
		
	}

	@Override
	Image getImage(String img) {
		return Toolkit.getDefaultToolkit().getImage(img);
	}
	
}
