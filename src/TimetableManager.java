import java.util.*;
import java.util.ArrayList;

public class TimetableManager{
	ArrayList<Timetable> Timetables = new ArrayList<Timetable>();
	Scanner input;
	TimetableManager(Scanner input){
		this.input= input;
	}
	
	public void addTimetable() {
		Timetable timetable = new Timetable();
		System.out.print("Subject: ");
		timetable.subject = input.next();
		System.out.print("Professor: ");
		timetable.name = input.next();
		System.out.print("When: ");
		timetable.time = input.next();
		System.out.print("A professor's email address: ");
		timetable.email = input.next();
		System.out.print("A professor's phone number: ");
		timetable.phone = input.next();
		Timetables.add(timetable);
	}


	public void deleteTimetable() {
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		int index = -3;
		for(int i = 0; i<Timetables.size(); i++) {
			if(Timetables.get(i).subject.equals(timetablesubject)) {
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
			if(timetable.subject.equals(timetablesubject)) {
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
						timetable.subject = input.next();
					}
					else if(num == 2) {
						System.out.print("Professor: ");
						timetable.name = input.next();
					}
					else if(num == 3) {
						System.out.print("when: ");
						timetable.time = input.next();
					}
					else if(num == 4) {
						System.out.print("A professor's email address: ");
						timetable.email = input.next();
					}
					else if(num == 5) {
						System.out.print("A professor's phone number: ");
						timetable.phone = input.next();
					}
					else{
						continue;
					} //if 场
				}	//while 场
						break;
			} //if 场
		} //for 场
} 
	public void viewTimetables(){
		for(int i = 0; i<Timetables.size(); i++) {
			System.out.println("**Information**");
			Timetables.get(i).printInfo();
		}
	}		
}
		