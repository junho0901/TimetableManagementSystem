package log;

public class LoggerTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("test.txt");
		logger.log("test");

	}

}
