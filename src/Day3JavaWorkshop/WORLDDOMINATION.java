package Day3JavaWorkshop;
import javax.swing.JOptionPane;

public class WORLDDOMINATION {
	public static void main(String[] args) {
		String Yes= "Yes";
		// 1. Ask the user if they know how to write code.
 String Answer= JOptionPane.showInputDialog("Do u know how to write code?");
 if(Answer.equals(Yes)){
	 JOptionPane.showMessageDialog(null, "Congratulations! u will now rule the world!");
 }
 
		// 2. If they say "yes", tell them they will rule the world.
 else{
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null, "Good Luck Washing the dishes tonight. you will never succeed at life if u do not know how to write code!");
	}
}
}