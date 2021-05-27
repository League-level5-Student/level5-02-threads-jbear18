package _01_Olympic_Rings;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(500,300, "mini");
		Robot two = new Robot(600,300, "mini");
		Robot three = new Robot(700,300, "mini");
		Robot four = new Robot(550, 375, "mini");
		Robot five = new Robot(650, 375, "mini");
		
		
		Thread r1 = new Thread(()->{
			one.setSpeed(20);
			one.setPenColor(Color.BLUE);
			one.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				one.penUp();
				one.turn(4);
				one.penDown();
				one.move(4);
				
				counter ++;
			}
			});
		
		Thread r2 = new Thread(()->{
			two.setSpeed(20);
			two.setPenColor(Color.BLACK);
			two.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				two.penUp();
				two.turn(4);
				two.penDown();
				two.move(4);
				
				counter ++;
			}
		});
		
		
		
		Thread r3 = new Thread(()->{
			three.setSpeed(20);
			three.setPenColor(Color.RED);
			three.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				three.penUp();
				three.turn(4);
				three.penDown();
				three.move(4);
				
				counter ++;
			}
		});
		
		Thread r4 = new Thread(()->{
			four.setSpeed(20);
			four.setPenColor(Color.YELLOW);
			four.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				four.penUp();
				four.turn(4);
				four.penDown();
				four.move(4);
				
				counter ++;
			}
		});
		
		
		Thread r5 = new Thread(()->{
			five.setSpeed(20);
			five.setPenColor(Color.GREEN);
			five.penUp();
			
			int counter = 0;
			while(counter <= 90) {
				five.penUp();
				five.turn(4);
				five.penDown();
				five.move(4);
				
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

