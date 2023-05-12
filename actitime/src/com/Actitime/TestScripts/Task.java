package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;

public class Task extends BaseClass{
private static final String Sheet1 = null;

@Test
public void createCustomer() throws EncryptedDocumentException, IOException {
HomePage hp = new HomePage(w);
hp.getTskbtn().click();
TaskPage tp=new TaskPage(w);
tp.getAddbtn().click();
tp.getNewcust().click();

FileLibrary f = new FileLibrary();
String CreateCustomer = f.readDataFromExcel("Sheet1", 1, 1);
tp.getCustnametextfield().sendKeys(CreateCustomer);
String description = f.readDataFromExcel("Sheet1", 1, 2);
tp.getCustDescriptField().sendKeys(description);
String expectedresult = CreateCustomer;
String actualresult = w.findElement(By.xpath("(//div[.='hi'])")).getText();
SoftAssert s = new SoftAssert();
s.assertEquals(actualresult, expectedresult);
s.assertAll();

}
}
