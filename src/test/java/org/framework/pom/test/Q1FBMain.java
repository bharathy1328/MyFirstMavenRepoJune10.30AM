package org.framework.pom.test;

import java.io.IOException;

public class Q1FBMain extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String url = getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		String loc="C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Input\\DailyPractice.xlsx";
		insertType(new Q1FBPomBase().getLstTxtValues().get(0), getData(loc, "Sheet1",0,0));
		Thread.sleep(2000);
		insertType(new Q1FBPomBase().getLstTxtValues().get(1), getData(loc, "Sheet1",0,2));
		Thread.sleep(2000);
		
		quitBrowser();
	}
}
