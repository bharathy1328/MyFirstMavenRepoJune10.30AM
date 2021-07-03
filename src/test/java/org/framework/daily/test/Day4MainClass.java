package org.framework.daily.test;

import java.io.IOException;

public class Day4MainClass extends Day4BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver();
		launchUrl("http://adactinhotelapp.com/");
		maximizeWindow();
		String title = getTitle();
		System.out.println(title);
		String url = getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		String loc="C:\\Users\\BALAJI RAJENDRAN\\eclipse-workspace\\FrameWorkDailyClass\\Input\\AdactinHotel.xlsx";
		Thread.sleep(3000);
		insertType(new Day6PomBase().getLstTxtValues().get(0), getData(loc, "Login", 0, 1));
		Thread.sleep(3000);
		insertType(new Day6PomBase().getLstTxtValues().get(1), getData(loc, "Login", 1, 1));
		Thread.sleep(3000);
		click(new Day6PomBase().getBtnLogin());
		
//		insertType(new Day6PomBase().setDdLocations(ddLocations), str);
		
	}
}
