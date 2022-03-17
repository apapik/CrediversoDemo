package com.opensource.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	//OBJECTS
	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");
	By lnkWelcome = By.id("welcome");
	By lnkLogout = By.xpath("//a[contains(@href, 'logout')]");
	
	/*
	 * Login OrngeHRM
	 * @author: arturo.delgado
	 * @param: driver
	 * @return: N/A
	 * @throws: N/A
	 * @date: 10302021
	 */
	public void loginOrange(String url, String username, String password) {
		reporter("Login Orange & Enter username and password");
		launchBrowser(url);
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
		reporter("Click Login");
		waitForElementPresent(lnkWelcome);
		reporter("Verify User is logged successfully");
	}
	
	/*
	 * Logout
	 */
	public void logoutOrange() throws InterruptedException {
		reporter("Logout Orange HRM Portal...");
		click(lnkWelcome);
		Thread.sleep(2000);
		click(lnkLogout);
		implicitWait();
		closeBrowser();
	}

}
