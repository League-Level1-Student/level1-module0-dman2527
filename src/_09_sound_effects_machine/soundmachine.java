package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class soundmachine implements ActionListener {
	JButton button = new JButton();
	JButton button1 = new JButton();
	public void showButton() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setVisible(true);
        button.setText("Sawing Wood");
        panel.add(button);
        
        button.addActionListener(this);
        button1.setText("HI");
        panel.add(button1);
        button1.addActionListener(this);
        frame.add(panel);
        frame.pack();
   }
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if(buttonPressed == button1) {
			playSound("hi");
		}
		
	}
}
