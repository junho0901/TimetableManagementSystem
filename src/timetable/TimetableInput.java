package timetable;
import java.util.Scanner;

import exception.EmailFormatException;

public interface TimetableInput {

	public String getSubject();
	
	public void setSubject(String subject);
	
	public String getName();
	
	public void setName(String name);
	
	public String getTime();
	
	public void setTime(String time);
	
	public String getEmail();
	
	public void setEmail(String email) throws EmailFormatException;
	
	public String getPhone();
	
	public void setPhone(String phone);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setTimetableSubject(Scanner input);
	
	public void setTimetableName(Scanner input);
	
	public void setTimetableTime(Scanner input);
	
	public void setTimetableEmail(Scanner input);
	
	public void setTimetablePhone(Scanner input);
}