package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	int length=300;
	Robot x= new Robot();

	void go() {

		drawSquare();
	}
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		x.setSpeed(100);
		x.setPenWidth(5);
		x.sparkle();
		x.setRandomPenColor();
		x.penDown();
		for(int i=0;i<4;i++){
		x.turn(90);
		x.move(length);
		x.setRandomPenColor();
		}
		x.hide();
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
