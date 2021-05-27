package _02_Advanced_Robot_Race;


import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static // Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.

	boolean isRacing = true;
	
	
	public static void main(String[] args) {
		Robot one = new Robot(300,300);
		Robot two = new Robot(300,300, "mini");
		Robot three = new Robot(300,300, "batman");
		Robot four = new Robot(300, 300);
		Robot five = new Robot(300, 300, "mini");

		Thread r1 = new Thread(()->{
			one.setPenColor(Color.BLUE);
			one.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				int speed = (int) (Math.random() * 20) + 1;
				one.setSpeed(speed);
				one.penUp();
				one.turn(4);
//				one.penDown();
				one.move(20);
				
				counter ++;
			
	
				if(counter == 90) {
					isRacing = false;
				}
			}
			});
		
		Thread r2 = new Thread(()->{
			two.setPenColor(Color.BLACK);
			two.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				int speed = (int) (Math.random() * 20) + 1;
				two.setSpeed(speed);
				two.penUp();
				two.turn(4);
//				two.penDown();
				two.move(20);
				
				counter ++;
			}
		});
		
		
		
		Thread r3 = new Thread(()->{
			three.setPenColor(Color.RED);
			three.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				int speed = (int) (Math.random() * 20) + 1;
				three.setSpeed(speed);
				three.penUp();
				three.turn(4);
//				three.penDown();
				three.move(20);
				
				counter ++;
			}
		});
		
		Thread r4 = new Thread(()->{

			four.setPenColor(Color.YELLOW);
			four.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				int speed = (int) (Math.random() * 20) + 1;
				four.setSpeed(speed);
				four.penUp();
				four.turn(4);
//				four.penDown();
				four.move(20);
				
				counter ++;
			}
		});
		
		
		Thread r5 = new Thread(()->{
			five.setPenColor(Color.MAGENTA);
			five.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				int speed = (int) (Math.random() * 20) + 1;
				five.setSpeed(speed);
				five.penUp();
				five.turn(4);
//				five.penDown();
				five.move(20);
				
				counter ++;
			}
		});
		
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();

		
		
		
		

	}
	
	
}
