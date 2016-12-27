package day5;
import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variable in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		Robot x = new Robot();
		x.penDown();
		x.setSpeed(10);
		for(int i=0; i<250; i++){
		x.turn(360/8);
		x.move(64);
		x.setRandomPenColor();
		x.turn(-40);
		x.move(flameSize);
		x.turn(170);
		x.move(flameSize);
		x.setRandomPenColor();
		x.turn(64);
		x.move(baseSize);
		}
		
		
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10

		// 13. Make all the code below repeat 25 times
			
			// 7. Move the robot the distance in the variable flameSize (again)
			
			// 8. Turn the robot 64 degrees to the right
			
			// 9. Move the robot the distance in the variable baseSize
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
	}

}


