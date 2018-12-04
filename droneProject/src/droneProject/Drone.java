package droneProject;

import java.awt.Graphics;
import java.awt.Color;

public class Drone {
	int x = 50;
	int y =100;
	int width = 50;
	int height = 20;
	int radius = 15;
	
	public void drawMe(Graphics g) {
		//body of the car
		Color green = new Color(0,255,0);
		g.setColor(green);
		g.fillRect(x,y,width,height);
		g.fillRect(x+10, y-20, width - 20, height);
		
		//wheels
		Color black = new Color(0,0,0);
		g.setColor(black);
		g.fillOval(x+5,y+15,radius,radius);
		g.fillOval(x+30,y+15,radius,radius);
	}
	//move character
	public void moveUp(){
		setY(getY()-50);
		
	}
	public void moveDown(){
		setY(getY()+50);
		
	}
	public void moveLeft(){
		setX(getX()-50);
		
	}
	public void moveRight(){
		setX(getX()+50);
		
	}
	public void reset(){
		x = 50;
		y = 100;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int newX){
		x = newX;
	}
	public void setY(int newY){
		y = newY;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	
}
