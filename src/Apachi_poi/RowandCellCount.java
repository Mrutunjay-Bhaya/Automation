package Apachi_poi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowandCellCount {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("E://test data.xlsx");
		//get work book
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("login");
		//get first row from sheet
		XSSFRow row = ws.getRow(0);
		//count number of row in sheet
		int rc=ws.getLastRowNum();
		//count no. of cell from first row
		int cc= row.getLastCellNum();
		System.out.println("no.of rows are::"+rc +""+ "no.of cell in first row::"+cc);
		
		fi.close();
		wb.close();
		
	}

}