package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
int score = 0;
JOptionPane.showInputDialog("A man rode his horse to a different town on Sunday. He stayed at a hotel overnight and rode back home on Sunday. How is this possible? ");
JOptionPane.showMessageDialog(null, " If you think the horses name is sunday you are Correct! That was Fantastic!");
score++;
JOptionPane.showInputDialog("What has legs but can't walk? ");
JOptionPane.showMessageDialog(null, "If you got a table then you are Correct! That was cool but can you do better?");
score++;
JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son.\r\n" + 
		"Who is the man?");  
JOptionPane.showMessageDialog(null, "If you got that the man is your son then you are Correct!  You win You did an amazing job give yourself a pat on the back! ");
score++;
JOptionPane.showMessageDialog(null, "If you got them all correct then The final score was 3 out of 3 great job!");
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

