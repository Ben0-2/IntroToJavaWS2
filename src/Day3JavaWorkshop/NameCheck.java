package Day3JavaWorkshop;

import javax.swing.JOptionPane;

public class NameCheck {
public static void main(String[] args) {
	 String Name= "GammaTron";
	 String Name2=JOptionPane.showInputDialog("What's ur name?");
	 if(Name.equals(Name2)){
		 JOptionPane.showMessageDialog(null, "That's my name too, " + Name2);
		 }
	 else{
		 
	JOptionPane.showMessageDialog(null, "Sorry, " + Name2 + ", I am sending an army to destroy u!");	 
}
	 }

}
	 

