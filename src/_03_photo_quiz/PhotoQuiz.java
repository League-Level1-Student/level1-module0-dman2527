package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Dimension;
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
quizWindow.setVisible(true);
String url = "https://shawglobalnews.files.wordpress.com/2016/04/02404656.jpg?quality=85&strip=all";
		// 2. create a variable of type "Component" that will hold your image
Component image = createImage(url);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("What show does this person come from?");
if (question .contentEquals("trailer park boys")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!");
}
	// 7. print "CORRECT" if the user gave the right answer
quizWindow.remove(image);
String image2 =  "https://img1.looper.com/img/gallery/we-now-know-the-one-time-batman-was-supposed-to-die/intro-1576009072.jpg";
Component url2 = createImage(image2);
quizWindow.add(url2);
quizWindow.pack();
String question2 = JOptionPane.showInputDialog("Who is this?");
if (question2 .contentEquals("batman")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

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
