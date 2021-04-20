package org.adactinsd;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	@FindBy(id="continue")
	private WebElement continu;
	
	
	
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getContinu() {
		return continu;
	}
	public void searchHotel() throws InterruptedException {
		SelectHotel s=new SelectHotel();
		s.getRadioBtn().click();
		s.getContinu().click();
		Thread.sleep(5000);
		
	}

}
