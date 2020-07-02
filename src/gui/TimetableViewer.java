package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import manager.TimetableManager;
import timetable.TimetableInput;

public class TimetableViewer extends JPanel{

	WindowFrame frame;

	TimetableManager timetableManager;

	public TimetableManager getTimetableManager() {
		return timetableManager;
	}

	public void setTimetableManager(TimetableManager timetableManager) {
		this.timetableManager = timetableManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Name");
		model.addColumn("When");
		model.addColumn("Email");
		model.addColumn("Phone");

		for(int i=0; i<timetableManager.size(); i++) {
			Vector row = new Vector();
			TimetableInput ti = timetableManager.get(i);
			row.add(ti.getSubject());
			row.add(ti.getName());
			row.add(ti.getTime());
			row.add(ti.getEmail());
			row.add(ti.getPhone());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	
	}

	public TimetableViewer(WindowFrame frame, TimetableManager timetableManager) {
		this.frame = frame;
		this.timetableManager = timetableManager;	
 
		System.out.println("***" + timetableManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject");
		model.addColumn("Name");
		model.addColumn("When");
		model.addColumn("Email");
		model.addColumn("Phone");

		for(int i=0; i<timetableManager.size(); i++) {
			Vector row = new Vector();
			TimetableInput ti = timetableManager.get(i);
			row.add(ti.getSubject());
			row.add(ti.getName());
			row.add(ti.getTime());
			row.add(ti.getEmail());
			row.add(ti.getPhone());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
