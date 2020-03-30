import java.util.Scanner;

public class menu {
//Timetable Management Menu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=5;
		while(num!=6) {
		System.out.println("*** Timetable Management System Menu ***");
		System.out.println(" 1. Add Timetable");
		System.out.println(" 2. Delete Timetable");
		System.out.println(" 3. Edit Timetable");
		System.out.println(" 4. View Timetable");
		System.out.println(" 5. Show a menu");
		System.out.println(" 6. Exit");
		System.out.println("Select one number between 1 - 6: ");
		num= input.nextInt();
		if(num == 1) {
			addTimetable();
		}
		else if(num == 2) {
			deleteTimetable();
		}
		else if(num == 3) {
			editTimetable();
		}
		else {
			continue;
		}		
	}

}
	public static void addTimetable() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject: ");
		String subject = input.next();
		System.out.println(subject);
		System.out.print("Professor: ");
		String professor= input.next();
		System.out.println(professor);
		System.out.print("When: ");
		String when = input.next();
		System.out.println(when);
		System.out.print("Professor's email adderess: ");
		String Email = input.next();
		System.out.println(Email);
		System.out.print("Professor's phone number: ");
		String phone = input.next();
		System.out.println(phone);		
	}

	public static void deleteTimetable() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject: ");
		String subject = input.next();
	}
	
	public static void editTimetable() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject: ");
		String subject = input.next();
	}
	
	public static void viewTimetable() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject: ");
		String subject = input.next();
	}
}