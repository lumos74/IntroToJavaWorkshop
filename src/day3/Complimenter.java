package day3;

import javax.swing.JOptionPane;

public class Complimenter {
	public static void main(String[] args) {
		String Name=JOptionPane.showInputDialog("What is your name? ");
				JOptionPane.showMessageDialog(null, "You look nice today, "+Name+"!");
				JOptionPane.showMessageDialog(null,"I hope you are having a great day, "+Name+"!");
	}
	public Complimenter() {
		// TODO Auto-generated constructor stub
	}

}
