 package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.TimetableAdder;
import gui.TimetableViewer;
import gui.WindowFrame;

public class TimetableAdderCancelListener implements ActionListener {

	WindowFrame frame;
	
	public TimetableAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
 