package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFileP {

	public static void main(String[] args) throws IOException {
		// create a new text file
		File f = new File("C:\\SeleniumTesting\\testing\\newfile.txt");
		f.createNewFile();
		
		//to write into file
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("this is the 1st line");
		bw.newLine();
		bw.write("this is the 2nd line");
		bw.newLine();
		bw.write("this is the 3rd line");
		bw.newLine();
		bw.write("this is the 4th line");
		bw.newLine();
		bw.write("this is the 5th line");
		bw.flush();  // to save into file
		bw.close();  // to close the file
		
		FileReader fr =new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
		/*
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		*/
		String x;
		while((x=rd.readLine())!= null) {
			System.out.println(x);
		}
		rd.close();
	}

}
