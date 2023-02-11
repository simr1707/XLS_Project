package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\SeleniumTesting\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String a = prop.getProperty("browser");
		System.out.println(a);
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("url"));
		
		// to write new property
		prop.setProperty("testingtool","Selenium");
		System.out.println(prop.getProperty("testingtool"));
		
		prop.setProperty("testingtype","abc");
		System.out.println(prop.getProperty("testingtype"));
		
		// to write into the file
		FileOutputStream fo = new FileOutputStream("C:\\SeleniumTesting\\testing\\prop.properties");
		prop.store(fo, "Adding to properties files");

	}

}
