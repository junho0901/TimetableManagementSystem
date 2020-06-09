package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TimetableViewer extends JPanel{
	
	WindowFrame frame;
	
	public TimetableViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Name");
		model.addColumn("When");
		model.addColumn("Email");
		model.addColumn("Phone");


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
