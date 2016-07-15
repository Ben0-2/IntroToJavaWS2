package day4;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSays extends KeyAdapter {

	JFrame CHARIZARD = new JFrame();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	
	int points = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {

		images.put(new Integer(KeyEvent.VK_UP), "ComputerKey 2.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "ComputerKey2 2.jpg");
		images.put(new Integer(KeyEvent.VK_LEFT), "ComputerKey3 2.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "ComputerKey4 4.png");
        images.put(new Integer(KeyEvent.VK_6), "6");
		JOptionPane.showMessageDialog(null, "Press the matching key when Simon Says or press a different key");
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (simonSays == 1 && keyCode != imageIndex) {
			points++;
			speak("Correct!");
		}

		if (simonSays == 0 && keyCode == imageIndex) {
			points++;
			speak("Correct!");
		}

		if (simonSays == 0 && keyCode != imageIndex) {
			speak("Incorrect!");
			speak("You got " + points + " " + "out of " + points + 1 +"possible points! good job!");
		 
		}
		if (simonSays == 1 && keyCode == imageIndex) {
			speak("Incorrect");
			speak("You got " + points + " " + "out of " + points + 1 +"possible points! good job!");
		
		}

		
		
			
	

		CHARIZARD.dispose();

		showImage();

	}

	private void showImage() {
		CHARIZARD = new JFrame();

		simonSays = new Random().nextInt(2);

		CHARIZARD.setVisible(true);
		CHARIZARD.add(getNextRandomImage());

		CHARIZARD.setSize(1500, 1500);

		CHARIZARD.addKeyListener(this);

		if (simonSays == 0) {
			speak("Simon Says Press This Key");

		}
		if (simonSays == 1) {
			speak("Press this Key");
		}

	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSays().makeAlbum();

	}

}
