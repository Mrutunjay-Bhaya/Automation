package Apachi_poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readwritedata {

	public static void main(String[] args) throws Throwable {
		// read excel path
		FileInputStream fi = new FileInputStream("E://test data.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		// get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		// count no of rows
		int rc = ws.getLastRowNum();
		System.out.println("No of rows::" + rc);
		// iterate all rows
		for (int i = 1; i <= rc; i++) {
			// print all rows first cell data
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			// print all rows second cell data
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username + "   " + password);
			// write some text into results cell
			ws.getRow(i).createCell(2).setCellValue("Cell Is Created");
		}
		// close file reading
		fi.close();
		FileOutputStream fo = new FileOutputStream("E://Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

		
		
	}

}
