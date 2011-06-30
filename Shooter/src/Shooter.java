import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Shooter extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Shooter() {
		setTitle("2D Shooter Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(600,400);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.clearRect(0, 0, getWidth(), getHeight());
		
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.WHITE);
		
		g.drawString("This is teh best game evar.", 50, 50);
	}
	
	public void paintComponent(Graphics g){
		
	}
	
	public static void main(String[] args) {
		new Shooter();
	}
	
}
