package timetable;

import java.util.Scanner;

public class FieldLecture extends Timetable{

	public FieldLecture(TimetableKind kind) { 
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setTimetableSubject(input);
		setTimetableName(input);
		setTimetableTime(input);
		setTimetableEmail(input);
		setTimetablePhone(input);
	}

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
}