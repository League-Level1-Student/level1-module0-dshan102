package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String squidward = "https://comicvine1.cbsistatic.com/uploads/square_medium/11132/111325030/5880105-spongebob%20squarepants%20squidward%20tentacles.jpg";

		// 2. create a variable of type "Component" that will hold your image
		Component c;

		// 3. use the "createImage()" method below to initialize your Component
		c = createImage(squidward);

		// 4. add the image to the quiz window
		quizWindow.add(c);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		String answer1 = JOptionPane.showInputDialog("Who is this?");

		// 7. print "CORRECT" if the user gave the right answer
		if(answer1.equalsIgnoreCase("squidward")) {
			System.out.println("CORRECT");
		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(c);

		// 10. find another image and create it (might take more than one line
		// of code)
		String mirror = "https://images.homedepot-static.com/productImages/adff824c-fecd-4eb5-a0a8-651a60b22219/svn/silver-finish-home-decorators-collection-vanity-mirrors-81159-64_1000.jpg";
		Component c1;
		c1 = createImage(mirror);
		// 11. add the second image to the quiz window
		quizWindow.add(c1);

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What are you looking at?");

		// 14+ check answer, say if correct or incorrect, etc.
		if(answer2.equalsIgnoreCase("computer")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
