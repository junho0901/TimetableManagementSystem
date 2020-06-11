package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;

import timetable.Assistant;
import timetable.Elearning;
import timetable.FieldLecture;
import timetable.Timetable;
import timetable.TimetableInput;
import timetable.TimetableKind;


public class TimetableManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5424447484497898978L;
	
	ArrayList<TimetableInput> Timetables = new ArrayList<TimetableInput>();
	transient Scanner input;
	
	TimetableManager(Scanner input){
		this.input= input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}

	public void addTimetable() {
		int kind = 0;
		TimetableInput timetableInput;
		while(kind <1 || kind >3) {
			try {
				System.out.println("1- Field Lecture");
				System.out.println("2- E-learning");
				System.out.println("3- Lecture With the assistant professor");		
				System.out.println("Select the number for the course between 1-3: ");
				kind = input.nextInt();
				if (kind==1) {
					timetableInput = new FieldLecture(TimetableKind.FieldLecture);
					timetableInput.getUserInput(input);
					Timetables.add(timetableInput);
					break;
				}
				else if(kind == 2) {
					timetableInput = new Elearning(TimetableKind.Elearning);
					timetableInput.getUserInput(input);
					Timetables.add(timetableInput);
					break;
				}
				else if(kind == 3) {
					timetableInput = new Assistant(TimetableKind.Assistant);
					timetableInput.getUserInput(input);
					Timetables.add(timetableInput);
					break;
				}
				else {
					System.out.print("Please Select the number between 1 and 3: ");
				}
			}		catch(InputMismatchException e) {
				System.out.println("Please Select the number between 1 -3");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteTimetable() {
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		int index = findIndex(timetablesubject);
		removefromeTimetables(index, timetablesubject);
	}

	public int findIndex(String timetablesubject) {
		int index = -3;
		for(int i = 0; i<Timetables.size(); i++) {
			if(Timetables.get(i).getSubject().equals(timetablesubject)) {
				index = i;
				break;
			}
		} return index;
	}	

	public int removefromeTimetables(int index, String timetablesubject) {
		if(index >= 0) {
			Timetables.remove(index);
			System.out.println("The subject" + timetablesubject +" is deleted");
			return 1;
		}
		else {
			System.out.println("The subject has not been registered");
			return -1;
		}
	}
	public void editTimetable(){
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		for(int i = 0; i<Timetables.size(); i++) {
			TimetableInput timetable = Timetables.get(i);
			if(timetable.getSubject().equals(timetablesubject)) {
				int num = -1;
				while(num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						timetable.setTimetableSubject(input);
						break;
					case 2:
						timetable.setTimetableName(input);
						break;
					case 3:
						timetable.setTimetableTime(input);
						break;
					case 4:
						timetable.setTimetableEmail(input);
						break;
					case 5:
						timetable.setTimetablePhone(input);
						break;
					default:
						continue;
					}
				}	//while 
				break;
			} //if 
		} //for 
	} 
	public void searchTimetables() {
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		int num = -1;
		for(int i = 0; i<Timetables.size(); i++) {
			if(Timetables.get(i).getSubject().equals(timetablesubject)) {
				num = i;
				break;
			}
		}
		if(num >= 0) {
			System.out.println("**Information***");
			Timetables.get(num).printInfo();
		}
		else {
			System.out.println("The subject has not been registered");
			return;
		}
	}

	public void viewTimetables(){
		System.out.println("# of registered Timetables: " + Timetables.size());
		for(int i = 0; i<Timetables.size(); i++) {
			System.out.println("**Information**");
			Timetables.get(i).printInfo();
		}
	}	

	public int size() {
		return Timetables.size();
	}
	
	public TimetableInput get(int index) {
		return (Timetable) Timetables.get(index);
	}
	public void showEditMenu() {
		System.out.println(" ** Timetable Info edit Menu **");
		System.out.println(" 1. Edit subject ");
		System.out.println(" 2. Edit professor ");
		System.out.println(" 3. Edit time ");
		System.out.println(" 4. Edit Email adress ");
		System.out.println(" 5. Edit Phone number ");
		System.out.println(" 6. Exit");
		System.out.println(" Select one number between 1 - 6 ");
	}
}