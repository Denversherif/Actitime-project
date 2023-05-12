package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.j2objc.annotations.Property;
/**
 * This is a generic class which contains all the generic class
 * @author Mayur
 *
 */
public class FileLibrary {
	/**
	 * This is a generic method which is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./Test Data/Auto.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
/**
 * this is a generic method which is used to read data form excel file
 * @param sheetname
 * @param row
 * @param cell
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcel(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1 =new  FileInputStream("./Test Data/TEST.DATA.xlsx");
Workbook wb=WorkbookFactory.create(fis1);
String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
return value;
}


}
