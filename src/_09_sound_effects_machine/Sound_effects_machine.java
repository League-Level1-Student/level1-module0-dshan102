package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_effects_machine implements ActionListener{
	JButton button1 = new JButton("Sound 1");
	JButton button2 = new JButton("Sound 2");
	JButton button3 = new JButton("Sound 3");
	public static void main(String[] args) {
		new Sound_effects_machine().createButtons();
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
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(button1==buttonPressed) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if(button2==buttonPressed) {
			playSound("Service_Bell.wav");
		}
		else if (button3==buttonPressed) {
			playSound("van-sliding-door.wav");
		}
		
	}
}
