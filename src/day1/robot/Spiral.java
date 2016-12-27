package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot x= new Robot();
		x.turn(120);
		x.setSpeed(10);
		x.penDown();
		x.hide();
		for(int i=0; i<375; i++){
			x.move(i);
			x.setRandomPenColor();
			x.turn(360/5);
			x.setPenWidth(i*3);
		

		//4. Do steps 6-9 75 times

			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
		}
	}
}
