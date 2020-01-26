package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        int rand = new Random().nextInt(5);
        if (rand == 0) {
        	JOptionPane.showMessageDialog(null, "A fresh start will put you on your way.");
        }
        else if (rand == 1) {
        	JOptionPane.showMessageDialog(null, "A lifetime friend shall soon be made.");
        }
        else if (rand == 2) {
        	JOptionPane.showMessageDialog(null, "A lifetime of happiness lies ahead of you.");
        }
        else if (rand == 3) {
        	JOptionPane.showMessageDialog(null, "A pleasant surprise is waiting for you.");
        }
        else if (rand == 4) {
        	JOptionPane.showMessageDialog(null, "A dubious friend may be an enemy in camouflage.");
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "WOOHOO!");
		// TODO Auto-generated method stub
		
	}
}
