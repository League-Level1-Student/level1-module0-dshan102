package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot("mini");
		rob.setX(50);
		rob.setY(600);
		rob.penDown();
		rob.setSpeed(75);
		
		house(rob,"small","red");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"small","blue");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"small","purple");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"medium","red");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"medium","blue");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"medium","purple");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"large","red");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"large","blue");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		house(rob,"large","purple");
		rob.turn(270);
		rob.setPenColor(0,255,0);
		rob.move(25);
		rob.turn(270);
		
		
		
	}
public void house(Robot rob, String height, String color) {
	int iheight=0;
	
	if(color.equals("red")) {
		rob.setPenColor(255,0,0);
	}
	else if (color.equals("blue")) {
		rob.setPenColor(0,0,255);
	}
	else if (color.equals("purple")) {
		rob.setPenColor(255,0,255);
	}
	
	if(height.equals("small")) {
		iheight = 60;
		rob.move(iheight);
		drawFlatRoof(rob);
		rob.move(iheight);
	}
	else if(height.equals("medium")) {
		iheight = 120;
		rob.move(iheight);
		drawFlatRoof(rob);
		rob.move(iheight);
	}
	else if(height.equals("large")) {
		iheight = 250;
		rob.move(iheight);
		drawPointyRoof(rob);
		rob.move(iheight);
	}

		


	}
public void drawPointyRoof(Robot robby) {
	robby.turn(45);
	robby.move(12);
	robby.turn(90);
	robby.move(12);
	robby.turn(45);
}
public void drawFlatRoof(Robot robbb) {
	robbb.turn(90);
	robbb.move(25);
	robbb.turn(90);
}
}

