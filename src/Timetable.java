import java.util.*;
public class Timetable {

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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
		System.out.println("when: " + time);
		System.out.println("A professor's email: " + email);
		System.out.println("A professor's phone number: " + phone);
		System.out.println("");
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
		
		System.out.print("A professor's email address: ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("A professor's phone number: ");
		String phone = input.next();
		this.setPhone(phone);
	}
}
