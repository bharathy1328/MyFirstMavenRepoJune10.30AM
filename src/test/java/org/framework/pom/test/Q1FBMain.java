package org.framework.pom.test;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Q1FBMain extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class-->Driver Config");
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String url = getCurrentUrl();
		System.out.println(url);
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	private void test1() throws IOException {
		System.out.println("Test1-->FaceBook Login");
		String loc="C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Input\\DailyPractice.xlsx";
		insertType(new Q1FBPomBase().getLstTxtValues().get(0), getData(loc, "Sheet1",0,0));
		
		insertType(new Q1FBPomBase().getLstTxtValues().get(1), getData(loc, "Sheet1",0,2));
		
	}
	@Test
	private void test2() {
		System.out.println("Test2-->");

	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	private void afterClass() {
		quitBrowser();
	}
	
		
}
