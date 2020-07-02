package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import gui.TimetableViewer;
import gui.WindowFrame;
import manager.TimetableManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TimetableViewer timetableViewer = frame.getTimetableviewer();
		TimetableManager timetableManager = getObject("timetablemanager.ser");
		timetableViewer.setTimetableManager(timetableManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(timetableViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static TimetableManager getObject(String filename) {
		TimetableManager timetableManager = null;		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			timetableManager = (TimetableManager)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return timetableManager; 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timetableManager;
	}
}
