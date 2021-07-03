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

public class Day3ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Input\\DailyPractice.xlsx");
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.createSheet("Data");
		
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		
		c.setCellValue("Java");
		System.out.println(c);
		
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		System.out.println("Write Done...");
		
		
	}
}
