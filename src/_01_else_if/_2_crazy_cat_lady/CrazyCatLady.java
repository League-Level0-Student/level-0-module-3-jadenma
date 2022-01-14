
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String catsAsString = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
		int numOfCats = Integer.parseInt(catsAsString);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (numOfCats >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		else if (numOfCats > 0 && numOfCats < 3) {
			playVideo("youtu.be/wf_IIbT8HGk");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		else if (numOfCats == 0) {
			playVideo("youtu.be/ZJT9CeEhM10");
		}
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		JOptionPane.showMessageDialog(null, "Video is not working " + videoURL);
//		try {
//			URI uri = new URI(videoURL);
//			java.awt.Desktop.getDesktop().browse(uri);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}

