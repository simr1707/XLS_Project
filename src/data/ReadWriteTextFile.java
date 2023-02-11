package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {
	public static void main(String[] args) throws IOException {
		//create new text file
		File f = new File("C:\\SeleniumTesting\\testing\\temp.txt");
		f.createNewFile();
		
		//write into TextFile
		FileWriter fw = new FileWriter("C:\\SeleniumTesting\\testing\\temp.txt");
		BufferedWriter out = new BufferedWriter(fw);
		out.write("This is First Line");
		out.newLine();
		out.write("This is second Line");
		out.newLine();
		out.write("This is third Line");
		out.newLine();
		out.write("This is fourth Line");
		out.newLine();
		out.write("This is Fith Line");
		out.flush();
		out.close();
		
		//Read from a Text File
		FileReader fr = new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
		/*
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		*/
		
		String x;
		int i =0;
		while((x=rd.readLine())!= null) {
		System.out.println(x);
		i++;
		}
		System.out.println("Total number of lines: "+ i);
		rd.close();
	}

}
