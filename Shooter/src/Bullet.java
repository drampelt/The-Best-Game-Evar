import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public class Bullet extends GameObject {
	//same as player basically
	
	private int deltaX;
	private Player player;
	
	public Bullet(final Player player, final int xPos, final int yPos, final int width, final int height, final String img){
		this.player = player;
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
		this.rect = new Rectangle(xPos, yPos, width, height);
		this.img = getImage(img);
	}

	public void draw(Graphics g){
		g.drawImage(img, xPos, yPos, width, height, null);
	}

	@Override
	void update(final Shooter shooter, final int id) {
		if(rect.intersects(player.rect)){
			shooter.bullets.remove(this);
		} else if(xPos < 5 || xPos > 595){
			shooter.bullets.remove(this);
		}
		
	}

	public int getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}

	@Override
	Image getImage(String img) {
		return Toolkit.getDefaultToolkit().getImage(img);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
