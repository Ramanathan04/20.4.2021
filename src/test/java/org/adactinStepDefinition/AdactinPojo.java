package org.adactinStepDefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo extends BaseClass {
	public AdactinPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement login;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy (id="login")
	private WebElement ClkLogin;
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement roomNum;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy  (id="datepick_out")
	private WebElement checkOut;
	@FindBy(id = "Submit")
	private WebElement search;
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	@FindBy(id="continue")
	private WebElement continu;
	@FindBy(id = "first_name")
	private WebElement fstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	@FindBy(id = "book_now")
	private WebElement book;
	@FindBy(id="order_no")
	private WebElement ordNum;
	@FindBy(xpath = "//h4[text()='About Adactin']")
	private WebElement scrlDown;
	@FindBy (id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
//**************************************************************************************
	
	public WebElement getScrlDown() {
		return scrlDown;
	}
	public WebElement getOrdNum() {
		return ordNum;
	}
	public WebElement getFstName() {
		return fstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getContinu() {
		return continu;
	}
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNum() {
		return roomNum;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClkLogin() {
		return ClkLogin;
	}
	

}
