package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class TimetableAdder extends JPanel{
	WindowFrame frame;
	
	public TimetableAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelsubject = new JLabel("Subject: ", JLabel.TRAILING);
		JTextField fieldsubject = new JTextField(10);
		labelsubject.setLabelFor(fieldsubject);
		panel.add(labelsubject);
		panel.add(fieldsubject);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelTime = new JLabel("When: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);

		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);

		JLabel labelPhone = new JLabel("Phone: ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);

		panel.add(new JButton("save"));
		panel.add(new JButton("Cancel"));

		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}

}
