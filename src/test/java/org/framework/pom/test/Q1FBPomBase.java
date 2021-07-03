package org.framework.pom.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q1FBPomBase extends BaseClass{
	public Q1FBPomBase() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(id="login")
	private WebElement btnLogin;
	@FindBy(xpath="//input[contains(@class,'inputtext')]")
	private List<WebElement> lstTxtValues;
	
	public List<WebElement> getLstTxtValues() {
		return lstTxtValues;
	}
	
}
