package _10_cuteness_tv;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener{
JButton button1 = new JButton("Ducks");
JButton button2 = new JButton("Frog");
JButton button3 = new JButton("Fluffy Unicorns");
public static void main(String[] args) {
	new Cuteness_tv().createButtons();
}

private void createButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button1);
	button1.addActionListener(this);
	frame.pack();
	panel.add(button2);
	button2.addActionListener(this);
	frame.pack();
	panel.add(button3);
	button3.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
}


void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     try {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     } catch (Exception e) {
          e.printStackTrace();
     }
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(button1==buttonPressed) {
		showDucks();
	}
	else if(button2==buttonPressed) {
		showFrog();
	}
	else if(button3==buttonPressed) {
		showFluffyUnicorns();
	}
	
}
	
}


