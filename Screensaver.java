/*
 * making a screen saver
 * 
 * @author Evan Torgrimson
 * @date 4/13/15
 * @file Screensaver.java
 * 
 */




import java.awt.Color;
import acm.program.*;
import acm.graphics.*;


public class Screensaver extends GraphicsProgram {
	

		
		// class fields
		public final int APPLET_WIDTH = 800;
		public final int APPLET_HEIGHT = 600;
		
		
		// size of turnip head
		public final double HORIZONTAL_MOVE = 0;
		public final double VERTICAL_MOVE = 1;
		
		
		
		public void init(){
			setSize(APPLET_WIDTH, APPLET_HEIGHT);
		}
		
		public void run() {
			
			
			
			GImage background = new GImage("background.png");
			add(background);
			background.setSize(APPLET_WIDTH, APPLET_HEIGHT);
			
			GRect keyRect = new GRect(63, 0, 383, 411);
			add(keyRect);
			keyRect.setFillColor(Color.black);
			keyRect.setFilled(true);
			
			
			// cat
			
			GImage cat = new GImage("cat.png");
			add(cat, 10, 0);
			cat.scale(0.5);
			
			
			// hat
			
			GImage hat = new GImage("hat.png");
			add(hat, 120, 30);
			
			// necklace
			
			GImage necklace = new GImage("necklace.png");
			add(necklace, 140, 200);
			
			// blunt
			
			GImage ciggy = new GImage("ciggy.png");
			add(ciggy, 270, 220);
			ciggy.scale(0.7);
			
			// turtles
			GTurtle turtle = new GTurtle();
			add(turtle, 220, 190);
			
			GTurtle turtle1 = new GTurtle();
			add(turtle1, 290, 160);
			
			// thug life
			
			GImage thugLife = new GImage("thug-life.png");
			add(thugLife, 80, 220);
			thugLife.scale(0.5);
			
			// key objects 
			
			GImage key = new GImage("key.png");
			add(key, 450, 0);
			
			GImage key1 = new GImage("key1.png");
			add(key1, 480, 0);
			
			GImage key2 = new GImage("key2.png");
			add(key2, 508, 0);
			
			GImage key3 = new GImage("key3.png");
			add(key3, 535, 0);
			
			GImage key4 = new GImage("key4.png");
			add(key4, 565, 0);
			
			GImage key5 = new GImage("key5.png");
			add(key5, 595, 0);
			
			GImage key6 = new GImage("key6.png");
			add(key6, 625, 0);
			
			
			// vertical speed variables
			
			int dy = 1;
			
			int dy1 = 2;
			
			int dy2 = 3;
			
			int dy3 = 4;
			
			int dy4 = 5;
			
			int dy5 = 6;
			
			int dy6 = 7;
			
			
			while (true) {
				
				key.move(0, dy);
				key1.move(0, dy1);
				key2.move(0, dy2);
				key3.move(0, dy3);
				key4.move(0, dy4);
				key5.move(0, dy5);
				key6.move(0, dy6);
				
				turtle.right(100);
				turtle1.right(100);
				
				
				
				
				
				
				if (key.getY() <0 || key.getY() > 390) {
					dy = -dy;
				}
				
				if (key1.getY() <0 || key1.getY() > 390) {
					dy1 = -dy1;
				}

				if (key2.getY() <0 || key2.getY() > 390) {
					dy2 = -dy2;
				}
				
				if (key3.getY() <0 || key3.getY() > 390) {
					dy3 = -dy3;
				}

				if (key4.getY() <0 || key4.getY() > 390) {
					dy4 = -dy4;
				}

				if (key5.getY() <0 || key5.getY() > 390) {
					dy5 = -dy5;
				}

				if (key6.getY() <0 || key6.getY() > 390) {
					dy6 = -dy6;
				}
				
	
					
				pause(5);
			
				
			}
			
			
			
		
			}
			
			

		
	
		
		
		
		
		
		
		
		
		
	}
