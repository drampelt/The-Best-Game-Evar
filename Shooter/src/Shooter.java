import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
//import required items

public class Shooter extends JFrame{
	//start our class, extends JFrame which is the windows system
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//im not sure about this ^
	public Shooter() {
		//shooter method that main starts
		setTitle("2D Shooter Game");
		//window title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make the X close the window
		setResizable(false);
		//make the window un resizable
		setSize(600,400);
		//set windows
		setVisible(true);
		//make it appear
	}
	
	public void paint(Graphics g){
		g.clearRect(0, 0, getWidth(), getHeight());
		//set the screen blank
		g.fillRect(0, 0, getWidth(), getHeight());
		//set it all one colour, black is default
		g.setColor(Color.WHITE);
		//change colour to white
		g.drawString("This is teh best game evar.", 50, 50);
		//draw text with white we selected
	}
	
	public void paintComponent(Graphics g){
		//not much yet
	}
	
	public static void main(String[] args) {
		//main function, starts the shooter method above
		new Shooter();
	}
	
}
