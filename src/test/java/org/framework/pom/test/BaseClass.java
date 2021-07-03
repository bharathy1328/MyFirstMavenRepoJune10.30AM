package org.framework.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void insertType(WebElement ele, String str) {
		ele.sendKeys(str);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
//	public String ddSelect(WebElement ele) {
//		return select(ele);	
//	}
	public void selectByIndex() {
		
	}
	public static String getTitle() {
		return driver.getTitle();
	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	
	
	public static String getData(String loc,String str,int row, int cell) throws IOException {
		File f=new File(loc);
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet(str);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value=null;
		if (cellType==1) {
			value = c.getStringCellValue();
			System.out.println(value);
		}
		else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat simpDate=new SimpleDateFormat("MM/DD/YY");
				value = simpDate.format(dateCellValue);
			}
			else {
				double numCellValue = c.getNumericCellValue();
				long l=(long) numCellValue;
				value=String.valueOf(l);
			}
		}
		return value;
	}
}
