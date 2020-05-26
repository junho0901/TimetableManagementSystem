import java.io.Serializable;
import java.util.*;

import exception.EmailFormatException;

public abstract class Timetable implements TimetableInput, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected TimetableKind kind = TimetableKind.FieldLecture;
	protected String subject;
	protected String name;
	protected String time;
	protected String email;
	protected String phone;

	public Timetable() {
	}

	public Timetable(TimetableKind kind) { 
		this.kind = kind;
	}
	public Timetable(String subject, String name) {
		this.subject= subject;
		this.name= name;
	}
	public Timetable(String subject, String name, String time, String email, String phone) {
		this.subject= subject;
		this.name= name;
		this.time = time;
		this.email= email;
		this.phone= phone;
	}

	public Timetable(TimetableKind kind, String subject, String name, String time, String email, String phone) {
		this.kind = kind;
		this.subject= subject;
		this.name= name;
		this.time = time;
		this.email= email;
		this.phone= phone;
	}

	public TimetableKind getKind() {
		return kind;
	}
	public void setKind(TimetableKind kind) {
		this.kind = kind;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws EmailFormatException{
		if(!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public abstract void printInfo();

	public void setTimetableSubject(Scanner input) {
		System.out.print("Subject: ");
		String subject = input.next();
		this.setSubject(subject);	
	}
	public void setTimetableName(Scanner input) {
		System.out.print("Professor: ");
		String name = input.next();
		this.setName(name);
	}
	public void setTimetableTime(Scanner input) {
		System.out.print("when: ");
		String time = input.next();
		this.setTime(time);
	}
	public void setTimetableEmail(Scanner input) {
		String email ="";
		while(!email.contains("@")) {
			System.out.print("email address: ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the Email address that contains @");
			}
		}
	}
	public void setTimetablePhone(Scanner input) {
		System.out.print("phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}
	public String getKindString() {
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
		return ekind;
	}
}