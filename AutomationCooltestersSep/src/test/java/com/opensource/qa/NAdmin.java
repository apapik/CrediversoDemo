package com.opensource.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NAdmin {

	String username, password;
	String usernotfound;
	String usernotfounsmsg;

	@BeforeTest
	public void beforeTest() {

		this.username = "Admin";
		this.password = "admin123";
		this.usernotfound = "XYZ";
		this.usernotfounsmsg = "No Records Found";
	}

	@Test
	public void TC001_Admin_SearchEmployee() throws InterruptedException {

		// Step1
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Reporter.log("Open Browser OrangeHRM web page");

		// Step2
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username and password");

		// Step3
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		Reporter.log("Validdate tht you have logged in successfully");

		// Step4
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
		Reporter.log("Click Admin - Go to the admin page");

		// Step5
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username search table");

		// Step6
		driver.findElement(By.id("searchBtn")).click();
		Reporter.log("Validdate that Admin exist");

		// Step7
		String actualValue = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, "Admin");
		Reporter.log("Verify username exist in table");

		// Step8
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Log out");

		// Step9
		driver.close();
		Reporter.log("Close Browser");

	}

	@Test
	public void TC002_Admin_SearchEmployee_NotExist() throws InterruptedException {

		// Step1
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Reporter.log("Open Browser OrangeHRM web page");

		// Step2
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username and password");

		// Step3
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
		Reporter.log("Validdate tht you have logged in successfully");

		// Step4
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
		Reporter.log("Click Admin - Go to the admin page");
		
		// Step5
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(usernotfound);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Enter Username search table");
		
		//Step6
		driver.findElement(By.id("searchBtn")).click();
		Reporter.log("Validdate that Admin exist");
		
		//Step7
		String actualValue = driver.findElement(By.xpath("//table/tbody/tr/td")).getText();
		Assert.assertEquals(actualValue, usernotfounsmsg);
		Reporter.log("Verify username does not exist in table");

		// Step8
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Log out");

		// Step9
		driver.close();
		Reporter.log("Close Browser");

	}

	@AfterTest
	public void afterTest() {
	}

}
