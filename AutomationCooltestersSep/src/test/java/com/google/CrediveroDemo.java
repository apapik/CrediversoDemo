package com.google;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClasspageObjectmodel.BaseClass;
import pageobjectmodel.Home;
import pageobjectmodel.Login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class CrediveroDemo extends BaseClass {
	
public WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://crediverso.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		Reporter.log("Open Dev Crediverso web page");
	}

	@Test
	public void PrincipalTest() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Home Homepage = new Home(driver);
		Login LoginPage = new Login(driver);
		
		
		
		// Click Login in
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		//Homepage.LoginButton().click();
		
		ExecuteAction(Homepage.PopupButton(), "click", "");
		ExecuteAction(Homepage.LoginButton(),"click","");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		//driver.findElement(By.xpath("//*[@id=\"menu-item-12328\"]/a")).click();
		// driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		

		// Send data to login
		System.out.println("No time");
		LoginPage.EmailTextbox().click();
		System.out.println("No time on click");
		ExecuteAction(LoginPage.EmailTextbox(), "sendKeys", "apapik@hotmail.com");
		Thread.sleep(20);
		//LoginPage.EmailTextbox().sendKeys("apapik@hotmail.com");
		//driver.findElement(By.xpath("//div[@class='login__container']//input[@id='email']")).sendKeys("apapik@hotmail.com");
		
		LoginPage.PasswordTextbox();
		LoginPage.PasswordTextbox().sendKeys("Tiempo21###");
		//driver.findElement(By.xpath("//*[@id=\"fieldpassword\"]")).sendKeys("Tiempo21###");
		
		LoginPage.SubmitButton().click();
		//driver.findElement(By.xpath("//button[@class='login__submit_btn']")).click();

		// Espera implicita
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Espera explicita
		// WebDriverWait wait = new WebDriverWait(driver,15);
		// wait.until(ExpectedConditions.titleContains("Google"));

		// System.out.println();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}