package Apachi_poi;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
    import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class HigherVersion {

		public static void main(String[] args)throws Throwable {
			//read excel path
			FileInputStream fi = new FileInputStream("D://Dummy.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Login");
		Row row = ws.getRow(0);
		int rc = ws.getLastRowNum();
		int cc =row.getLastCellNum();
		System.out.println("No of rows::"+rc+"  "+"No of cells::"+cc);
		for(int i=1;i<=rc; i++)
		{
			String username =ws.getRow(i).getCell(0).getStringCellValue();
			int password = (int)ws.getRow(i).getCell(1).getNumericCellValue();
			System.out.println(username+"   "+password);
			ws.getRow(i).createCell(2).setCellValue("pass");
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D://HigherResults.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

		
		

		}

	}

