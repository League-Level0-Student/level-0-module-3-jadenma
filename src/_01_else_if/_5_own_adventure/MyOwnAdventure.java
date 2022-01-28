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
				else if (diveNum == 1) {
					JOptionPane.showMessageDialog(null, "You died from a lethal poison. Game Over.");
				}
			}
			else if (drink.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "You drown from staying underwater too long wondering what to do. Game Over.");
			}
		}
//swim down
		else if (firstQuestion.equalsIgnoreCase("swim down")) {
			String lake = JOptionPane.showInputDialog("You come across a lake at the bottom of the river. What do you do? Keep swimming or get out.");
			if (lake.equalsIgnoreCase("keep swimming")) {
				int lakeNum = ran.nextInt(2);
				if (lakeNum == 0) {
					String dolphin = JOptionPane.showInputDialog(null, "You find dolphin that gives you a pill. Do you eat it?");
					if (dolphin.equalsIgnoreCase(yes)) {
						JOptionPane.showMessageDialog(null, "The pill grants you immortality! You win the game!");
					}
					else if (dolphin.equalsIgnoreCase(no)) {
						JOptionPane.showMessageDialog(null, "The dolphin slaps you and you die. Game Over.");
					}
				}
				else if (lakeNum == 1) {
					JOptionPane.showMessageDialog(null, "You die from dehydration after swimming for too long. Game Over.");
				}
			}
			else if (lake.equalsIgnoreCase("get out")) {
				JOptionPane.showMessageDialog(null, "You die from hypothermia after getting out to fast. Game Over.");
			}
		}
//swim up
		else if (firstQuestion.equalsIgnoreCase("swim up")) {
			String village = JOptionPane.showInputDialog("You come across a village at the top of the river. What do you do? Go to the village or keep swimming?");
			if (village.equalsIgnoreCase("go to the village")) {
				int villageNum = ran.nextInt(2);
				if (villageNum == 0) {
					JOptionPane.showMessageDialog(null, "The village people attack you and kill you for contaminating their river water. Game Over.");
				}
				else if (villageNum == 1) {
					JOptionPane.showMessageDialog(null, "The village people think you are a river god and give you a dumpling of immortality! You win the game!");
					
				}
			}
			else if (village.equalsIgnoreCase("keep swimming")) {
				JOptionPane.showMessageDialog(null, "You die from dehydration after swimming for too long. Game Over.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You die from drowning. Game Over.");
		}
		
	}
	
}