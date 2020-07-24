

	package _10_cuteness_tv;
	import java.applet.AudioClip;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Random;

	import javax.swing.JApplet;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	public class cutenesstv implements ActionListener {
	public static void main(String[] args) {
		

		
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
}