package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyOwnAdventure {
	public static void main(String[] args) {
		Random ran = new Random();
		String yes = "yes";
		String no = "no";
		String firstQuestion = JOptionPane.showInputDialog("Hi. The goal of this game is not to die. To win, you have to become immortal. You spawn in a river. What do you do, dive, swim down, swim up, or do nothing?");
//dive
		if (firstQuestion.equalsIgnoreCase("dive")) {
			String drink = JOptionPane.showInputDialog("You find a bottle of unknown liquid. Do you drink it?");
			if (drink.equalsIgnoreCase(yes)) {
				int diveNum = ran.nextInt(2);
				if (diveNum == 0) {
					JOptionPane.showMessageDialog(null, "You have gained immortality from this drink! You win the game!");
				}
				if (diveNum == 1) {
					JOptionPane.showMessageDialog(null, "You died from a lethal poison. Game Over.");
				}
			}
			if (drink.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "You drown from staying underwater too long wondering what to do. Game Over.");
			}
		}
//swim down
		if (firstQuestion.equalsIgnoreCase("swim down")) {
			String lake = JOptionPane.showInputDialog("You come across a lake at the bottom of the river. What do you do? Keep swimming or get out.");
			if (lake.equalsIgnoreCase("keep swimming")) {
				int lakeNum = ran.nextInt(2);
				if (lakeNum == 0) {
					String dolphin = JOptionPane.showInputDialog(null, "You find dolphin that gives you a pill. Do you eat it?");
					if (dolphin.equalsIgnoreCase(yes)) {
						JOptionPane.showMessageDialog(null, "The pill grants you immortality! You win the game!");
					}
					if (dolphin.equalsIgnoreCase(no)) {
						JOptionPane.showMessageDialog(null, "The dolphin slaps you and you die. Game Over.");
					}
				}
				if (lakeNum == 1) {
					JOptionPane.showMessageDialog(null, "You die from dehydration after swimming for too long. Game Over.");
				}
			}
			if (lake.equalsIgnoreCase("get out")) {
				JOptionPane.showMessageDialog(null, "You die from hypothermia after getting out to fast. Game Over.");
			}
		}
//swim up
	}
	
}