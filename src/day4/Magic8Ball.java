package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {

		int RandomVariable = new Random().nextInt(4);

		JOptionPane.showInputDialog("Ask me a question...");

		if (0 == RandomVariable) {

			JOptionPane.showMessageDialog(null, "Yes.");
		}

		if (1 == RandomVariable) {
			JOptionPane.showMessageDialog(null, "no");
		}

		if (2 == RandomVariable) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}

		if (3 == RandomVariable) {
			JOptionPane.showMessageDialog(null, "That is too hard for me");
		}

	}
}
