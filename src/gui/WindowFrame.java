package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.TimetableManager;

public class WindowFrame extends JFrame {
	TimetableManager timetableManager;
	
	MenuSelection menuselection;
	TimetableAdder timetableadder;
	TimetableViewer timetableviewer;
	
	public WindowFrame(TimetableManager timetableManager) {
		this.setSize(550, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.timetableManager = timetableManager;
		menuselection = new MenuSelection(this);
		timetableadder = new TimetableAdder(this);
		timetableviewer = new TimetableViewer(this, this.timetableManager);		
	
		this.add(menuselection);
		
		this.setVisible(true);
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public TimetableAdder getTimetableadder() {
		return timetableadder;
	}
	public void setTimetableadder(TimetableAdder timetableadder) {
		this.timetableadder = timetableadder;
	}
	public TimetableViewer getTimetableviewer() {
		return timetableviewer;
	}
	public void setTimetableviewer(TimetableViewer timetableviewer) {
		this.timetableviewer = timetableviewer;
	}
	
}
