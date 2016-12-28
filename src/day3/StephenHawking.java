package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
	public static void main(String[] args) {
		
	String someWords;
		for(int i=0; i<10; i++){
			
	
			someWords = JOptionPane.showInputDialog("Type in what you want to say: ");
			speak(someWords);
	}
	}
	
	static void speak(String words) {
		try {
		
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
