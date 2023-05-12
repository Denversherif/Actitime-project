package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//declaration
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tskbtn;
	 
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportbtn;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userbtn;
	
	@FindBy(id="LogoutLink")
	private WebElement lgout;

	//initialization
	public HomePage(WebDriver w) {
		PageFactory.initElements(w, this);
		
		
	
}

	public WebElement getTskbtn() {
		return tskbtn;
	}

	public WebElement getReportbtn() {
		return reportbtn;
	}

	public WebElement getUserbtn() {
		return userbtn;
	}

	public WebElement getLgout() {
		return lgout;
	}
}
