import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	private boolean player1Up = false;
	private boolean player1Down = false;
	private boolean player2Up = false;
	private boolean player2Down = false;
	
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
		
		player1 = new Player(10, 150, 20, 90, 10, "images/spaceship1.gif");
		player2 = new Player(570, 150, 20, 90, 10, "images/spaceship2.gif");
		
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
		player1.draw(g);
		player2.draw(g);
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
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
