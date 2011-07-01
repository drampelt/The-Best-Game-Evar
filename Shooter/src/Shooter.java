import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JFrame;
//import required items

public class Shooter extends JFrame implements KeyListener{
	//start our class, extends JFrame which is the windows system
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//im not sure about this ^
	
	private Player player1;
	private Player player2;
	private Image image;
	private Graphics graphics;
	boolean player1Up = false;
	boolean player1Down = false;
	boolean player2Up = false;
	boolean player2Down = false;
	CopyOnWriteArrayList<Bullet> bullets = new CopyOnWriteArrayList<Bullet>();
	
	public Shooter() {
		//shooter method that main starts
		setTitle("2D Shooter Game");
		//window title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make the X close the window
		setResizable(false);
		//make the window unresizable
		addKeyListener(this);
		//add key listener
		setSize(600,400);
		//set windows
		setBackground(Color.BLACK);
		//set background
		setVisible(true);
		//make it appear
		
		player1 = new Player(10, 150, 20, 90, 10, "/images/spaceship1.gif");
		player2 = new Player(570, 150, 20, 90, 10, "/images/spaceship2.gif");
		
	}
	
	public void paint(Graphics g){
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();

		g.fillRect(0, 0, getWidth(), getHeight());
		//set it all one color, black is default

		paintComponent(graphics);
		g.drawImage(image, 0, 0, null);
		repaint();
	}
	
	public void paintComponent(Graphics g){
		if(player1.getHealth() > 0 && player2.getHealth() > 0) {
			g.setColor(Color.red);
			g.drawString(player1.getHealth() + " HP | " + player2.getHealth() + " HP", 255, 50);
			for(Bullet bullet : bullets){
				bullet.draw(g);
				bullet.update(this, 0);
			}
		} else if(player1.getHealth() == 0){
			g.setColor(Color.red);
			g.drawString("Player two wins!", 250, 190);
		} else if(player2.getHealth() == 0){
			g.setColor(Color.red);
			g.drawString("Player one wins!", 250, 190);
		}
		g.setColor(Color.blue);
		g.drawString("Made by: zmm22 and drampelt", 210, 370);
		g.setColor(Color.green);
		g.drawString("Up: w, down: s, shoot: space.", 10, 370);
		g.setColor(Color.magenta);
		g.drawString("Up: up, down: down, shoot: enter.", 400, 370);
		player1.draw(g);
		player1.update(this, 1);
		player2.draw(g);
		player2.update(this, 2);
	}
	
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public static void main(String[] args) {
		//main function, starts the shooter method above
		new Shooter();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			player2Up = true;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			player2Down = true;
		} else
		if(e.getKeyCode() == KeyEvent.VK_W){
			player1Up = true;
		} else if(e.getKeyCode() == KeyEvent.VK_S){
			player1Down = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			player2Up = false;
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			player2Down = false;
		} else
		if(e.getKeyCode() == KeyEvent.VK_W){
			player1Up = false;
		} else if(e.getKeyCode() == KeyEvent.VK_S){
			player1Down = false;
		} else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Bullet player1Bullet = new Bullet(player2, 1, player1.getxPos() + 20, player1.getyPos() + 45, 4, 4, "/images/laser.gif");
			bullets.add(player1Bullet);
		} else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			Bullet player2Bullet = new Bullet(player1, -1, player2.getxPos() - 4, player2.getyPos() + 45, 4, 4, "/images/laser.gif");
			bullets.add(player2Bullet);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
