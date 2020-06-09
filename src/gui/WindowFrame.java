package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	MenuSelection menuselection;
	TimetableAdder timetableadder;
	TimetableViewer timetableviewer;		
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.timetableadder = new TimetableAdder(this);
		this.timetableviewer = new TimetableViewer(this);		
	
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
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
