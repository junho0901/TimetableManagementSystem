import java.util.Scanner;

public class MenuManager {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		TimetableManager timetablemanager = new TimetableManager(input);
		 
		int num = -1;
		while(num != 6) {
			System.out.println(" Timetable Management System Menu ***");
			System.out.println(" 1. Add Timetable ");
			System.out.println(" 2. Delete Timetable ");
			System.out.println(" 3. Edit Timetable ");
			System.out.println(" 4. Search Timetables ");
			System.out.println(" 5. View Timetables ");	
			System.out.println(" 6. Exit ");
			System.out.println(" Select one number between 1 - 6 ");
			num = input.nextInt();
			if(num == 1) {
				timetablemanager.addTimetable();
			}
			else if(num == 2) {
				timetablemanager.deleteTimetable();
			}
			else if(num == 3) {
				timetablemanager.editTimetable();
			}
			else if(num == 4) {
				timetablemanager.searchTimetables();
			}
			else if(num == 5) {
				timetablemanager.viewTimetables();
			}
			else {
				continue;
			}		
		}
	}
}
