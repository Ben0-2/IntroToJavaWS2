package Day3JavaWorkshop;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		JOptionPane.showInputDialog("Let us do a quiz");
		JOptionPane.showMessageDialog(null,
				"Just Make Sure to unabbreviate everything.Or else, you will not get points for your answers");
		int x = 0;
		String CorrectAnswer = "2";
		String Answer = JOptionPane.showInputDialog("What is 1+1?");
		if (CorrectAnswer.equalsIgnoreCase(Answer)) {
			x += 1;
		}
		String CorrectAnswer2 = "Shanghai";
		String Answer2 = JOptionPane.showInputDialog("What is the most populous city in the world?");
		if (CorrectAnswer2.equalsIgnoreCase(Answer2)) {
			x += 1;
		}
		String CorrectAnswer3 = "The Great Wall Of China";
		String Answer3 = JOptionPane.showInputDialog("What is the longest wall in the world?");
		if (CorrectAnswer3.equalsIgnoreCase(Answer3)) {
			x++;
		}
		String CorrectAnswer4 = "Washington District Of Columbia";
		String Answer4 = JOptionPane.showInputDialog("What is the Capital of the USA?");
		if (CorrectAnswer4.equalsIgnoreCase(Answer4)) {
			x = x + 1;
        String CorrectAnswer5 = "6";
		
		}
		JOptionPane.showMessageDialog(null, "u got " + x + " " + "out of 4 possible points");
		if (x < 2) {
			JOptionPane.showMessageDialog(null, "You suck at this.Sorry!");
		}
		if (x == 3) {
			JOptionPane.showMessageDialog(null, "Pretty good.");
		}
		if (x == 4) {
			JOptionPane.showMessageDialog(null, "Amazing! You're a pro!");
		}
	}
}