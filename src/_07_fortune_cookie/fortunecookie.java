package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You're going to get a million dollars!");
		}
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You're going to find the love of your life!");
		}
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You're going to get a free Ferrari!");
		}
		if(rand == 3) {
			JOptionPane.showMessageDialog(null,"You're going to get a new mansion!");
		}
		if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You're going to get nothing!");
		}
	}
}
