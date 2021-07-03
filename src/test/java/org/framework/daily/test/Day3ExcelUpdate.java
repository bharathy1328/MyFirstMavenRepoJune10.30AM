package org.framework.daily.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3ExcelUpdate {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Input\\DailyPractice.xlsx");
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		
		String cellValue = c.getStringCellValue();
		System.out.println(cellValue);
		
		if (cellValue.equalsIgnoreCase("Selenium")) {
			c.setCellValue("Bharu");
		}
		System.out.println("Updated Value "+c);
		System.out.println("Update Done...");
		
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		
	}
}
