package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String myName=JOptionPane.showInputDialog("What is your name? ");
		JOptionPane.showMessageDialog(null,"Hello, "+myName+"!" );
	}
	public Greeter() {
		
	}

}
