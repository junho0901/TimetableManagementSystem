import java.util.Scanner;

public class Elearning extends Timetable {

	public Elearning(TimetableKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject: ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("Professor: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Is this lecture in real-time video?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				System.out.print("When is the class time??" );
				String time = input.next();
				this.setTime(time);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setTime("");
				break;
			}
			else {
			}
		}	
		
		System.out.print("A professor's email address: ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("A professor's phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}	
}
