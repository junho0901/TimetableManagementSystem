package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("logging.txt");

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		TimetableManager timetableManager = getObject("timetablemanager.ser");
		if(timetableManager ==null) {
			timetableManager = new TimetableManager(input);
		}
		else {
			timetableManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(timetableManager);
		selectMenu(input, timetableManager);
		putObject(timetableManager, "timetablemanager.ser");
	}
	public static void selectMenu(Scanner input, TimetableManager timetableManager) {
		int num = -1;
		while(num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					timetableManager.addTimetable();
					logger.log("add a timetable");
					break;
				case 2:
					timetableManager.deleteTimetable();
					logger.log("delete a timetable");
					break;
				case 3:
					timetableManager.editTimetable();
					logger.log("edit a timetable");
					break;
				case 4:
					timetableManager.searchTimetables();
					logger.log("search a timetable");
					break;
				case 5:
					timetableManager.viewTimetables();
					logger.log("view a list of timetable");
				default:
					continue;
				}	
			}catch(InputMismatchException e) {
				System.out.println("Please Select the number between 1 -6");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println(" Timetable Management System Menu ***");
		System.out.println(" 1. Add Timetable ");
		System.out.println(" 2. Delete Timetable ");
		System.out.println(" 3. Edit Timetable ");
		System.out.println(" 4. Search Timetables ");
		System.out.println(" 5. View Timetables ");	
		System.out.println(" 6. Exit ");
		System.out.println(" Select one number between 1 - 6 ");
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