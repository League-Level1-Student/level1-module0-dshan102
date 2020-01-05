package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot();
		rob.setX(0);
		rob.setY(0);
		for(int i=0; i<3; i++) {
			rob.move(100);
		}
	}
}
