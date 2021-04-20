package org.adactinStepDefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinTest extends BaseClass {

	@Given("enter {string} and {string}")
	public void enter_and(String name, String pass) throws InterruptedException {
		loadBrowser();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		//launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		implicitlyWait();
		AdactinPojo a = new AdactinPojo();
		a.getLogin().sendKeys(name);
		fill(a.getPass(), pass);
		a.getClkLogin().click();
	}
	@When("select location {string}")
	public void select_location(String loc) {
		AdactinPojo a=new AdactinPojo();
		implicitlyWait();
	    Select s=new Select(a.getLoc());
	    s.selectByVisibleText(loc);
	}

	@When("select Hotel{string}")
	public void select_Hotel(String hotel) {
		AdactinPojo a=new AdactinPojo();
		implicitlyWait();
	    Select s=new Select(a.getHotels());
	    s.selectByVisibleText(hotel);
	}

	@Then("RoomType {string}")
	public void roomtype(String roomType) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getRoomType());
	    implicitlyWait();
	    s.selectByVisibleText(roomType);
	}

	@Then("Number Of Rooms{string}")
	public void number_Of_Rooms(String NoOfRoom) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getRoomNum());
	    implicitlyWait();
	    s.selectByVisibleText(NoOfRoom);
	}

	@When("checkin Date{string}")
	public void checkin_Date(String checkIn) {
		AdactinPojo a=new AdactinPojo();
	    a.getCheckIn().clear();
	    fill(a.getCheckIn(), checkIn);
	  
	   
	}

	@When("checkOut Date{string}")
	public void checkout_Date(String checkOut) {
		AdactinPojo a=new AdactinPojo();
	    a.getCheckOut().clear();
	    fill(a.getCheckOut(), checkOut);
	}

	@When("AdeltsPerRoom{string}")
	public void adeltsperroom(String adultsCount) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getAdultRoom());
	    implicitlyWait();
	    s.selectByVisibleText(adultsCount);
	   
	}

	@When("ChildrensPerRoom{string}")
	public void childrensperroom(String childrenscount) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getChildRoom());
	    implicitlyWait();
	    s.selectByVisibleText(childrenscount);
	    
	}
	@When("click search button")
	public void click_search_button() {
	  AdactinPojo a= new AdactinPojo();
	  a.getSearch().click();
	  implicitlyWait();
	}

	@When("click radio button")
	public void click_radio_button() {
	    AdactinPojo a=new AdactinPojo();
	    a.getRadioBtn().click();
	    implicitlyWait();
	}

	@When("click Continue")
	public void click_Continue() {
	    AdactinPojo a=new AdactinPojo();
	    a.getContinu().click();
	    implicitlyWait();
	}

	@When("Fill First Name{string}")
	public void fill_First_Name(String string) {
	    AdactinPojo a=new AdactinPojo();
	    fill(a.getFstName(), string);
	}

	@When("Fill Second Name{string}")
	public void fill_Second_Name(String string) {
	    AdactinPojo a=new AdactinPojo();
	    fill(a.getLastName(), string);
	}

	@When("Fill Address {string}")
	public void fill_Address(String string) {
		 AdactinPojo a=new AdactinPojo();
		 fill(a.getAddress(), string);
	}

	@When("CreditCard Number{string}")
	public void creditcard_Number(String string) {
		 AdactinPojo a=new AdactinPojo();
		 fill(a.getCcNum(), string);
	}

	@When("CreditCardType{string}")
	public void creditcardtype(String string) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getCcType());
	    implicitlyWait();
	    s.selectByVisibleText(string);
	}

	@When("Expiry DateMonth{string} and Expiry DateYear{string}")
	public void expiry_DateMonth_and_Expiry_DateYear(String string, String string2) {
		AdactinPojo a=new AdactinPojo();
	    Select s=new Select(a.getMonth());
	    implicitlyWait();
	    s.selectByVisibleText(string);
	    AdactinPojo a1=new AdactinPojo();
	    Select s2=new Select(a1.getYear());
	    implicitlyWait();
	    s2.selectByVisibleText(string2);
	}

	@When("cvv Number{string}")
	public void cvv_Number(String string) {
	   AdactinPojo a=new AdactinPojo();
	   fill(a.getCcv(), string);
	   implicitlyWait();
	}

	@When("Click BookNow")
	public void click_BookNow(){
	   AdactinPojo a=new AdactinPojo();
	   a.getBook().click();
	 
	}
	@When("get orderId")
	public void get_orderId() throws InterruptedException {
	   AdactinPojo a=new AdactinPojo();
	   Thread.sleep(5000);
	   String ordNumber =a.getOrdNum().getAttribute("value"); 
	   System.out.println("order no:"+ordNumber);
	
	}

}
