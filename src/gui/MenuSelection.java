package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {

	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
	
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("MenuSelection");

		JButton button1 = new JButton("Add Timetable");
		JButton button2 = new JButton("Delete Timetable");
		JButton button3 = new JButton("Edit Timetable");
		JButton button4 = new JButton("Search Timetable");
		JButton button5 = new JButton("View Timetable");
		JButton button6 = new JButton("Exit Timetable");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button5.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);

		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
