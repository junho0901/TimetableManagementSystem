public class Timetable {
	String subject;
	String name;
	String time;
	String email;
	String phone;
	
	
	public Timetable() {
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
	public void printInfo() {
		System.out.println("Subject: " + subject);
		System.out.println("Professor: " + name);
		System.out.println("when: " + time);
		System.out.println("A professor's email: " + email);
		System.out.println("A professor's phone number: " + phone);
		System.out.println("");
	}
}
