import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		TimetableManager timetablemanager = new TimetableManager(input);

		selectMenu(input, timetablemanager);
	}

	public static void selectMenu(Scanner input, TimetableManager timetablemanager) {
		int num = -1;
		while(num != 6) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					timetablemanager.addTimetable();
					break;
				case 2:
					timetablemanager.deleteTimetable();
					break;
				case 3:
					timetablemanager.editTimetable();
					break;
				case 4:
					timetablemanager.searchTimetables();
					break;
				case 5:
					timetablemanager.viewTimetables();
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
}