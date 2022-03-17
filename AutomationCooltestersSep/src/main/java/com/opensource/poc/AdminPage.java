package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class AdminPage extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);	
	}
	
	//OBJECTS
	By btnMenuAdmin = By.id("menu_admin_viewAdminModule");
	By txtSearchUsername = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsername = By.xpath("//table/tbody/tr[1]/td[2]");
	
	/*
	 * Click Admin
	 */
	public void clickAdmin() {
		reporter("Click Admin Module");
		click(btnMenuAdmin);
		implicitWait();
	}
	
	/*
	 * Search user
	 */
	public void searchUser(String username) {
		reporter("Searching..." + username);
		type(txtSearchUsername, username);
		takeScreenshot("searchbtn");
		click(btnSearch);
		implicitWait();
	}
	
	/*
	 * Validation exist user in table
	 */
	public void validationUsernameTable(String username) {
		reporter("Verify if this username "+username+ "exists in table");
		String actualValue = getText(tblUsername);
		assertEquals(actualValue, username);
	}

}
