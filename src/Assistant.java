import java.util.Scanner;

public class Assistant extends Timetable {
	protected String Assistantemail;
	protected String Assistantphone;
	
	public Assistant(TimetableKind kind) { 
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Subject: ");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("Professor: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("When: ");
		String time = input.next();
		this.setTime(time);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Is this class with the Assistant professor?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				System.out.print("The Assistant Professor:  " );
				String professor = input.next();
				this.setPhone(professor);
				
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setPhone("");
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
				System.out.print("Tel :  " );
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
			System.out.print("Do you have the assistant professor's email address?? (Yes or No)" );
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {
				System.out.print("Email Address: " );
				String email = input.next();
				this.setEmail(email);
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
		String ekind ="none";
		switch(this.kind) {
		case FieldLecture:
			ekind = "Face to Face";
			break;
		case Elearning:
			ekind = "Online class";
			break;
		case Assistant:
			ekind = "Lecture with the assistant professor";
			break;
		default:
		}
		System.out.println("kind: " + ekind);
		System.out.println("Subject: " + subject);
		System.out.println("Professor: " + name);
		System.out.println("When: " + time);
		System.out.println("Assistant professor's phone: " + phone);
		System.out.println("Assistant professor's phone: " + phone);
		System.out.println("Assistant professor's Email address: : " + email);
		System.out.println("");
	}
		
}
