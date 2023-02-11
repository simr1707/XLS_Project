package Practice;

import data.Xls_Reader;

public class ReadWriteExcelFileTest {

	public static void main(String[] args) {
		Xls_Reader d = new Xls_Reader("C:\\SeleniumTesting\\testing\\NikulTest.xlsx");
		System.out.println(d.getCellData("Data1", 1, 2));
		System.out.println(d.getCellData("Data1", "Name", 2));
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 8 , "Simran");
		
		System.out.println(d.getCellData("Data1", "Name", 8 ));
		
		

	}

}
