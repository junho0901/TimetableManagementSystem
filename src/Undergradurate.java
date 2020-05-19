import java.util.Scanner;

public abstract class Undergradurate extends Timetable {

	public Undergradurate(TimetableKind kind) { 
		super(kind);
	}

	public abstract void getUserInput(Scanner input);


	public void printInfo() {
		String ekind = getKindString();
		System.out.println("kind: " + ekind);
		System.out.println("Subject: " + subject);
		System.out.println("Professor: " + name);
		System.out.println("when: " + time);
		System.out.println("A professor's email: " + email);
		System.out.println("A professor's phone number: " + phone);
		System.out.println("");
	}

	public void setTimewithYN(Scanner input) {
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
	}

}