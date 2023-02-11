package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFilesP {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\SeleniumTesting\\testing\\browser.properties");
		Properties prop = new Properties();
		prop.load(f);   // to load the file 
		
		// to read from the file
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("language"));
		System.out.println(prop.getProperty("defect"));
		
		// to write into properties file
		
		prop.setProperty("testername", "noname");
		FileOutputStream fo = new FileOutputStream("C:\\SeleniumTesting\\testing\\browser.properties");
		prop.store(fo, "adding tester name");
		

	}

}
