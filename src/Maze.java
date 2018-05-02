

import java.util.Random;

import javax.swing.JOptionPane;

public class Maze {
	//Room 1	
	public static void Room1() {
		String []choice = new String[] {
				"Left Room", "Right Room"
		};
		
		JOptionPane.showMessageDialog(null, "You feel like someone... or something is watching you.\n"
				+ "You are met with a room with a,\n"
				+ "green couch, and 2 blue chairs,\n"
				+ "in the middle the big grandfather clock is displaying 12:30");
		
		
		
		int input = JOptionPane.showOptionDialog(null, "What room should you go through?",
				"Room?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		 if (input == 0) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Left");
			  Room2();
		 }
		 
		 if (input == 1) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Right");
			 Room3();
		 }
	}
	//Room 2
	public static void Room2() {
		String []choice = new String[] {
				"Left Room", "Right Room"
		};
		
		JOptionPane.showMessageDialog(null, "You feel a light tap on your shoulder.\n"
				+ "You are met with a room with a,\n"
				+ "purple night stand, and a red bed,\n"
				+ "in the middle the big grandfather clock is displaying 12:30");
		
		
		
		int input = JOptionPane.showOptionDialog(null, "What room should you go through?",
				"Room?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		 if (input == 0) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Left");
			  Room1();
		 }
		 
		 if (input == 1) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Right");
			 Room3();
		 }
	}
	//Room 3
	public static void Room3() {
		String []choice = new String[] {
				"Left Room", "Right Room"
		};
		
		JOptionPane.showMessageDialog(null, "You hear a loud scream.\n"
				+ "You are met with a room with a,\n"
				+ "yellow bookshelve, and a cyan cofee table,\n"
				+ "in the middle the big grandfather clock is displaying 12:30");
		
		
		
		int input = JOptionPane.showOptionDialog(null, "What room should you go through?",
				"Room?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		 if (input == 0) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Left");
			  Room4();
		 }
		 
		 if (input == 1) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Right");
			 Room2();
		 }
	}
	//Room 4
	public static void Room4() {


		String []choice = new String[] {
				"Go Back", "Try Your Odds"
		};
		
		JOptionPane.showMessageDialog(null, "You are in the Final Room.\n"
				+ "You can try your odds and see if you make it out,\n"
				+ "If you don't make it out you will die.\n"
				+ "In the middle the big grandfather clock is displaying 12:30");
		
		
		
		int input = JOptionPane.showOptionDialog(null, "What room should you go through?",
				"Room?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		 if (input == 0) {
			 
			 JOptionPane.showMessageDialog(null, "You go back");
			  Room3();
		 }
		 
		 if (input == 1) {
			 
			 JOptionPane.showMessageDialog(null, "You test your odds");
			 
			 int randomEnds = new Random().nextInt(2);
				
				if(randomEnds==0) {
					Victory();
				}
				else {
					
					Death();
					
				}
				
		 }	
	}
	//Victory
	public static void Victory() {
		JOptionPane.showMessageDialog(null, "Good job, You won!");
	}
	//Death
	public static void Death() {
		int randomDeaths = new Random().nextInt(3);
		
		String []randomDeath = new String[] {
				"Cat", "Psychopath", "Tide Pod"
		};
		JOptionPane.showMessageDialog(null, "But you die from a " + randomDeath[randomDeaths] + "!");
		
	}
	public static void main(String[] args) {
		
		
	
		//Welcome to the maze
		String name = JOptionPane.showInputDialog("Hello, what is your name?");
		JOptionPane.showMessageDialog(null, 
				"You are trapped in a house that is said to be huanted,\n"
				+ "Sadly the house is very large like a maze.\n"
				+ "You must find a way out.\n"
				+ "Each room has 2 doors leading to a new room.");
		
		String []choice = new String[] {
				"Left Room", "Right Room"
		};
		 int input = JOptionPane.showOptionDialog(null, "What room should you go through?",
				"Room?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		 if (input == 0) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Left");
			  Room3();
		 }
		 
		 if (input == 1) {
			 
			 JOptionPane.showMessageDialog(null, "You chose Right");
			 Room2();
		 }
	}
}
