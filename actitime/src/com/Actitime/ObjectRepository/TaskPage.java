package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
//Declaration
	@FindBy(xpath ="//div[.='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath ="//div=[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "(//input[@placeholder ='Enter Customer Name'])[2]")
	private WebElement custnametextfield;
	
	@FindBy(xpath = "//textarea[@placeholder = 'Enter Customer Description']")
	private WebElement custDescriptField;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement custCreatebtn;
	
	@FindBy(xpath = "(//div[.='Cancel'])[27]")
	private WebElement custCancelBtn;
	
	@FindBy(xpath="//div[.='+value']")
	private WebElement getText;
	
	
	//initiazation
	public TaskPage(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	//utilization
	
	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustnametextfield() {
		return custnametextfield;
	}

	public WebElement getCustDescriptField() {
		return custDescriptField;
	}

	public WebElement getCustCreatebtn() {
		return custCreatebtn;
	}

	public WebElement getCustCancelBtn() {
		return custCancelBtn;
	}
	
	
}
