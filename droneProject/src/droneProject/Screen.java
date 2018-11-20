package droneProject;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener{
	Drone dr = new Drone();
	Font font1 = new Font("Arial", Font.PLAIN, 30);
	
	//constructor
	public Screen(){
		setFocusable(true);
		addKeyListener(this);
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(800,600);
		
		
	}
	
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode()== 37){
			System.out.println("move left");
			dr.moveLeft();
		}
		
		else if (e.getKeyCode()== 38){
			System.out.println("move up");
			dr.moveUp();
			
		}
		else if (e.getKeyCode()==39){
			System.out.println("move right");
			dr.moveRight();
		}
		else if (e.getKeyCode() ==40){
			System.out.println("move down");
			dr.moveDown();
		}
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//draw background
		Color white = new Color(255,255,255);
		g.setColor(white);
		g.fillRect(0,0,800,600);
		
		//draw a blue Oval
		Color blue = new Color(0,0,255);
		g.setColor(blue);
		g.fillOval(400, 300,100,50);
		
		//hole
		Color black = new Color(0,0,0);
		g.setColor(black);
		g.fillOval(650, 100, 120, 75);
		
		//draw main character
		dr.drawMe(g);
		
		
	}
	public void keyReleased(KeyEvent e){
		
	}
	
	public void keyTyped(KeyEvent e){
		
	}
	
}
