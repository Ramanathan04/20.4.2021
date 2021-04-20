package org.adactinsd;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement login;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy (id="login")
	private WebElement ClkLogin;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClkLogin() {
		return ClkLogin;
	}
	
	public void Login(String text1,String text2) {
		fill(getLogin(), text1);
		fill(getPass(), text2);
		getClkLogin().click();
	}

}
