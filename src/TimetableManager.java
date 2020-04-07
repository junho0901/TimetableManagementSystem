import java.util.Scanner;

public class TimetableManager{
	Timetable timetable;
	Scanner input;
	
	TimetableManager(Scanner input){
		this.input= input;
	}
	
	public void addTimetable() {
		timetable = new Timetable();
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
	}

	
	public void deleteTimetable() {
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		if(timetable == null) {
			System.out.println("The subject has not been registered");
			return;
		}
		if(timetable.subject == timetablesubject) {
			timetable.subject =null;
			System.out.println("The subject is deleted");
		}
		
	}
	
	public void editTimetable(){
		System.out.print("Subject: ");
		String timetablesubject = input.next();
		if(timetable.subject == timetablesubject) {
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
				System.out.print("when: ");
				timetable.time = input.next();
			}
			else if(num == 3) {
				System.out.print("Professor: ");
				timetable.name = input.next();
		
			}
			else if(num == 4) {
				System.out.print("A professor's email address: ");
				timetable.email = input.next();
			}
			else if(num == 5) {
				System.out.print("A professor's phone number: ");
				timetable.phone = input.next();
			}
			else
			{
				continue;
			}
		}
		}
	}
		public void viewTimetable()
{
			System.out.print("Subject: ");
			String timesubject = input.next();
			if(timetable.subject == timesubject) {
					timetable.printInfo();
			}
		}
	}		