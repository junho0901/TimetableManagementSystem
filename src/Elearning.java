import java.util.Scanner;

public class Elearning extends Undergradurate{

	public Elearning(TimetableKind kind) { 
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setTimetableSubject(input);
		setTimetableName(input);
		setTimetableEmail(input);
		setTimetablePhone(input);
		setTimewithYN(input);
	}	
}