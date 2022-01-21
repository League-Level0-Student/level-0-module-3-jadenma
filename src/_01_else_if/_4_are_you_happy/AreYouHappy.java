package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are You Happy?");
		
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else if (happy.equalsIgnoreCase("no")) {
			String happyQuestion = JOptionPane.showInputDialog("Do you want to be happy?");
			if (happyQuestion.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else if (happyQuestion.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
		
	}
}
