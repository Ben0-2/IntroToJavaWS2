package Day3JavaWorkshop;

import javax.swing.JOptionPane;      

public class DialogThingy {
	public static void main(String[] args) {
		//String Answer= JOptionPane.showInputDialog("Hi, my name is Jeff, what is yours?");
//JOptionPane.showMessageDialog(null, "That's cool " + Answer);
//JOptionPane.showInputDialog("How old are you?");
//JOptionPane.showInputDialog("Do you want to hear a joke?");
//JOptionPane.showInputDialog("I forgot it, sorry!");
	String Answer= JOptionPane.showInputDialog("Peter Pn");
	JOptionPane.showMessageDialog(null, "Peter " + Answer);
	String Answer2= JOptionPane.showInputDialog("Peter Pn verb");
    JOptionPane.showMessageDialog(null, "Peter " + Answer + " " + Answer2);
    String Answer3= JOptionPane.showInputDialog("Peter Pn verb a pack of pickled n");
    JOptionPane.showMessageDialog(null, "Peter " + Answer +" "  + Answer2 + " " + "a pack of pickled " + Answer3);
	JOptionPane.showInputDialog("Thanks for playing simple tongue twisters as Mad Libs");
	JOptionPane.showMessageDialog(null, "you're welcome! it feels good to be appreciated :)");
	}
}
