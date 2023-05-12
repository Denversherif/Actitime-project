package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.LoginPage;

public class BaseClass {
	FileLibrary f = new FileLibrary();
	public static WebDriver w;
	
@BeforeSuite
public void dataBaseConnection(){
	Reporter.log("dataBase Connected",true);
}
@BeforeClass
public void launchBrowser() throws IOException {
	 w = new ChromeDriver();
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
String URL = f.readDataFromPropertyFile("url");
	w.get(URL);
	Reporter.log("Browser is launched",true);
	}
@BeforeMethod
public void login() throws IOException {
LoginPage lp = new LoginPage(w);
String un = f.readDataFromPropertyFile("username");
String pw = f.readDataFromPropertyFile("password");
lp.getUntbx().sendKeys(un);
lp.getPwtbx().sendKeys(pw);
lp.getLgbtn().click();
	Reporter.log("Login Successfull",true);
}
@AfterMethod
public void Logout() {
	HomePage hp = new HomePage(w);
	hp.getTskbtn().click();
	Reporter.log("Logout Successfull",true);
}
@AfterClass
public void chromeDriver() {
	w.close();
	Reporter.log("Browser is closed",true);
}
@AfterSuite
public void dataBaseDisconnected() {
	Reporter.log("DataBase is disconnected",true);
}
}
