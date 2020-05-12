import java.util.Scanner;

public interface TimetableInput {

	public String getSubject();
	public void setSubject(String subject);
	public void setName(String name);
	public void setTime(String time);
	public void setEmail(String email);
	public void setPhone(String phone);
	public void printInfo();
	public void getUserInput(Scanner input);
	public void setTimetableSubject(Scanner input);
	public void setTimetableName(Scanner input);
	public void setTimetableTime(Scanner input);
	public void setTimetableEmail(Scanner input);
	public void setTimetablePhone(Scanner input);
}
