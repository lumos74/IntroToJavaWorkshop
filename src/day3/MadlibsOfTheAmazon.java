package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {
		String adj;
		String liquid;
		String bodyPart;
		String verb;
		String place;
		adj=JOptionPane.showInputDialog("Type in an adjective: ");
		liquid=JOptionPane.showInputDialog("Type in a liquid: ");
		bodyPart=JOptionPane.showInputDialog("Type in a body part: ");
		verb=JOptionPane.showInputDialog("Type in a verb: ");
		place=JOptionPane.showInputDialog("Type in a place: ");
		JOptionPane.showMessageDialog(null,"You mad lib is...Pirahnas are more " +adj
				+" during the day, so cross the river \n at night. Pirahnas are attracted to fresh " + liquid+ " "
				+ " and will most likely take a bite out of \n your " + bodyPart+" if you "
				+ verb+". Whatever you do, if you have an open wound, \ntry to find another way to get back to the "
				+place);
		
	}
}

