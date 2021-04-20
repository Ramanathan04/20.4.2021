package org.adactinsd;

import org.adactinStepDefinition.AdactinPojo;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAHotel  extends BaseClass{
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
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
	public WebElement getOrdNum() {
		return ordNum;
	}
	public void bookHotel(String text1,String text2,String text3,String text4,String text5,String text6,String text7,String text8) {
		BookAHotel a=new BookAHotel();
		fill(a.getFstName(), text1);
		fill(a.getLastName(), text2);
		fill(a.getAddress(), text3);
		fill(a.getCcNum(), text4);
		Select s=new Select(a.getCcType());
		s.selectByVisibleText(text5);
		Select s1=new Select(a.getMonth());
		s1.selectByVisibleText(text6);
		Select s2=new Select(a.getYear());
		s2.selectByVisibleText(text7);
		fill(a.getCcv(), text8);
		a.getBook().click();
		String attribute = a.getOrdNum().getAttribute("value");
		System.out.println(attribute);
	}

}
