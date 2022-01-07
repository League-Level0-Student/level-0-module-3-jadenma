
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Random ran = new Random();
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		while (true) {
		rob.penDown();
		rob.setSpeed(100);
		int sides = 0;
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with? (only colors of the rainbow, and please type in all lowercase)");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if (color.equalsIgnoreCase("orange")) {
			rob.setPenColor(255, 125, 0);
		}
		else if (color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(255, 255, 0);
		}
		else if (color.equalsIgnoreCase("green")) {
			rob.setPenColor(0, 255, 0);
		}
		else if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if (color.equalsIgnoreCase("purple")) {
			rob.setPenColor(255, 0, 255);
		}
        //6. If the user doesn't enter anything, choose a random color
		else if (color.equalsIgnoreCase("")) {
			rob.setPenColor(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
		}
		else {
			JOptionPane.showMessageDialog(null, "What the heck! That is not a color of the rainbow. Maybe try looking at the intructions next time.");
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		while (sides < 8) {
			rob.move(100);
			rob.turn(45);
			sides++;
		}
		}
	}
}
