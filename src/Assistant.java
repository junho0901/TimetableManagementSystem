import java.util.Scanner;

public class Assistant extends Timetable{
	protected String Assistantemail;
	protected String Assistantphone;
	Scanner sc = new Scanner(System.in);
	String assist;
	public Assistant(TimetableKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setTimetableSubject(input);
		setTimetableName(input);
		setTimetableTime(input);
		setTimetableEmail(input);
		setTimetablePhone(input);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Is this class with the Assistant professor?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				System.out.print("Assistant professor: ");
				assist = sc.nextLine();
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setName("");
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Do you have the assistant professor's phone number?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				setTimetablePhone(input);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setPhone("");
				break;
			}   
			else {
			}
			setTimetablePhone(input);
		}
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Do you have the assistant professor's email address?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				setTimetableEmail(input);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
	}
	public void printInfo() {
		String ekind = getKindString();
		System.out.println("kind: " + ekind);
		System.out.println("Subject: " + subject);
		System.out.println("Professor: " + name);
		System.out.println("When: " + time);
		System.out.println("Assistant professor: " + assist);
		System.out.println("Assistant professor's phone: " + phone);
		System.out.println("Assistant professor's Email address: : " + email);
		System.out.println("");
	}
}