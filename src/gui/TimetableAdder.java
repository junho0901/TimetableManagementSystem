package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.TimetableAdderCancelListener;
import listeners.TimetableAdderListener;
import manager.TimetableManager;

public class TimetableAdder extends JPanel{
	
	WindowFrame frame;
	TimetableManager timetableManager;

	public TimetableAdder(WindowFrame frame, TimetableManager timetableManager) {
		this.frame = frame;
		this.timetableManager = timetableManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelsubject = new JLabel("Subject: ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelsubject.setLabelFor(fieldSubject);
		panel.add(labelsubject);
		panel.add(fieldSubject);

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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new TimetableAdderListener(fieldSubject, fieldName, fieldTime, fieldPhone, fieldEmail, timetableManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new TimetableAdderCancelListener(frame));
		
		panel.add(labelPhone);
		panel.add(fieldPhone);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}

}
