package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot x = new Robot();
		
		x.penDown();
		x.setPenColor(150, 50, 5);
		x.moveTo(500, 552);
		x.turn(270);
		x.move(50);
		x.turn(270);
		x.sparkle();
		x.setPenColor(0,180, 245);
		x.move(30);
		x.turn(89);
		x.hide();
		x.move(222);
		x.turn(90);
		x.move(30);
		x.turn(90);
		x.penUp();
		x.move(222);
		x.penUp();
		
		
	}
}

