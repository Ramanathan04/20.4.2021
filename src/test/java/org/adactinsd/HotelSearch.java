package org.adactinsd;

import org.adactinStepDefinition.AdactinPojo;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSearch extends BaseClass{
	public HotelSearch() {
		PageFactory.initElements(driver, this);
	}
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
	@FindBy (id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotels() {
		return hotels;
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
	public WebElement getSearch() {
		return search;
	}
	@FindBy(id = "Submit")
	private WebElement search;
	
	public void hotelSearch(String text1,String text2,String text3,String text4,String text5,String text6,String text7,String text8) {
		implicitlyWait();
		HotelSearch a=new HotelSearch();
		Select s = new Select(a.getLoc());
		s.selectByVisibleText(text1);
		Select s1 = new Select(a.getHotels());
		s1.selectByVisibleText(text2);
		Select s2 = new Select(a.getRoomType());
		s2.selectByVisibleText(text3);
		Select s3 = new Select(a.getRoomNum());
		s3.selectByVisibleText(text4);
		a.getCheckIn().clear();
		fill(a.getCheckIn(), text5);
		a.getCheckOut().clear();
		fill(a.getCheckOut(), text6);
		Select s4=new Select(a.getAdultRoom());
		s4.selectByVisibleText(text7);
		Select s5=new Select(a.getChildRoom());
		s5.selectByVisibleText(text8);
		a.getSearch().click();
	}
	

}
