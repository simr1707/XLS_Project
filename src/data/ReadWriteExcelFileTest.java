package data;

public class ReadWriteExcelFileTest {

	public static void main(String[] args) {
		Xls_Reader d = new Xls_Reader("C:\\SeleniumTesting\\testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1","Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1")); // 7
		
		d.setCellData("Data1", "Name", 11, "Testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		System.out.println(d.getRowCount("Data1")); //11
		
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));
		
		

	}

}
