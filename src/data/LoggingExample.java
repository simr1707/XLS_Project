package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// add log4j.jar to the project - to build the path
		// add log4j.properties files directly into the src folder
		// create the object of logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("Hello");  //System.out.println("Hello");
		print.debug("We are writing in to a log file");
		print.debug("starting the test case xyz test");
		print.debug("starting the test case xyz test1");
		

	}

}
