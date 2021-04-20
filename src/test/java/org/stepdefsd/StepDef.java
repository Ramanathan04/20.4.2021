package org.stepdefsd;

import org.adactinsd.BookAHotel;
import org.adactinsd.HotelSearch;
import org.adactinsd.LoginPojo;
import org.adactinsd.SelectHotel;
import org.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass{
	
	
	@Given("enter {string} and {string}")
	public void enter_and(String name, String pass) throws InterruptedException {
		loadBrowser();
		launchUrl("https://adactinhotelapp.com/");
		max();
		LoginPojo l=new LoginPojo();
		l.Login(name, pass);
		}
	@When("select location {string}select Hotel{string} RoomType {string}Number Of Rooms{string}checkin Date{string}checkOut Date{string} AdeltsPerRoom{string} ChildrensPerRoom{string}click search button")
	public void select_location_select_Hotel_RoomType_Number_Of_Rooms_checkin_Date_checkOut_Date_AdeltsPerRoom_ChildrensPerRoom_click_search_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  HotelSearch s=new HotelSearch();
	  s.hotelSearch(string, string2, string3, string4, string5, string6, string7, string8);
	  
	}

	@When("click radio button click Continue")
	public void click_radio_button_click_Continue() throws InterruptedException {
	    SelectHotel s=new SelectHotel();
	    s.searchHotel();
	}

	@When("Fill First Name{string} Fill Second Name{string}Fill Address {string}CreditCard Number{string}CreditCardType{string}Expiry DateMonth{string} and Expiry DateYear{string}cvv Number{string}Click BookNow get orderId")
	public void fill_First_Name_Fill_Second_Name_Fill_Address_CreditCard_Number_CreditCardType_Expiry_DateMonth_and_Expiry_DateYear_cvv_Number_Click_BookNow_get_orderId(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   BookAHotel b=new BookAHotel();
	   b.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}





}
