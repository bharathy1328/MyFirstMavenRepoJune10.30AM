package org.framework.daily.test;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day6PomBase extends Day4BaseClass{
	public Day6PomBase() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@class,'login_input')]")
	private List<WebElement> lstTxtValues;
	public List<WebElement> getLstTxtValues() {
		return lstTxtValues;
	}
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	@FindBy(id="location")
	private List<WebElement> ddLocations;
	
	public void setDdLocations(List<WebElement> ddLocations) {
		this.ddLocations = ddLocations;
	}
	
	@FindBy(id="hotels")
	private List<WebElement> ddHotels;
	
	public void setDdHotels(List<WebElement> ddHotels) {
		this.ddHotels = ddHotels;
	}
	
	@FindBy(id="room_type")
	private List<WebElement> ddRoomType;
	
	public void setDdRoomType(List<WebElement> ddRoomType) {
		this.ddRoomType = ddRoomType;
	}
	
	@FindBy(id="room_nos")
	private List<WebElement> ddRoom;
	
	public void setDdRoom(List<WebElement> ddRoom) {
		this.ddRoom = ddRoom;
	}
	
	@FindBy(id="datepick_in")
	private WebElement txtDateIn;
	
	public WebElement getTxtDateIn() {
		return txtDateIn;
	}
		
	@FindBy(id="datepick_out")
	private WebElement txtDateOut;
	
	public WebElement getTxtDateOut() {
		return txtDateOut;
	}
	
	@FindBy(id="adult_room")
	private List<WebElement> ddAdultRoom;
	
	public void setDdAdultRoom(List<WebElement> ddAdultRoom) {
		this.ddAdultRoom = ddAdultRoom;
	}
	
	@FindBy(id="child_room")
	private List<WebElement> ddChildRoom;
	
	public void setDdChildRoom(List<WebElement> ddChildRoom) {
		this.ddChildRoom = ddChildRoom;
	}
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rbSelect;
	
	@FindBy(id="continue")
	private WebElement rbCountinue;
	
	@FindBy(id="first_name")
	private WebElement txtFname;
	
	@FindBy(id="last_name")
	private WebElement txtLname;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCardno;
	
	@FindBy(id="cc_type")
	private WebElement ddCardType;

	@FindBy(id="cc_exp_month")
	private WebElement ddExpMon;

	@FindBy(id="cc_exp_year")
	private WebElement ddExpYear;

	@FindBy(id="cc_cvv")
	private WebElement txtCvv;

	@FindBy(id="book_now")
	private WebElement btnBook;
	
	
	
	
	
	
	public WebElement getRbSelect() {
		return rbSelect;
	}
	public WebElement getRbCountinue() {
		return rbCountinue;
	}
	public WebElement getTxtFname() {
		return txtFname;
	}
	public WebElement getTxtLname() {
		return txtLname;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCardno() {
		return txtCardno;
	}
	public WebElement getDdCardType() {
		return ddCardType;
	}
	public WebElement getDdExpMon() {
		return ddExpMon;
	}
	public WebElement getDdExpYear() {
		return ddExpYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
}
