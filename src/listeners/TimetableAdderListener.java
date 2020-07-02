package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.EmailFormatException;
import manager.TimetableManager;
import timetable.FieldLecture;
import timetable.Timetable;
import timetable.TimetableInput;
import timetable.TimetableKind;

public class TimetableAdderListener implements ActionListener {
	
	JTextField fieldSubject;
	JTextField fieldName;
	JTextField fieldTime;
	JTextField fieldPhone;
	JTextField fieldEmail;
	
	TimetableManager timetableManager;
	public TimetableAdderListener(
			JTextField fieldSubject, 
			JTextField fieldName, 
			JTextField fieldTime,
			JTextField fieldPhone, 
			JTextField fieldEmail, TimetableManager timetableManager) {
		
		this.fieldSubject = fieldSubject;
		this.fieldName = fieldName;
		this.fieldTime = fieldTime;
		this.fieldPhone = fieldPhone;
		this.fieldEmail = fieldEmail; 
		this.timetableManager = timetableManager;
	} 
	
	public void actionPerformed(ActionEvent e) {
		
		TimetableInput timetable = new FieldLecture(TimetableKind.FieldLecture);
		try {
			timetable.setSubject(fieldSubject.getText());
			timetable.setName(fieldName.getText());
			timetable.setTime(fieldTime.getText());
			timetable.setPhone(fieldPhone.getText());
			timetable.setEmail(fieldEmail.getText());
			timetableManager.addTimetable(timetable);
			putObject(timetableManager, "timetablemanager.ser");
			timetable.printInfo();
		} catch (EmailFormatException e1) {		
			e1.printStackTrace();
		}	
	}
	
	public static void putObject(TimetableManager timetableManager ,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(timetableManager);
			
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
