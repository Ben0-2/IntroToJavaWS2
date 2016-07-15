package Day5WS;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variables in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

public class FLAMINGNINJASTAROFDOOM {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
int x= 0;
		// 1. Make a new robot, and set it's pen down.
          Robot ROBOBOT= new Robot();
		ROBOBOT.penDown();
	
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
       ROBOBOT.setSpeed(10);
		// 13. Make all the code below repeat 25 times
        while (x<24){
			// 2. Turn the robot 1/8 of a circle
		   ROBOBOT.turn(45);
			// 3. Move the robot 64 pixels
           ROBOBOT.move(64);
       	ROBOBOT.setPenColor(107, 0, 255);	
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		   ROBOBOT.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			ROBOBOT.move(flameSize);
			// 6. Turn the robot 170 degrees
			
			ROBOBOT.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			ROBOBOT.move(flameSize);
			ROBOBOT.setPenColor(0, 0, 0);
			// 8. Turn the robot 64 degrees to the right
			ROBOBOT.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			ROBOBOT.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			x+=1;																			
			
        }
			// 11. Color your ninja star like Figure 2.
		
	}

}





