import java.util.*;
import java.util.ArrayList;

public class TimetableManager{
	ArrayList<Timetable> Timetables = new ArrayList<Timetable>();
	Scanner input;
	TimetableManager(Scanner input){
		this.input= input;
	}
	
	public void addTimetable() {
		int kind = 0;
		Timetable timetable = new Timetable();
		while(kind != 1 && kind != 2) {
		System.out.println("1- Field Lecture");
		System.out.println("2- E-learning");
		System.out.println("3- Lecture With the assistant professor");		
		System.out.println("Select the number for the course between 1-3: ");
		kind = input.nextInt();
		if (kind==1) {
			timetable = new Timetable(TimetableKind.FieldLecture);
			timetable.getUserInput(input);
			Timetables.add(timetable);
			break;
			
		}
		else if(kind == 2) {
			timetable = new Elearning(TimetableKind.Elearning);
			timetable.getUserInput(input);
			Timetables.add(timetable);
			break;
		}
		else if(kind == 3) {
			timetable = new Assistant(TimetableKind.Assistant);
			timetable.getUserInput(input);
			Timetables.add(timetable);
			break;
		}
		else {
		System.out.print("Select number for the course between 1 and 2: ");
		}
	}
}

	public void deleteTimetable() {
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		int index = -3;
		for(int i = 0; i<Timetables.size(); i++) {
			if(Timetables.get(i).getSubject().equals(timetablesubject)) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			Timetables.remove(index);
			System.out.println("The subject" + timetablesubject +" is deleted");
		}
		else {
			System.out.println("The subject has not been registered");
			return;
		}
	}
	
	public void editTimetable(){
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		for(int i = 0; i<Timetables.size(); i++) {
			Timetable timetable = Timetables.get(i);
			if(timetable.getSubject().equals(timetablesubject)) {
				int num = -1;
				while(num != 6) {
					System.out.println(" ** Timetable Info edit Menu **");
					System.out.println(" 1. Edit subject ");
					System.out.println(" 2. Edit professor ");
					System.out.println(" 3. Edit time ");
					System.out.println(" 4. Edit Email adress ");
					System.out.println(" 5. Edit Phone number ");
					System.out.println(" 6. Exit");
					System.out.println(" Select one number between 1 - 6 ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Subject: ");
						String subject = input.next();
						timetable.setSubject(subject);
					}
					else if(num == 2) {
						System.out.print("Professor: ");
						String name = input.next();
						timetable.setSubject(name);
					}
					else if(num == 3) {
						System.out.print("when: ");
						String time = input.next();
						timetable.setSubject(time);
					}
					else if(num == 4) {
						System.out.print("A professor's email address: ");
						String email = input.next();
						timetable.setSubject(email);
					}
					else if(num == 5) {
						System.out.print("A professor's phone number: ");
						String phone = input.next();
						timetable.setSubject(phone);
					}
					else{
						continue;
					} //if 场
				}	//while 场
						break;
			} //if 场
		} //for 场
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
}
		